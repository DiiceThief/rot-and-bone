package net.tinydiicethief.rot_and_bone.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.tinydiicethief.rot_and_bone.block.ModBlocks;
import net.tinydiicethief.rot_and_bone.item.ModItemGroups;
import net.tinydiicethief.rot_and_bone.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricPackOutput packOutput,
                                  CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup,
                                     TranslationBuilder translationBuilder) {

        //item translations
        translationBuilder.add(ModItems.ROTTING_BONE_SICKLE, "Rotting Bone Sickle");
        translationBuilder.add(ModItems.GRAVE_STEEL_SICKLE, "Grave Steel Sickle");

        translationBuilder.add(ModItems.SIMPLE_CATALYST, "Simple Catalyst");

        translationBuilder.add(ModItems.ROTTING_BONE, "Rotting Bone");
        translationBuilder.add(ModItems.BRITTLE_FLESH, "Brittle Flesh");

        translationBuilder.add(ModItems.GRAVE_STEEL_INGOT, "Grave Steel Ingot");
        translationBuilder.add(ModItems.RAW_GRAVE_STEEL, "Raw Grave Steel");

        //block translations
        translationBuilder.add(ModBlocks.GRAVESOIL, "Gravesoil");

        translationBuilder.add(ModBlocks.GRAVEBRICKS, "Gravebricks");
        translationBuilder.add(ModBlocks.GRAVEBRICK_STAIRS, "Gravebrick Stairs");
        translationBuilder.add(ModBlocks.GRAVEBRICK_SLAB, "Gravebrick Slab");
        translationBuilder.add(ModBlocks.GRAVEBRICK_WALL, "Gravebrick Wall");
        translationBuilder.add(ModBlocks.CHISELED_GRAVEBRICKS, "Chiseled Gravebricks");

        translationBuilder.add(ModBlocks.CRACKED_GRAVEBRICKS, "Cracked Gravebricks");
        translationBuilder.add(ModBlocks.CRACKED_GRAVEBRICK_STAIRS, "Cracked Gravebrick Stairs");
        translationBuilder.add(ModBlocks.CRACKED_GRAVEBRICK_SLAB, "Cracked Gravebrick Slab");
        translationBuilder.add(ModBlocks.CRACKED_GRAVEBRICK_WALL, "Cracked Gravebrick Wall");

        //creative mode tab
        translationBuilder.add(ModItemGroups.ROT_AND_BONE_TAB_KEY, "Rot And Bone");
    }
}
