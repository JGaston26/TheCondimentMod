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

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.RED_PEPPER.get()),
                RecipeCategory.FOOD,ModItems.SMOKED_RED_PEPPER.get(),
                0.35f,100).unlockedBy("has_red_pepper", has(ModItems.RED_PEPPER.get()))
                .save(p_251297_,TheCondimentMod.MODID + "smoked_red_pepper_from_smoking" );
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ModItems.RED_PEPPER.get()),
                        RecipeCategory.FOOD,ModItems.SMOKED_RED_PEPPER.get(),
                        0.35f,150).unlockedBy("has_red_pepper", has(ModItems.RED_PEPPER.get()))
                .save(p_251297_,TheCondimentMod.MODID + "smoked_red_pepper_from_campfire" );
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.RED_PEPPER.get()),
                        RecipeCategory.FOOD,ModItems.SMOKED_RED_PEPPER.get(),
                        0.35f,200).unlockedBy("has_red_pepper", has(ModItems.RED_PEPPER.get()))
                .save(p_251297_,TheCondimentMod.MODID + "smoked_red_pepper_from_smelting");

        //Crusting Table Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.MAYO_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M',ModItems.MAYO.get())
                .unlockedBy(getHasName(ModItems.MAYO.get()),has(ModItems.MAYO.get()))
                .save(p_251297_ , TheCondimentMod.MODID + "mayo_block");

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
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.PEPPER_PIKE.get())
                .pattern("PSP")
                .pattern("PS ")
                .pattern(" S ")
                .define('P',ModItems.RED_PEPPER.get())
                .define('S',Items.STICK)
                .unlockedBy(getHasName(ModItems.RED_PEPPER.get()),has(ModItems.RED_PEPPER.get()))
                .save(p_251297_,TheCondimentMod.MODID + "pepper_pike");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.PEPPER_HELM.get())
                .pattern("PPP")
                .pattern("P P")
                .define('P',ModItems.RED_PEPPER.get())
                .unlockedBy(getHasName(ModItems.RED_PEPPER.get()),has(ModItems.RED_PEPPER.get()))
                .save(p_251297_,TheCondimentMod.MODID +"pepper_helmet");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.PEPPER_CHEST.get())
                .pattern("PWP")
                .pattern("PWP")
                .pattern("WWW")
                .define('P',ModItems.RED_PEPPER.get())
                .define('W',Items.WHITE_WOOL)
                .unlockedBy(getHasName(ModItems.RED_PEPPER.get()),has(ModItems.RED_PEPPER.get()))
                .save(p_251297_,TheCondimentMod.MODID +"pepper_chestplate");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.PEPPER_LEGS.get())
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .define('P',ModItems.RED_PEPPER.get())
                .unlockedBy(getHasName(ModItems.RED_PEPPER.get()),has(ModItems.RED_PEPPER.get()))
                .save(p_251297_,TheCondimentMod.MODID +"pepper_leggings");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.PEPPER_BOOTS.get())
                .pattern("   ")
                .pattern("P P")
                .pattern("P P")
                .define('P',ModItems.RED_PEPPER.get())
                .unlockedBy(getHasName(ModItems.RED_PEPPER.get()),has(ModItems.RED_PEPPER.get()))
                .save(p_251297_,TheCondimentMod.MODID +"pepper_boots");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.RED_PEPPER.get())
                .pattern("   ")
                .pattern(" A ")
                .pattern(" L ")
                .define('A', Items.APPLE)
                .define('L',Items.LAVA_BUCKET)
                .unlockedBy(getHasName(Items.APPLE),has(Items.APPLE))
                .save(p_251297_,TheCondimentMod.MODID +"pepper_crafting");
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.TOMATO_HELM.get())
                .pattern("TTT")
                .pattern("T T")
                .define('T',ModItems.TOMATO.get())
                .unlockedBy(getHasName(ModItems.TOMATO.get()),has(ModItems.TOMATO.get()))
                .save(p_251297_,TheCondimentMod.MODID +"tomato_helmet");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.TOMATO_CHEST.get())
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .define('T',ModItems.TOMATO.get())
                .unlockedBy(getHasName(ModItems.TOMATO.get()),has(ModItems.TOMATO.get()))
                .save(p_251297_,TheCondimentMod.MODID +"tomato_chestplate");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.TOMATO_LEGS.get())
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .define('T',ModItems.TOMATO.get())
                .unlockedBy(getHasName(ModItems.TOMATO.get()),has(ModItems.TOMATO.get()))
                .save(p_251297_,TheCondimentMod.MODID +"tomato_leggings");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.TOMATO_BOOTS.get())
                .pattern("   ")
                .pattern("T T")
                .pattern("T T")
                .define('T',ModItems.TOMATO.get())
                .unlockedBy(getHasName(ModItems.TOMATO.get()),has(ModItems.TOMATO.get()))
                .save(p_251297_,TheCondimentMod.MODID +"tomato_boots");

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

}
