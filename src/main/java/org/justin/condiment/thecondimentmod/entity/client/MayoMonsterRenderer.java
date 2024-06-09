package org.justin.condiment.thecondimentmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.entity.custom.MayoMonsterEntity;

public class MayoMonsterRenderer extends MobRenderer<MayoMonsterEntity,TheMayoMonsterModel<MayoMonsterEntity>> {
    public MayoMonsterRenderer(EntityRendererProvider.Context p_174304_) {
        super(p_174304_, new TheMayoMonsterModel<>(p_174304_.bakeLayer(ModModelLayers.MAYO_MONSTER_LAYER)),2f);
    }

    @Override
    public ResourceLocation getTextureLocation(MayoMonsterEntity p_114482_) {
        return new ResourceLocation(TheCondimentMod.MODID,"textures/entity/mayomonstertexture.png");
    }

    @Override
    public void render(MayoMonsterEntity p_115455_, float p_115456_, float p_115457_, PoseStack p_115458_, MultiBufferSource p_115459_, int p_115460_) {
        if(p_115455_.isAlive()){
            p_115458_.scale(5f, 5f, 5f);
        }
        super.render(p_115455_, p_115456_, p_115457_, p_115458_, p_115459_, p_115460_);
    }


}
