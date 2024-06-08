package org.justin.condiment.thecondimentmod.fluid;

import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.item.ModItems;

public abstract class ModFluid  {
      public static final DeferredRegister<Fluid> FLUIDS =
              DeferredRegister.create(ForgeRegistries.FLUIDS, TheCondimentMod.MODID);

      public static final RegistryObject<FlowingFluid> SOURCE_MAYO_LIQUID = FLUIDS.register("mayo_liquid_fluid",
              () -> new ForgeFlowingFluid.Source(ModFluid.MAYO_LIQUID_FLUID_PROPERTIES));
      public static final RegistryObject<FlowingFluid> FLOWING_MAYO_LIQUID = FLUIDS.register("flowing_mayo_liquid",
              () -> new ForgeFlowingFluid.Flowing(ModFluid.MAYO_LIQUID_FLUID_PROPERTIES));
      public static final ForgeFlowingFluid.Properties MAYO_LIQUID_FLUID_PROPERTIES =  new ForgeFlowingFluid.Properties(
              ModFluidTypes.MAYO_LIQUID_TYPE,SOURCE_MAYO_LIQUID,FLOWING_MAYO_LIQUID)
              .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlock.MAYO_LIQUID).bucket(ModItems.BUCKET_O_MAYO);


      public static final RegistryObject<FlowingFluid> SOURCE_SRIRACHA_LIQUID = FLUIDS.register("sriracha_liquid_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluid.SRIRACHA_LIQUID_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_SRIRACHA_LIQUID = FLUIDS.register("flowing_sriracha_liquid",
            () -> new ForgeFlowingFluid.Flowing(ModFluid.SRIRACHA_LIQUID_FLUID_PROPERTIES));

    public static final ForgeFlowingFluid.Properties SRIRACHA_LIQUID_FLUID_PROPERTIES =  new ForgeFlowingFluid.Properties(
            ModFluidTypes.SRIRACHA_LIQUID_TYPE,SOURCE_SRIRACHA_LIQUID,FLOWING_SRIRACHA_LIQUID)
            .slopeFindDistance(5).levelDecreasePerBlock(4).block(ModBlock.SRIRACHA_LIQUID).bucket(ModItems.BUCKET_OF_SRIRACHA);

    public static void register(IEventBus eventBus){
          FLUIDS.register(eventBus);
      }
    }

