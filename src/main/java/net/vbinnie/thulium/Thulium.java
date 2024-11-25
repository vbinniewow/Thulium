package net.vbinnie.thulium;

import net.fabricmc.api.ModInitializer;

import net.vbinnie.thulium.block.ModBlocks;
import net.vbinnie.thulium.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thulium implements ModInitializer {
	public static final String MOD_ID = "thulium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

		ModBlocks.registerModBlocks();

	}
}