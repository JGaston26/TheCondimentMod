package org.justin.condiment.thecondimentmod.worldgen.biome;

import net.minecraft.resources.ResourceLocation;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(TheCondimentMod.MODID, "overworld"), 5));
    }
}
