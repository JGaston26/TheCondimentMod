package org.justin.condiment.thecondimentmod.datagen;

import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelGenerator extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }
    public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TheCondimentMod.MODID, existingFileHelper);
    }

    private ItemModelBuilder handHeld(RegistryObject<Item>item){
        return withExistingParent(item.getId().getPath()
        ,new ResourceLocation("item/handheld")).texture("layer0",
        new ResourceLocation(TheCondimentMod.MODID,"item/"+item.getId().getPath()));
    }
    @Override
    protected void registerModels() {
        simpleItem(ModItems.MAYO);
        simpleItem(ModItems.RED_PEPPER);
        simpleItem(ModItems.SMOKED_RED_PEPPER);
        simpleItem(ModItems.BUCKET_O_MAYO);
        simpleItem(ModItems.RED_PEPPER_SEEDS);
        simpleItem(ModItems.TOMATO_SEEDS);
        simpleItem(ModItems.TOMATO);
        simpleItem(ModItems.MAYO_MONSTER_SPAWNEGG);
        simpleItem(ModItems.BUCKET_OF_SRIRACHA);
        simpleItem(ModItems.THROWABLE_TOMATO);
        saplingItem(ModBlock.MAYO_SAPLING);
        trimmedArmorItem(ModItems.MAYO_HELM);
        trimmedArmorItem(ModItems.MAYO_CHEST);
        trimmedArmorItem(ModItems.MAYO_LEGS);
        trimmedArmorItem(ModItems.MAYO_BOOTS);
        trimmedArmorItem(ModItems.PEPPER_HELM);
        trimmedArmorItem(ModItems.PEPPER_CHEST);
        trimmedArmorItem(ModItems.PEPPER_LEGS);
        trimmedArmorItem(ModItems.PEPPER_BOOTS);
        trimmedArmorItem(ModItems.TOMATO_HELM);
        trimmedArmorItem(ModItems.TOMATO_CHEST);
        trimmedArmorItem(ModItems.TOMATO_LEGS);
        trimmedArmorItem(ModItems.TOMATO_BOOTS);
    }
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
            final String MOD_ID = TheCondimentMod.MODID;
        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TheCondimentMod.MODID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TheCondimentMod.MODID,"item/" + item.getId().getPath()));
    }
}
