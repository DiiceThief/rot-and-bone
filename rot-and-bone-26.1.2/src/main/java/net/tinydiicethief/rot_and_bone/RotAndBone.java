package net.tinydiicethief.rot_and_bone;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.tinydiicethief.rot_and_bone.block.ModBlockFamilies;
import net.tinydiicethief.rot_and_bone.block.ModBlocks;
import net.tinydiicethief.rot_and_bone.component.FocusAndClarity;
import net.tinydiicethief.rot_and_bone.item.ModItemGroups;
import net.tinydiicethief.rot_and_bone.item.ModItems;
import net.tinydiicethief.rot_and_bone.item.custom.CatalystItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RotAndBone implements ModInitializer {
	public static final String MOD_ID = "rot-and-bone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		//Classes
		ModItems.initialize();
		ModBlocks.initialize();
		ModItemGroups.initialize();
		ModBlockFamilies.initialize();
		CatalystItem.initialize();
		FocusAndClarity.initialize();

		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
				ModItemGroups.ROT_AND_BONE_TAB_KEY, ModItemGroups.ROT_AND_BONE_TAB);

		LOGGER.info("Testing Message");
	}
}