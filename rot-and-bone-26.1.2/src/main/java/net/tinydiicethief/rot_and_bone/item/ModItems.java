package net.tinydiicethief.rot_and_bone.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.tinydiicethief.rot_and_bone.RotAndBone;

import java.util.function.Function;

public class ModItems {

    //initializer
    public static void initialize() {}

    public static <T extends Item> T
    register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {

        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM,
                Identifier.fromNamespaceAndPath(RotAndBone.MOD_ID, name));

        T item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }
    //sickles
    public static final Item ROTTING_BONE_SICKLE = register("rotting_bone_sickle",
            Item::new, new Item.Properties().sword(ModToolMaterials.ROTTING_BONE_MATERIAL,
                    4.5F, -2.8F));
    public static final Item GRAVE_STEEL_SICKLE = register("grave_steel_sickle",
            Item::new, new Item.Properties().sword(ModToolMaterials.GRAVE_STEEL_MATERIAL,
                    4.5F, -2.8F));

    //spell materials
    public static final Item ROTTING_BONE = register("rotting_bone",
            Item::new, new Item.Properties());
    public static final Item BRITTLE_FLESH = register("brittle_flesh",
            Item::new, new Item.Properties());

    //non spell materials
    public static final Item GRAVE_STEEL_INGOT = register("grave_steel_ingot",
            Item::new, new Item.Properties());
    public static final Item RAW_GRAVE_STEEL = register("raw_grave_steel",
            Item::new, new Item.Properties());

    //catalysts
    public static final Item SIMPLE_CATALYST = register("simple_catalyst",
            Item::new, new Item.Properties());
}
