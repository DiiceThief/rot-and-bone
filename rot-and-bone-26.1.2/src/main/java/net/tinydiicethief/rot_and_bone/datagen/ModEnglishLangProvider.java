package net.tinydiicethief.rot_and_bone.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.tinydiicethief.rot_and_bone.block.ModBlocks;
import net.tinydiicethief.rot_and_bone.item.ModItemGroups;
import net.tinydiicethief.rot_and_bone.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {

        //item translations
        translationBuilder.add(ModItems.ROTTING_BONE_SICKLE, "Rotting Bone Sickle");
        translationBuilder.add(ModItems.ROTTING_BONE, "Rotting Bone");

        //block translations
        translationBuilder.add(ModBlocks.GRAVESOIL, "Gravesoil");

        //creative mode tab
        translationBuilder.add(ModItemGroups.ROT_AND_BONE_TAB_KEY, "Rot And Bone");
    }
}
