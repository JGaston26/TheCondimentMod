package org.justin.condiment.thecondimentmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.justin.condiment.thecondimentmod.TheCondimentMod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = TheCondimentMod.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generators = event.getGenerator();
        PackOutput packOutput = generators.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generators.addProvider(event.includeServer(),new ModRecipeProvider(packOutput,TheCondimentMod.MODID));
        generators.addProvider(event.includeServer(),ModLootTableProvider.create(packOutput));

        generators.addProvider(event.includeClient(),new ModBlockStateProvider(packOutput,existingFileHelper));
        generators.addProvider(event.includeClient(),new ModItemModelGenerator(packOutput,existingFileHelper));

        ModBlockTagGenerator blockTagGenerator = generators.addProvider(event.includeServer(),
        new ModBlockTagGenerator(packOutput,lookupProvider,existingFileHelper));
        generators.addProvider(event.includeServer(),new ModItemTagGenerator(packOutput,lookupProvider,blockTagGenerator.contentsGetter(),existingFileHelper));

        generators.addProvider(event.includeServer(),new ModGlobalLootModifier(packOutput));
    }
}
