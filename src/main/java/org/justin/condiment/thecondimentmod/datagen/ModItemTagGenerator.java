package org.justin.condiment.thecondimentmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, TheCondimentMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MAYO_HELM.get(),
                ModItems.MAYO_CHEST.get(),
                ModItems.MAYO_LEGS.get(),
                ModItems.MAYO_BOOTS.get());
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PEPPER_HELM.get(),
                ModItems.PEPPER_CHEST.get(),
                ModItems.PEPPER_LEGS.get(),
                ModItems.PEPPER_BOOTS.get());
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TOMATO_HELM.get(),
                ModItems.TOMATO_CHEST.get(),
                ModItems.TOMATO_LEGS.get(),
                ModItems.TOMATO_BOOTS.get());


    }
}
