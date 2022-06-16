package net.erichossenbrugge.coalie;

import net.erichossenbrugge.coalie.block.ModBlocks;
import net.erichossenbrugge.coalie.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coalie implements ModInitializer {
    public static final String MOD_ID = "coalie";
    public static final Logger LOGGER = LoggerFactory.getLogger(Coalie.MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }


}
