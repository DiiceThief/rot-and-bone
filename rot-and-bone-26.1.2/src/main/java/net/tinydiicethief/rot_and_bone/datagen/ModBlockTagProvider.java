package net.tinydiicethief.rot_and_bone.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.tinydiicethief.rot_and_bone.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.GRAVEBRICKS)
                .add(ModBlocks.GRAVEBRICK_STAIRS)
                .add(ModBlocks.GRAVEBRICK_SLAB)
                .add(ModBlocks.GRAVEBRICK_WALL)
                .add(ModBlocks.CRACKED_GRAVEBRICKS)
                .add(ModBlocks.CRACKED_GRAVEBRICK_STAIRS)
                .add(ModBlocks.CRACKED_GRAVEBRICK_SLAB)
                .add(ModBlocks.CRACKED_GRAVEBRICK_WALL);

        valueLookupBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.RITUAL_TABLE);

        valueLookupBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.GRAVESOIL);
    }
}
