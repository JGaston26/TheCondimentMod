package org.justin.condiment.thecondimentmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TheCondimentMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlock.MAYO_BLOCK.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlock.MAYO_BLOCK.get());
        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);
        this.tag(ModTags.Blocks.NEEDS_MAYO_TOOL);
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlock.MAYO_LOG.get())
                .add(ModBlock.STRIPPED_MAYO_LOG.get())
                .add(ModBlock.STRIPPED_MAYO_WOOD.get());
        this.tag(BlockTags.PLANKS)
                .add(ModBlock.MAYO_PLANK.get());
        this.tag(BlockTags.LEAVES)
                .add(ModBlock.MAYO_LEAVES.get());
    }
}
