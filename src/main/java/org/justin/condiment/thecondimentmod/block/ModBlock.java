package org.justin.condiment.thecondimentmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.custom.CondimentCreatorBlock;
import org.justin.condiment.thecondimentmod.block.custom.ModFlammableRotatedPillarBlock;
import org.justin.condiment.thecondimentmod.block.custom.PepperCropBlock;
import org.justin.condiment.thecondimentmod.block.custom.TomatoCropBlock;
import org.justin.condiment.thecondimentmod.fluid.ModFluid;
import org.justin.condiment.thecondimentmod.item.ModItems;
import org.justin.condiment.thecondimentmod.worldgen.tree.MayoTreeGrowerClass;

import java.util.function.Supplier;

public class ModBlock {
    public static final DeferredRegister<Block> Block =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheCondimentMod.MODID);
    public static final RegistryObject<Block> MAYO_BLOCK = registerBlock("mayo_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<LiquidBlock> MAYO_LIQUID = registerBlock("mayo_liquid",
    () -> new LiquidBlock(ModFluid.SOURCE_MAYO_LIQUID,BlockBehaviour.Properties.copy(Blocks.WATER).sound(SoundType.SLIME_BLOCK)));
    public static final RegistryObject<LiquidBlock> SRIRACHA_LIQUID = registerBlock("sriracha_liquid",
            () -> new LiquidBlock(ModFluid.SOURCE_SRIRACHA_LIQUID,BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<Block> PEPPER_CROP = Block.register("red_pepper_crop",
            () -> new PepperCropBlock(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).noOcclusion().noCollission()));
    public static final RegistryObject<Block> TOMATO_CROP = Block.register("tomato_crop",
            () -> new TomatoCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> MAYO_WOOD = registerBlock("mayo_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> MAYO_LOG = registerBlock("mayo_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_MAYO_LOG = registerBlock("stripped_mayo_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_MAYO_WOOD = registerBlock("stripped_mayo_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> MAYO_PLANK = registerBlock("mayo_plank",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> MAYO_LEAVES = registerBlock("mayo_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

            });
    public static final RegistryObject<Block> MAYO_SAPLING = registerBlock("mayo_sapling",
            () -> new SaplingBlock(new MayoTreeGrowerClass(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T>block){
        RegistryObject<T> toReturn = Block.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item>registerBlockItem(String name, RegistryObject<T>block){
        return ModItems.Items.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        Block.register(eventBus);
    }
}
