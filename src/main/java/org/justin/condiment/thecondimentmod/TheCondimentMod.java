package org.justin.condiment.thecondimentmod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.entity.ModEntities;
import org.justin.condiment.thecondimentmod.entity.client.MayoMonsterRenderer;
import org.justin.condiment.thecondimentmod.fluid.ModFluid;
import org.justin.condiment.thecondimentmod.fluid.ModFluidTypes;
import org.justin.condiment.thecondimentmod.item.ModCreativeModeTabs;
import org.justin.condiment.thecondimentmod.item.ModItems;
import org.justin.condiment.thecondimentmod.loot.ModLootModifiers;
import org.justin.condiment.thecondimentmod.sound.ModSounds;
import org.justin.condiment.thecondimentmod.worldgen.biome.ModTerrablender;
import org.justin.condiment.thecondimentmod.worldgen.biome.surface.ModSurfaceRules;
import org.slf4j.Logger;
import terrablender.api.SurfaceRuleManager;
import terrablender.core.TerraBlender;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TheCondimentMod.MODID)
public class TheCondimentMod {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "thecondimentmod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    public TheCondimentMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModBlock.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModFluid.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModEntities.register(modEventBus);
        ModSounds.register(modEventBus);
        ModTerrablender.registerBiomes();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MODID, ModSurfaceRules.makeRules());
        });
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
        LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        if (Config.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", ForgeRegistries.BLOCKS.getKey(Blocks.DIRT));

        LOGGER.info(Config.magicNumberIntroduction + Config.magicNumber);

        Config.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {}
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());

            EntityRenderers.register(ModEntities.MAYO_MONSTER.get(), MayoMonsterRenderer::new);
            EntityRenderers.register(ModEntities.TOMATO_PROJECTILE.get(), ThrownItemRenderer::new);


            //ItemBlockRenderTypes.setRenderLayer(ModFluid.SOURCE_MAYO_LIQUID.get(), RenderType.);
            //ItemBlockRenderTypes.setRenderLayer(ModFluid.FLOWING_MAYO_LIQUID.get(), RenderType.translucent());
        }
    }
}
