package net.tinydiicethief.rot_and_bone.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;
import net.tinydiicethief.rot_and_bone.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootSubProvider {
    public ModLootTableProvider(FabricPackOutput packOutput,
                                CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.GRAVESOIL);
        dropSelf(ModBlocks.RITUAL_TABLE);

        dropSelf(ModBlocks.GRAVEBRICKS);
        dropSelf(ModBlocks.GRAVEBRICK_STAIRS);
        dropSelf(ModBlocks.GRAVEBRICK_SLAB);
        dropSelf(ModBlocks.GRAVEBRICK_WALL);

        dropSelf(ModBlocks.CRACKED_GRAVEBRICKS);
        dropSelf(ModBlocks.CRACKED_GRAVEBRICK_STAIRS);
        dropSelf(ModBlocks.CRACKED_GRAVEBRICK_SLAB);
        dropSelf(ModBlocks.CRACKED_GRAVEBRICK_WALL);
    }
}
