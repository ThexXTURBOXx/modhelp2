package nethermod;
        import net.minecraftforge.fml.common.Mod;
        import net.minecraftforge.fml.common.Mod.EventHandler;
        import net.minecraftforge.fml.common.event.FMLInitializationEvent;
        import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
        import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = nethermod.MODID, version = nethermod.VERSION, name = nethermod.NAME)

public class nethermod {
    public static final String MODID = "nethermod";
    public static final String NAME = "The Nether Star Mod";
    public static final String VERSION = "0.4";


    @Mod.Instance(nethermod.MODID)
    public static nethermod Instance;

    /* 
     * Register your Mod-config, new Items, EventHandlers, Entities, Guis and Packets here
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {}

    /* 
     * Register Renderers and Recipes here
     */
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        modrecipes.init();
    }

    /* 
     * You barely use the postInit... You could use it for logging.
     * If you want do something like this:
     * LogManager.getLogger(NAME).info("Loaded the Mod succesfully");
     * This would say this in your log:"[INFO] [The Nether Star Mod] Loaded the Mod successfully".
     * You need to import this then btw:
     * import org.apache.logging.log4j.LogManager;
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}

}
