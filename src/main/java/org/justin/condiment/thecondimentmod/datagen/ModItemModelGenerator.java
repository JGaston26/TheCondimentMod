package org.justin.condiment.thecondimentmod.datagen;

import net.minecraft.client.renderer.block.model.ItemModelGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.item.ModItems;

public class ModItemModelGenerator extends ItemModelProvider {

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
        handHeld(ModItems.MAYO_MACE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(TheCondimentMod.MODID,"item/" + item.getId().getPath()));
    }
}
