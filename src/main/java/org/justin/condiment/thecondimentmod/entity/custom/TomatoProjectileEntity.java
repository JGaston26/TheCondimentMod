package org.justin.condiment.thecondimentmod.entity.custom;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import org.justin.condiment.thecondimentmod.entity.ModEntities;

public class TomatoProjectileEntity extends ThrowableItemProjectile{
    public TomatoProjectileEntity(EntityType<? extends ThrowableItemProjectile> p_37442_, Level p_37443_) {
        super(p_37442_, p_37443_);
    }
    public TomatoProjectileEntity( Level p_37443_) {
            super(ModEntities.TOMATO_PROJECTILE.get(),p_37443_);
    }
    public TomatoProjectileEntity(Level p_37443_, LivingEntity livingEntity) {
        super (ModEntities.TOMATO_PROJECTILE.get(), livingEntity,p_37443_);
    }

    @Override
    protected Item getDefaultItem() {
        return null;
    }

    @Override
    protected void onHitEntity(EntityHitResult p_37259_) {
        if(!this.level().isClientSide()){
            Entity entity = p_37259_.getEntity();
            Entity entity1 = this.getOwner();
            if(!entity.hurt(this.damageSources().explosion(this,entity1),9.0F)){
                this.level().broadcastDamageEvent(this,damageSources().explosion(this,p_37259_.getEntity()));
            }
        }
        super.onHitEntity(p_37259_);
    }
    protected void onHit(HitResult p_37628_) {
        super.onHit(p_37628_);
        if (!this.level().isClientSide) {
            this.level().explode(this, this.getX(), this.getY(), this.getZ(), 7.0F, false, Level.ExplosionInteraction.MOB);
            this.discard();
        }
    }
}
