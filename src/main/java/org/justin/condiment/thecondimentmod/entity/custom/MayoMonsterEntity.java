package org.justin.condiment.thecondimentmod.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.checkerframework.checker.units.qual.A;

public class MayoMonsterEntity extends Monster {
    public MayoMonsterEntity(EntityType<? extends Monster> p_33002_, Level p_33003_) {
        super(p_33002_, p_33003_);
    }
    public static AttributeSupplier.Builder createAtributes(){
        return Monster.createMonsterAttributes()
                .add(Attributes.ATTACK_DAMAGE,7f)
                .add(Attributes.ARMOR,0.5f)
                .add(Attributes.MOVEMENT_SPEED,0.25f)
                .add(Attributes.MAX_HEALTH,150)
                .add(Attributes.ARMOR_TOUGHNESS,0.1f)
                //.add(Attributes.FOLLOW_RANGE,9f)
                .add(Attributes.ATTACK_KNOCKBACK,1f);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1,new FloatGoal(this));
        this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 0.8D));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
    }
}
