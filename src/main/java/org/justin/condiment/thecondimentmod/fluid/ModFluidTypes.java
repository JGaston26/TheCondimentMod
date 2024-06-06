package org.justin.condiment.thecondimentmod.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.SoundAction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.joml.Vector3f;
import org.justin.condiment.thecondimentmod.TheCondimentMod;

public class ModFluidTypes {
    public static final ResourceLocation MAYO_STILL_RL = new ResourceLocation(TheCondimentMod.MODID,"block/mayo_still");
    public static final ResourceLocation MAYO_FLOWING_RL = new ResourceLocation(TheCondimentMod.MODID,"block/mayo_liquid");
    public static final ResourceLocation MAYO_OVERLAY_RL = new ResourceLocation(TheCondimentMod.MODID,"misc/in_mayo_liquid");

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES,TheCondimentMod.MODID);

    public static RegistryObject<FluidType> register(String name, FluidType.Properties properties){
        return FLUID_TYPES.register(name,
                () -> new BaseFluidType(MAYO_STILL_RL, MAYO_FLOWING_RL,MAYO_OVERLAY_RL,0xb3b8a3,new Vector3f(
                        179f /255f, 184f/255f, 163f/255f),properties));
    }
    public static final RegistryObject<FluidType> MAYO_LIQUID_TYPE = register("mayo_liquid",
            FluidType.Properties.create().density(5).viscosity(10).lightLevel(2).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));

    public static void register(IEventBus eventBus){
        FLUID_TYPES.register(eventBus);
    }
}
