package net.tinydiicethief.rot_and_bone;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RotAndBone implements ModInitializer {
	public static final String MOD_ID = "rot-and-bone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Testing Message");
	}
}