package net.nukebob.shinypots;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShinyPots implements ClientModInitializer {
	public static final String MOD_ID = "shinypots";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitializeClient() {
		LOGGER.info("Shiny pots hath been loadeth!");
	}
}