package net.tinydiicethief.rot_and_bone.item;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.tinydiicethief.rot_and_bone.RotAndBone;
import net.tinydiicethief.rot_and_bone.datagen.ModItemTagProvider;

public class ModToolMaterials {
    public static final ToolMaterial ROTTING_BONE_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_COPPER_TOOL,
            160,
            4.5F,
            1.0F,
            9,
            ModItemTagProvider.REPAIRS_ROTTING_BONE_ARMOR
            );
    public static final ToolMaterial GRAVE_STEEL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            400,
            4.5F,
            2F,
            9,
            ModItemTagProvider.REPAIRS_GRAVE_STEEL_ARMOR
            );
}
