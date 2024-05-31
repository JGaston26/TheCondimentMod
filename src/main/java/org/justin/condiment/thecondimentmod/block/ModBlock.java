package org.justin.condiment.thecondimentmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.fluid.ModFluid;
import org.justin.condiment.thecondimentmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> Blocks =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheCondimentMod.MODID);
    public static final RegistryObject<Block> MAYO_BLOCK = registerBlock("mayo_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_BLOCK).sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<LiquidBlock> MAYO_LIQUID = registerBlock("mayo_liquid",
    () -> new LiquidBlock(ModFluid.SOURCE_MAYO_LIQUID,BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.WATER).sound(SoundType.SLIME_BLOCK)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T>block){
        RegistryObject<T> toReturn = Blocks.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item>registerBlockItem(String name, RegistryObject<T>block){
        return ModItems.Items.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        Blocks.register(eventBus);
    }
}
