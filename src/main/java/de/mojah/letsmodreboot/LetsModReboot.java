package de.mojah.letsmodreboot;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.mojah.letsmodreboot.handler.ConfigurationHandler;
import de.mojah.letsmodreboot.init.ModBlocks;
import de.mojah.letsmodreboot.init.ModItems;
import de.mojah.letsmodreboot.proxy.IProxy;
import de.mojah.letsmodreboot.reference.Reference;
import de.mojah.letsmodreboot.utility.LogHelper;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Configs
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        // so the ConfigHandler listens to the Event-bus
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        // Blocks
        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Recepiece

        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //

        LogHelper.info("Post Initialization Complete");
    }
}
