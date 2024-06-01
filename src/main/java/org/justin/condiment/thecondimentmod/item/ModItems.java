package org.justin.condiment.thecondimentmod.item;

import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.fluid.ModFluid;

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
    public static final RegistryObject<Item> MAYO_MACE = Items.register("mayo_mace",
            () -> new SwordItem(ModToolTiers.MAYO,8,2,new Item.Properties().stacksTo(1)));
    public static void register(IEventBus eventBus){
        Items.register(eventBus);
    }
}
