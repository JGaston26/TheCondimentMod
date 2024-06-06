package org.justin.condiment.thecondimentmod.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.justin.condiment.thecondimentmod.TheCondimentMod;

import java.util.function.Supplier;

public enum ModArmorMaterials  implements ArmorMaterial {
    MAYO("mayo",26,new int[]{5,7,5,4},25,
            SoundEvents.HONEY_BLOCK_PLACE,1f,0f,()-> Ingredient.of(ModItems.MAYO.get())),
    RED_PEPPER("pepper",25,new int[]{6,9,6,5},26,
            SoundEvents.BLAZE_BURN,1f,1f,()-> Ingredient.of(ModItems.RED_PEPPER.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResisance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {9,15,10,8};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResisance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResisance = knockbackResisance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type p_266807_) {
        return BASE_DURABILITY[p_266807_.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type p_267168_) {
        return this.protectionAmounts[p_267168_.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return TheCondimentMod.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResisance;
    }
}

