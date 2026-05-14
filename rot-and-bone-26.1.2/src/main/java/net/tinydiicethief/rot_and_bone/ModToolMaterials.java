package net.tinydiicethief.rot_and_bone;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public static final TagKey<Item> REPAIRS_ROTTING_BONE_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(),
            Identifier.fromNamespaceAndPath(RotAndBone.MOD_ID, "repairs_rotting_bone_armor"));

    public static final ToolMaterial ROTTING_BONE_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_COPPER_TOOL,
            160,
            4.5F,
            1.0F,
            9,
            ModToolMaterials.REPAIRS_ROTTING_BONE_ARMOR
            );
}
