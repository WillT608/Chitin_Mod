package com.willt608.chitin;

// import com.willt608.chitin.Tags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.willt608.chitin.init.Items;
import com.willt608.chitin.init.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "chitin", name = "Chitin Mod", acceptedMinecraftVersions = "[1.7.10]", useMetadata = true)
public class Main {

    public static final String MODID = "chitin";
    public static final Logger LOG = LogManager.getLogger(MODID);

    // @SidedProxy(clientSide = "com.willt608.chitin.ClientProxy", serverSide = "com.willt608.chitin.CommonProxy")
    // public static CommonProxy proxy;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Items.preInit();
        Recipes.preInit();
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        // proxy.init(event);
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        // proxy.postInit(event);
    }

}
