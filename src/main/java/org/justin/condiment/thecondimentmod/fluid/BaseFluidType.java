package org.justin.condiment.thecondimentmod.fluid;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.fluids.FluidType;

import java.util.function.Consumer;

public class BaseFluidType extends FluidType {
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;

    public BaseFluidType(Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture) {
        super(properties);
        this.stillTexture = stillTexture;
        this.flowingTexture = flowingTexture;
    }
     public ResourceLocation getStillTexture(){
        return stillTexture;
     }
     public ResourceLocation getFlowingTexture(){
        return flowingTexture;
     }
     @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer){
        consumer.accept(new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getStillTexture() {
                return BaseFluidType.this.getStillTexture();
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return BaseFluidType.this.getFlowingTexture();
            }

        });
     }
}