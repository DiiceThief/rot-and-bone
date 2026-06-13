package net.tinydiicethief.rot_and_bone.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.tinydiicethief.rot_and_bone.block.ModBlockFamilies;
import net.tinydiicethief.rot_and_bone.block.ModBlocks;
import net.tinydiicethief.rot_and_bone.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.GRAVESOIL);

        blockModelGenerators.family(ModBlocks.GRAVEBRICKS).generateFor(ModBlockFamilies.GRAVEBRICK_FAMILY);
        blockModelGenerators.family(ModBlocks.CRACKED_GRAVEBRICKS)
                .generateFor(ModBlockFamilies.CRACKED_GRAVEBRICK_FAMILY);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.ROTTING_BONE_SICKLE, ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModelGenerators.generateFlatItem(ModItems.ROTTING_BONE, ModelTemplates.FLAT_ITEM);
    }

    @Override
    public String getName() {
        return "ModModelProvider";
    }
}
