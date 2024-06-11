package org.justin.condiment.thecondimentmod.item;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.block.custom.TomatoCropBlock;
import org.justin.condiment.thecondimentmod.entity.ModEntities;
import org.justin.condiment.thecondimentmod.entity.custom.MayoMonsterEntity;
import org.justin.condiment.thecondimentmod.fluid.ModFluid;
import org.justin.condiment.thecondimentmod.item.custom.ModArmorItem;
import org.justin.condiment.thecondimentmod.item.custom.TomatoProjectileItem;

public class ModItems {
    public static final DeferredRegister<Item> Items =
            DeferredRegister.create(ForgeRegistries.ITEMS,TheCondimentMod.MODID);
    public static final RegistryObject<Item> MAYO = Items.register("mayo",
            ()-> new Item(new Item.Properties().food(ModFoods.MAYO)));
    public static final RegistryObject<Item> RED_PEPPER = Items.register("red_pepper",
            () -> new Item(new Item.Properties().food(ModFoods.PEPPER)));
    public static final RegistryObject<Item> SMOKED_RED_PEPPER = Items.register("smoked_red_pepper",
            () -> new Item(new Item.Properties().food(ModFoods.PEPPER)));
    public static final RegistryObject<Item> RED_PEPPER_SEEDS = Items.register("red_pepper_seeds",
            () -> new ItemNameBlockItem(ModBlock.PEPPER_CROP.get(),new Item.Properties()));
    public static final RegistryObject<Item> PEPPER_HELM = Items.register("pepper_helmet",
            () -> new ModArmorItem(ModArmorMaterials.RED_PEPPER,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PEPPER_CHEST = Items.register("pepper_chest",
            () -> new ModArmorItem(ModArmorMaterials.RED_PEPPER,ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PEPPER_LEGS = Items.register("pepper_leggings",
            () -> new ModArmorItem(ModArmorMaterials.RED_PEPPER,ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PEPPER_BOOTS = Items.register("pepper_boots",
            () -> new ModArmorItem(ModArmorMaterials.RED_PEPPER,ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> BUCKET_OF_SRIRACHA = Items.register("bucket_of_sriracha",
            ()-> new BucketItem(ModFluid.SOURCE_SRIRACHA_LIQUID, new Item.Properties()));public static final RegistryObject<Item> BUCKET_O_MAYO = Items.register("bucket_o_mayo",
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

    public static final RegistryObject<Item> TOMATO = Items.register("tomato",
            ()-> new Item(new Item.Properties().food(ModFoods.Tomato)));
    public static final RegistryObject<Item> TOMATO_HELM = Items.register("tomato_helmet",
            () -> new ModArmorItem(ModArmorMaterials.TOMATO,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TOMATO_CHEST = Items.register("tomato_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.TOMATO,ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TOMATO_LEGS = Items.register("tomato_leggings",
            () -> new ModArmorItem(ModArmorMaterials.TOMATO,ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TOMATO_BOOTS = Items.register("tomato_boots",
            () -> new ModArmorItem(ModArmorMaterials.TOMATO,ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item>  TOMATO_SEEDS = Items.register("tomato_seeds",
            ()-> new ItemNameBlockItem(ModBlock.TOMATO_CROP.get(),new Item.Properties()));
    public static final RegistryObject<Item> MAYO_MONSTER_SPAWNEGG =Items.register("mayo_monster_spawnegg",
            ()-> new ForgeSpawnEggItem((ModEntities.MAYO_MONSTER),0xFFFFCC,0xFFFF99, new Item.Properties()));
    public static final RegistryObject<Item> THROWABLE_TOMATO = Items.register("throwable_tomato",
            () -> new TomatoProjectileItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        Items.register(eventBus);
    }
}
