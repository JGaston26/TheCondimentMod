package org.justin.condiment.thecondimentmod.datagen;

import net.minecraft.client.Minecraft;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.fml.common.Mod;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.item.ModFoods;
import org.justin.condiment.thecondimentmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
   private static final List<ItemLike> RED_PEPPER_SMELTABLES = List.of(ModItems.RED_PEPPER.get());
   private String name;

    public ModRecipeProvider(PackOutput p_248933_,String name) {
        super(p_248933_);
        this.name = name;
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {
        //Smelting,Blasting,and Cooking recipes
        //oreBlasting(p_251297_,RED_PEPPER_SMELTABLES,RecipeCategory.MISC,ModItems.RED_PEPPER.get(),0.25f,100,"smoked_red_pepper");
        //oreSmelting(p_251297_,RED_PEPPER_SMELTABLES,RecipeCategory.MISC,ModItems.RED_PEPPER.get(),0.25f,200,"smoked_red_pepper");
        smokerRecipies(p_251297_, Ingredient.of(ModItems.RED_PEPPER.get()), RecipeCategory.FOOD, ModItems.SMOKED_RED_PEPPER.get(), 0.35f, 100, "smoked_red_pepper");
        smeltingRecipies(p_251297_, Ingredient.of(ModItems.RED_PEPPER.get()), RecipeCategory.FOOD, ModItems.SMOKED_RED_PEPPER.get(), 0.35f, 200, "smoked_red_pepper");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.MAYO_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M',ModItems.MAYO.get())
                .unlockedBy(getHasName(ModItems.MAYO.get()),has(ModItems.MAYO.get()))
                .save(p_251297_, TheCondimentMod.MODID + "mayo_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MAYO.get(),9)
                .requires(ModBlock.MAYO_BLOCK.get())
                .unlockedBy(getHasName(ModBlock.MAYO_BLOCK.get()),has(ModBlock.MAYO_BLOCK.get()))
                .save(p_251297_,TheCondimentMod.MODID + "mayo_from_mayo_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MAYO.get(),1)
                .requires(Items.EGG)
                .requires(Items.GLOW_BERRIES)
                .requires(Items.WATER_BUCKET)
                .unlockedBy(getHasName(Items.EGG),has(Items.EGG))
                .save(p_251297_,TheCondimentMod.MODID + "mayo_from_ingredients");
        //Mayo Armor and Weapons Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MAYO_MACE.get())
                .pattern("IMI")
                .pattern("MSM")
                .pattern(" S ")
                .define('I',Items.IRON_INGOT)
                .define('M',ModItems.MAYO.get())
                .define('S',Items.STICK)
                .unlockedBy(getHasName(ModItems.MAYO.get()),has(ModItems.MAYO.get()))
                .save(p_251297_,TheCondimentMod.MODID + "mayo_mace");
       ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MAYO_HELM.get())
               .pattern("MMM")
               .pattern("M M")
               .define('M',ModItems.MAYO.get())
               .unlockedBy(getHasName(ModItems.MAYO.get()),has(ModItems.MAYO.get()))
               .save(p_251297_,TheCondimentMod.MODID + "mayo_helm");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MAYO_CHEST.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .define('M',ModItems.MAYO.get())
                .unlockedBy(getHasName(ModItems.MAYO.get()),has(ModItems.MAYO.get()))
                .save(p_251297_,TheCondimentMod.MODID + "mayo_chestplate");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MAYO_LEGS.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .define('M',ModItems.MAYO.get())
                .unlockedBy(getHasName(ModItems.MAYO.get()),has(ModItems.MAYO.get()))
                .save(p_251297_,TheCondimentMod.MODID + "mayo_leggings");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MAYO_BOOTS.get())
                .pattern("   ")
                .pattern("M M")
                .pattern("M M")
                .define('M',ModItems.MAYO.get())
                .unlockedBy(getHasName(ModItems.MAYO.get()),has(ModItems.MAYO.get()))
                .save(p_251297_,TheCondimentMod.MODID + "mayo_boots");

    }
    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> p_248775_, List<ItemLike> p_251504_, RecipeCategory p_248846_, ItemLike p_249735_, float p_248783_, int p_250303_, String p_251984_) {
        oreCooking(p_248775_, RecipeSerializer.BLASTING_RECIPE, p_251504_, p_248846_, p_249735_, p_248783_, p_250303_, p_251984_, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_).group(p_251450_).unlockedBy(getHasName(itemlike), has(itemlike)).save(p_250791_, TheCondimentMod.MODID + ":" +(p_250066_) + p_249236_ + "_" + getItemName(itemlike));
        }
    }
    protected static void smokerRecipies(Consumer<FinishedRecipe> consumer, Ingredient ingredient, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group) {
        SimpleCookingRecipeBuilder.generic(ingredient, category, result, experience, cookingTime, RecipeSerializer.SMOKING_RECIPE)
                .group(group)
                .unlockedBy("has_" + getItemName(ingredient.getItems()[0].getItem()), has(ingredient.getItems()[0].getItem()))
                .save(consumer, TheCondimentMod.MODID + ":" + getItemName(result) + "_smoking");
    }
    protected static void smeltingRecipies(Consumer<FinishedRecipe> consumer, Ingredient ingredient, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group) {
        SimpleCookingRecipeBuilder.generic(ingredient, category, result, experience, cookingTime, RecipeSerializer.SMOKING_RECIPE)
                .group(group)
                .unlockedBy("has_" + getItemName(ingredient.getItems()[0].getItem()), has(ingredient.getItems()[0].getItem()))
                .save(consumer, TheCondimentMod.MODID + ":" + getItemName(result) + "_smelting");
    }
    /*
    protected static void cookRecipes(Consumer<FinishedRecipe> p_126007_, String p_126008_, RecipeSerializer<? extends AbstractCookingRecipe> p_250529_, int p_126010_) {
        modCookingRecipe(p_126007_, p_126008_, p_250529_, p_126010_, ModItems.RED_PEPPER,ModItems.SMOKED_RED_PEPPER,0.35F);
    }
    protected static void modCookingRecipe(Consumer<FinishedRecipe> p_249398_, String p_249709_, RecipeSerializer<? extends AbstractCookingRecipe> p_251876_, int p_249258_, ItemLike p_250669_, ItemLike p_250224_, float p_252138_) {
        SimpleCookingRecipeBuilder.generic(Ingredient.of(p_250669_), RecipeCategory.FOOD, p_250224_, p_252138_, p_249258_, p_251876_).unlockedBy(getHasName(p_250669_), has(p_250669_)).save(p_249398_, getItemName(p_250224_) + "_from_" + p_249709_);
    }

     */
}
