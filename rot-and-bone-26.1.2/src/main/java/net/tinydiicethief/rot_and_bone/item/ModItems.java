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
    public static final Item ROTTING_BONE_SICKLE = register("rotting_bone_sickle",
            Item::new, new Item.Properties().sword(ModToolMaterials.ROTTING_BONE_MATERIAL,
                    4.5F, -2.8F));

    public static final Item ROTTING_BONE = register("rotting_bone", Item::new, new Item.Properties());
    public static final Item BRITTLE_FLESH = register("brittle_flesh", Item::new, new Item.Properties());
}
