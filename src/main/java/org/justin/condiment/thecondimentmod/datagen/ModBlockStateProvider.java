package org.justin.condiment.thecondimentmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.block.custom.PepperCropBlock;
import org.justin.condiment.thecondimentmod.block.custom.TomatoCropBlock;
import org.slf4j.MDC;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider{

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TheCondimentMod.MODID , exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWihItem(ModBlock.MAYO_BLOCK);
        simpleBlock(ModBlock.THE_CONDIMENT_CREATOR.get(),
                new ModelFile.UncheckedModelFile("block/condimentcreatortexture.png"));
        makePepperCrop((CropBlock) ModBlock.PEPPER_CROP.get(), "red_pepper_stage","red_pepper_stage");
        makeTomatoCrop((CropBlock) ModBlock.TOMATO_CROP.get(),"tomato_stage","tomato_stage");
        logBlock((RotatedPillarBlock) ModBlock.MAYO_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlock.MAYO_WOOD.get(),blockTexture(ModBlock.MAYO_LOG.get()),blockTexture(ModBlock.MAYO_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlock.STRIPPED_MAYO_LOG.get(),blockTexture(ModBlock.STRIPPED_MAYO_LOG.get()),new ResourceLocation(TheCondimentMod.MODID,"block/stripped_mayo_log_top"));
        axisBlock((RotatedPillarBlock) ModBlock.STRIPPED_MAYO_WOOD.get(),blockTexture(ModBlock.STRIPPED_MAYO_LOG.get()),blockTexture(ModBlock.STRIPPED_MAYO_LOG.get()));
        blockItem(ModBlock.MAYO_WOOD);
        blockItem(ModBlock.MAYO_LOG);
        blockItem(ModBlock.STRIPPED_MAYO_LOG);
        blockItem(ModBlock.STRIPPED_MAYO_WOOD);
        blockWihItem(ModBlock.MAYO_PLANK);
        leavesBlock(ModBlock.MAYO_LEAVES);
        saplingBlock(ModBlock.MAYO_SAPLING);
    }
    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(TheCondimentMod.MODID+
                ":block/"+ ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    public void makePepperCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> pepperCropStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] pepperCropStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((PepperCropBlock) block).getAgeProperty()),
                new ResourceLocation(TheCondimentMod.MODID, "block/" + textureName + state.getValue(((PepperCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
    public void makeTomatoCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> tomatoCropStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] tomatoCropStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((TomatoCropBlock) block).getAgeProperty()),
                new ResourceLocation(TheCondimentMod.MODID, "block/" + textureName + state.getValue(((TomatoCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
    private void blockWihItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));
    }
}
