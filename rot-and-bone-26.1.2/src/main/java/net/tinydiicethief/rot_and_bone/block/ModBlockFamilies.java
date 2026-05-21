package net.tinydiicethief.rot_and_bone.block;

import net.minecraft.data.BlockFamily;

public class ModBlockFamilies {

    //initializer
    public static void initialize() {}

    //gravebrick family
    public static final BlockFamily GRAVEBRICK_FAMILY =
            new BlockFamily.Builder(ModBlocks.GRAVEBRICKS)
                    .stairs(ModBlocks.GRAVEBRICK_STAIRS)
                    .slab(ModBlocks.GRAVEBRICK_SLAB)
                    .wall(ModBlocks.GRAVEBRICK_WALL)
                    .chiseled(ModBlocks.CHISELED_GRAVEBRICKS)
                    .getFamily();

    //cracked gravebrick family
    public static final BlockFamily CRACKED_GRAVEBRICK_FAMILY =
            new BlockFamily.Builder(ModBlocks.CRACKED_GRAVEBRICKS)
                    .stairs(ModBlocks.CRACKED_GRAVEBRICK_STAIRS)
                    .slab(ModBlocks.CRACKED_GRAVEBRICK_SLAB)
                    .wall(ModBlocks.CRACKED_GRAVEBRICK_WALL)
                    .getFamily();
}
