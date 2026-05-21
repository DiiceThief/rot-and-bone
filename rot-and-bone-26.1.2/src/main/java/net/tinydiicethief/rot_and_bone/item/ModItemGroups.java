package net.tinydiicethief.rot_and_bone.item;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.tinydiicethief.rot_and_bone.RotAndBone;
import net.tinydiicethief.rot_and_bone.block.ModBlocks;

public class ModItemGroups {

    public static void initialize() {}

    public static final ResourceKey<CreativeModeTab> ROT_AND_BONE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(),
            Identifier.fromNamespaceAndPath(RotAndBone.MOD_ID, "rot_and_bone_tab")
    );
    public static final CreativeModeTab ROT_AND_BONE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(ModBlocks.GRAVESOIL))
            .title(Component.translatable("creativeTab.rot_and_bone"))
            .displayItems((params, output) -> {

                //Items
                output.accept(ModItems.ROTTING_BONE);
                output.accept(ModItems.ROTTING_BONE_SICKLE);

                //Blocks
                output.accept(ModBlocks.GRAVESOIL);
                output.accept(ModBlocks.GRAVEBRICKS);
                output.accept(ModBlocks.GRAVEBRICK_STAIRS);
                output.accept(ModBlocks.GRAVEBRICK_SLAB);
                output.accept(ModBlocks.GRAVEBRICK_WALL);
                output.accept(ModBlocks.CHISELED_GRAVEBRICKS);
                output.accept(ModBlocks.CRACKED_GRAVEBRICKS);
                output.accept(ModBlocks.CRACKED_GRAVEBRICK_STAIRS);
                output.accept(ModBlocks.CRACKED_GRAVEBRICK_SLAB);
                output.accept(ModBlocks.CRACKED_GRAVEBRICK_WALL);
            })
            .build();
}
