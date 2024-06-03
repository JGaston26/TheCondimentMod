package org.justin.condiment.thecondimentmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import org.justin.condiment.thecondimentmod.TheCondimentMod;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> NEEDS_MAYO_TOOL = tag("needs_mayo_tool");
        public static final TagKey<Block> NEEDS_PEPPER_TOOL = tag("needs_pepper_tool");
        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(TheCondimentMod.MODID,name));
        }
    }
    public static class Items{
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(TheCondimentMod.MODID,name));
        }
    }

}
