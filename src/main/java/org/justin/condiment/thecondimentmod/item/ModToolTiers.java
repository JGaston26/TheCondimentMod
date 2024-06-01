package org.justin.condiment.thecondimentmod.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.minecraftforge.fml.common.Mod;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier MAYO = TierSortingRegistry.registerTier(
            new ForgeTier(4,1500,5f,4f,25,
                    ModTags.Blocks.NEEDS_MAYO_TOOL, () -> Ingredient.of(ModItems.MAYO.get())),
            new ResourceLocation(TheCondimentMod.MODID,"mayo"),List.of(Tiers.DIAMOND),List.of());
}
