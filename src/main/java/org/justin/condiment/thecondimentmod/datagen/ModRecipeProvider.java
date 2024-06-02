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
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
   private static final List<ItemLike> RED_PEPPER_SMELTABLES = List.of(ModItems.RED_PEPPER.get());

    public ModRecipeProvider(PackOutput p_248933_) {
        super(p_248933_);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {
        oreBlasting(p_251297_,RED_PEPPER_SMELTABLES,RecipeCategory.MISC,ModItems.RED_PEPPER.get(),0.25f,100,"smokedredpepper");
        oreSmelting(p_251297_,RED_PEPPER_SMELTABLES,RecipeCategory.MISC,ModItems.RED_PEPPER.get(),0.25f,200,"smokedredpepper");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlock.MAYO_BLOCK.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .define('M',ModItems.MAYO.get())
                .unlockedBy(getHasName(ModItems.MAYO.get()),has(ModItems.MAYO.get()));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC,ModItems.MAYO.get(),9)
                .requires(ModBlock.MAYO_BLOCK.get())
                .unlockedBy(getHasName(ModBlock.MAYO_BLOCK.get()),has(ModBlock.MAYO_BLOCK.get()));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,ModItems.MAYO.get())
                .pattern("-E-")
                .pattern("-G-")
                .pattern("-W-")
                .define('E', Items.EGG.asItem())
                .define('G',Items.GLOW_BERRIES.asItem())
                .define('W',Items.WATER_BUCKET.asItem())
                .unlockedBy(getHasName(ModItems.MAYO.get()),has(ModItems.MAYO.get()));
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
