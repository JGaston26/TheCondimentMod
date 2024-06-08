package org.justin.condiment.thecondimentmod.datagen.loot;

import com.mojang.blaze3d.shaders.Uniform;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import org.justin.condiment.thecondimentmod.block.custom.PepperCropBlock;
import org.justin.condiment.thecondimentmod.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlock.MAYO_BLOCK.get());
        this.dropSelf(ModBlock.MAYO_LIQUID.get());
        this.dropSelf(ModBlock.SRIRACHA_LIQUID.get());
        LootItemCondition.Builder Pepperlootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlock.PEPPER_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PepperCropBlock.AGE, 4));
        LootItemCondition.Builder Tomatolootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlock.TOMATO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PepperCropBlock.AGE, 4));

        this.add(ModBlock.PEPPER_CROP.get(), createCropDrops(ModBlock.PEPPER_CROP.get(), ModItems.RED_PEPPER.get(),
                ModItems.RED_PEPPER_SEEDS.get(), Pepperlootitemcondition$builder));

        this.add(ModBlock.TOMATO_CROP.get(),createCropDrops(ModBlock.TOMATO_CROP.get(), ModItems.TOMATO.get(),
                ModItems.TOMATO_SEEDS.get(),Tomatolootitemcondition$builder));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item){
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F,5.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE)));
    }
    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlock.Block.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
