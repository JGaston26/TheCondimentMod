package org.justin.condiment.thecondimentmod.sound;

import net.minecraft.client.sounds.SoundEngine;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheCondimentMod.MODID);

    public static  RegistryObject<SoundEvent> registerSoundEvents(String name){
        return SOUNDS.register(name,()-> SoundEvent.createVariableRangeEvent(new ResourceLocation(TheCondimentMod.MODID,name)));

    }
    public static final RegistryObject<SoundEvent> MAYO_MONSTER_HIT = registerSoundEvents("mayo_monster_hit");
    public static final RegistryObject<SoundEvent> MAYO_MONSTER_AMBIENT = registerSoundEvents("mayo_monster_ambient");

    public static void register(IEventBus event){
        SOUNDS.register(event);
    }
}
