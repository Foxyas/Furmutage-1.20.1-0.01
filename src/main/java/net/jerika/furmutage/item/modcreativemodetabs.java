package net.jerika.furmutage.item;

import net.jerika.furmutage.block.ModBlocks;
import net.jerika.furmutage.furmutage;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class modcreativemodetabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, furmutage.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FURMUTAGE_TAB = CREATIVE_MODE_TABS.register("furmutage",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.THUNDERIUM.get()))
                    .title(Component.translatable("creativetab.furmutage"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.THUNDERIUM.get());
                        output.accept(ModItems.ROSELIGHT.get());
                        output.accept(ModItems.TSC_FIBER.get());
                        output.accept(ModItems.RUBBER.get());
                        output.accept(ModItems.TSC_GLOVES.get());
                        output.accept(ModItems.TSC_RUBBER_SHOE_PADS.get());
                        output.accept(ModItems.TSC_WIRE.get());
                        output.accept(ModItems.TSC_ADVANCED_TECH.get());
                        output.accept(ModItems.TSC_BRACE_PAD.get());
                        output.accept(ModItems.TSC_ELECT_PAD.get());
                        output.accept(ModItems.TSC_ARMOR_PAD.get());
                        output.accept(ModItems.TSC_SHOULDER_PAD.get());
                        output.accept(ModItems.TSC_PADDING.get());
                        output.accept(ModItems.TSC_GEARS.get());
                        output.accept(ModItems.ROSELIGHT_BATTERY.get());
                        output.accept(ModItems.FAT_TSC_BATTERY.get());
                        output.accept(ModItems.TSC_BATTERY.get());
                        output.accept(ModItems.TSC_METAL_DETECTOR.get());

                        output.accept(ModItems.MUGLING_SPAWN_EGG.get());

                        output.accept(ModBlocks.RAW_THUNDERIUM.get());
                        output.accept(ModBlocks.RAW_ROSELIGHT.get());
                        output.accept(ModBlocks.ROSELIGHT_ORE.get());
                        output.accept(ModBlocks.THUNDERIUM_ORE.get());
                        output.accept(ModBlocks.CITY_PORTAL_BLOCK.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
