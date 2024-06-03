package org.justin.condiment.thecondimentmod.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.fluid.ModFluid;
import org.justin.condiment.thecondimentmod.item.custom.ModArmorItem;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS,TheCondimentMod.MODID);
    public static final RegistryObject<Item> MAYO = Items.register("mayo",
            ()-> new Item(new Item.Properties().food(ModFoods.MAYO)));
    public static final RegistryObject<Item> RED_PEPPER = Items.register("red_pepper",
            () -> new Item(new Item.Properties().food(ModFoods.PEPPER)));
    public static final RegistryObject<Item> SMOKED_RED_PEPPER = Items.register("smoked_red_pepper",
            () -> new Item(new Item.Properties().food(ModFoods.PEPPER)));
    public static final RegistryObject<Item> BUCKET_O_MAYO = Items.register("bucket_o_mayo",
            ()-> new BucketItem(ModFluid.SOURCE_MAYO_LIQUID, new Item.Properties()));
    public static final RegistryObject<Item> PEPPER_PIKE = Items.register("pepper_pike",
            () -> new SwordItem(ModToolTiers.PEPPER,7,1,new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAYO_MACE = Items.register("a_mayo_mace",
            () -> new SwordItem(ModToolTiers.MAYO,8,2,new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAYO_HELM = Items.register("mayo_helmet",
            () -> new ModArmorItem(ModArmorMaterials.MAYO,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MAYO_CHEST = Items.register("mayo_chest",
            () -> new ModArmorItem(ModArmorMaterials.MAYO,ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MAYO_LEGS = Items.register("mayo_leggings",
            () -> new ModArmorItem(ModArmorMaterials.MAYO,ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MAYO_BOOTS = Items.register("mayo_boots",
            () -> new ModArmorItem(ModArmorMaterials.MAYO,ArmorItem.Type.BOOTS, new Item.Properties()));
    public static void register(IEventBus eventBus){
        Items.register(eventBus);
    }
}
