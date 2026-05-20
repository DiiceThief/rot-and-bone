package net.tinydiicethief.rot_and_bone.block;

import net.minecraft.data.BlockFamily;

public class ModBlockFamilies {

    //initializer
    public static void initialize() {}

    //gravebrick set up
    public static final BlockFamily GRAVEBRICK_FAMILY =
            new BlockFamily.Builder(ModBlocks.GRAVEBRICKS)
                    .stairs(ModBlocks.GRAVEBRICK_STAIRS)
                    .slab(ModBlocks.GRAVEBRICK_SLAB)
                    .wall(ModBlocks.GRAVEBRICK_WALL)
                    .chiseled(ModBlocks.CHISELED_GRAVEBRICKS)
                    .getFamily();
}
