package net.tinydiicethief.rot_and_bone;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.tinydiicethief.rot_and_bone.datagen.ModEnglishLangProvider;
import net.tinydiicethief.rot_and_bone.datagen.ModItemTagProvider;
import net.tinydiicethief.rot_and_bone.datagen.ModModelProvider;
import net.tinydiicethief.rot_and_bone.datagen.ModRecipeProvider;

public class RotAndBoneDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModEnglishLangProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModItemTagProvider::new);
	}
}