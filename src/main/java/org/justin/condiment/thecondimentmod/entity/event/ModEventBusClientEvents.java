package org.justin.condiment.thecondimentmod.entity.event;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.entity.client.ModModelLayers;
import org.justin.condiment.thecondimentmod.entity.client.TheMayoMonsterModel;

@Mod.EventBusSubscriber(modid = TheCondimentMod.MODID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.MAYO_MONSTER_LAYER, TheMayoMonsterModel::createBodyLayer);
    }

}
