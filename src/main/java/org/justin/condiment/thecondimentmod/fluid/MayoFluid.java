package org.justin.condiment.thecondimentmod.fluid;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.item.ModItems;

public abstract class MayoFluid extends ForgeFlowingFluid {
    public static final Properties PROPERTIES = new Properties(() -> ModFluidTypes.MAYO_LIQUID_TYPE.get(), () -> ModFluid.SOURCE_MAYO_LIQUID.get(), () -> ModFluid.FLOWING_MAYO_LIQUID.get())
            .explosionResistance(100f).tickRate(26).bucket(() -> ModItems.BUCKET_O_MAYO.get()).block(() -> (LiquidBlock) ModBlock.MAYO_BLOCK.get());

    private MayoFluid() {
        super(PROPERTIES);
    }

    public static class Source extends MayoFluid {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    public static class Flowing extends MayoFluid {
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }
}
