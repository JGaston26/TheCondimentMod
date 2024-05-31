package org.justin.condiment.thecondimentmod.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;

public class ModFluidTypes {
    public static final ResourceLocation MAYO_STILL_RL = new ResourceLocation(TheCondimentMod.MODID,"block/mayo_still");
    public static final ResourceLocation MAYO_FLOWING_RL = new ResourceLocation(TheCondimentMod.MODID,"block/mayo_liquid");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES,TheCondimentMod.MODID);

    public static RegistryObject<FluidType> register(String name, FluidType.Properties properties){
        return FLUID_TYPES.register(name,
                () -> new BaseFluidType(properties,MAYO_STILL_RL, MAYO_FLOWING_RL));
    }
    public static final RegistryObject<FluidType> MAYO_LIQUID_TYPE = register("mayo_liquid",
            FluidType.Properties.create().density(20).viscosity(10).lightLevel(8).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));

    public static void register(IEventBus eventBus){
        FLUID_TYPES.register(eventBus);
    }
}
