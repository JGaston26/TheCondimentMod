package org.justin.condiment.thecondimentmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.entity.custom.MayoMonsterEntity;
import org.justin.condiment.thecondimentmod.entity.custom.TomatoProjectileEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheCondimentMod.MODID);
    public static final RegistryObject<EntityType<MayoMonsterEntity>> MAYO_MONSTER =
            ENTITY_TYPES.register("the_mayo_monster", () -> EntityType.Builder.of(
                    MayoMonsterEntity::new, MobCategory.MONSTER).sized(2.5f,2.5f).build("the_mayo_monster"));
    public static final RegistryObject<EntityType<TomatoProjectileEntity>> TOMATO_PROJECTILE =
            ENTITY_TYPES.register("tomato_projectile", () -> EntityType.Builder.<TomatoProjectileEntity>of(
                    TomatoProjectileEntity::new, MobCategory.MISC).sized(0.5f,0.5f).build("tomato_projectile"));
    public static void register(IEventBus event){
        ENTITY_TYPES.register(event);
    }
}
