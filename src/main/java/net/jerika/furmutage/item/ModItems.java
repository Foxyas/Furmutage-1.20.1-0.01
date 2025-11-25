package net.jerika.furmutage.item;

import net.jerika.furmutage.entity.ModEntities;
import net.jerika.furmutage.furmutage;
import net.jerika.furmutage.item.custom.TSCMetalDetectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, furmutage.MOD_ID);

    public static final RegistryObject<Item> THUNDERIUM = ITEMS.register("thunderium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSELIGHT = ITEMS.register("roselight",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_FIBER = ITEMS.register("tsc_fiber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_GLOVES = ITEMS.register("tsc_gloves",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_RUBBER_SHOE_PADS = ITEMS.register("tsc_rubber_shoe_pads",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_WIRE = ITEMS.register("tsc_wire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_ADVANCED_TECH = ITEMS.register("tsc_advanced_tech",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_BRACE_PAD = ITEMS.register("tsc_brace_pad",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_ELECT_PAD = ITEMS.register("tsc_elect_pad",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_ARMOR_PAD = ITEMS.register("tsc_armor_pad",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_SHOULDER_PAD = ITEMS.register("tsc_shoulder_pad",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_PADDING = ITEMS.register("tsc_padding",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_GEARS = ITEMS.register("tsc_gears",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROSELIGHT_BATTERY = ITEMS.register("roselight_battery",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FAT_TSC_BATTERY = ITEMS.register("fat_tsc_battery",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_BATTERY = ITEMS.register("tsc_battery",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TSC_METAL_DETECTOR = ITEMS.register("tsc_metal_detector",
            () -> new TSCMetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> MUGLING_SPAWN_EGG = ITEMS.register("mugling_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MUGLING, 0x4D72, 0xc5d,
                    new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
