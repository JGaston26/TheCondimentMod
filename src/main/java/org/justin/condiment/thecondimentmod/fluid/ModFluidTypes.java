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
    public static final ResourceLocation SRIRACHA_STILL_RL = new ResourceLocation(TheCondimentMod.MODID,"block/sriracha_still");
    public static final ResourceLocation SRIRACHA_FLOWING_RL = new ResourceLocation(TheCondimentMod.MODID,"block/sriracha_flowing");
    public static final ResourceLocation SRIRACHA_OVERLAY_RL = new ResourceLocation(TheCondimentMod.MODID,"misc/in_sriracha_liquid");


    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES,TheCondimentMod.MODID);

    public static RegistryObject<FluidType> MAYO_REGISTER(String name, FluidType.Properties properties){
        return FLUID_TYPES.register(name,
                () -> new BaseFluidType(MAYO_STILL_RL, MAYO_FLOWING_RL,MAYO_OVERLAY_RL,0xFDFFCD,new Vector3f(
                        253f /255f, 255f/255f, 205f/255f),properties));
    }
    public static RegistryObject<FluidType> SRIRACHA_REGISTER(String name, FluidType.Properties properties){
       return FLUID_TYPES.register(name, ()-> new BaseFluidType(SRIRACHA_STILL_RL,SRIRACHA_FLOWING_RL,SRIRACHA_OVERLAY_RL,0xFF0000,
                new Vector3f(255f/255f,0f/255f,0f/255f),properties));
    }
    public static final RegistryObject<FluidType> MAYO_LIQUID_TYPE = MAYO_REGISTER("mayo_liquid",
            FluidType.Properties.create().density(5).viscosity(10).lightLevel(2).sound(SoundAction.get("drink"),
                    SoundEvents.HONEY_DRINK));
    public static final RegistryObject<FluidType> SRIRACHA_LIQUID_TYPE = SRIRACHA_REGISTER("sriracha",
            FluidType.Properties.create().density(2).viscosity(15).lightLevel(2).sound(SoundAction.get("drink"),
                    SoundEvents.BLASTFURNACE_FIRE_CRACKLE));


    public static void register(IEventBus eventBus){
        FLUID_TYPES.register(eventBus);
    }
}
