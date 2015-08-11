package de.mojah.letsmodreboot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import de.mojah.letsmodreboot.proxy.IProxy;
import de.mojah.letsmodreboot.reference.Reference;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = "de.mojah.letsmodreboot.proxy.ClientProxy", serverSide = "de.mojah.letsmodreboot.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Blocks
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // Recepiece
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //
    }
}
