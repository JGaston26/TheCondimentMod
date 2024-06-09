package org.justin.condiment.thecondimentmod.entity.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.entity.ModEntities;
import org.justin.condiment.thecondimentmod.entity.client.TheMayoMonsterModel;
import org.justin.condiment.thecondimentmod.entity.custom.MayoMonsterEntity;

@Mod.EventBusSubscriber(modid = TheCondimentMod.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.MAYO_MONSTER.get(), MayoMonsterEntity.createAtributes().build());
    }
}
