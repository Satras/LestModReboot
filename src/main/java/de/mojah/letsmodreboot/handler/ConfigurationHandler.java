package de.mojah.letsmodreboot.handler;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import de.mojah.letsmodreboot.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    // For Config Edit in Minecraft
    public static Configuration configuration = null;
    public static boolean testValue = false;


    public static void init(File configFile) {

        // Create configuration object
        if(configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration() {

        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

        if(configuration.hasChanged()) {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent event) {

        if(event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            // Resync Configs
            loadConfiguration();
        }

    }

}
