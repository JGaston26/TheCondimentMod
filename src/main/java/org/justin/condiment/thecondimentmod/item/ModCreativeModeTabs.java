package org.justin.condiment.thecondimentmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.ModBlock;
import org.justin.condiment.thecondimentmod.TheCondimentMod;
import org.justin.condiment.thecondimentmod.block.ModBlock;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheCondimentMod.MODID);
    public static final RegistryObject<CreativeModeTab> CONDIMENT_MOD_TAB = CREATIVE_MODE_TAB.register("condiment_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MAYO.get()))
                    .title(Component.translatable("creative.condiment_mod_tab"))
                    .displayItems((p_270258_, p_259752_) -> {
                        p_259752_.accept(ModItems.MAYO.get());
                        p_259752_.accept(ModBlock.MAYO_BLOCK.get());
                        p_259752_.accept(ModItems.BUCKET_O_MAYO.get());
                        p_259752_.accept(ModItems.MAYO_MACE.get());
                        p_259752_.accept(ModItems.MAYO_HELM.get());
                        p_259752_.accept(ModItems.MAYO_CHEST.get());
                        p_259752_.accept(ModItems.MAYO_LEGS.get());
                        p_259752_.accept(ModItems.MAYO_BOOTS.get());
                        p_259752_.accept(ModItems.RED_PEPPER.get());
                        p_259752_.accept(ModItems.PEPPER_PIKE.get());
                        p_259752_.accept(ModItems.PEPPER_HELM.get());
                        p_259752_.accept(ModItems.PEPPER_CHEST.get());
                        p_259752_.accept(ModItems.PEPPER_LEGS.get());
                        p_259752_.accept(ModItems.PEPPER_BOOTS.get());

                    })
                    .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
