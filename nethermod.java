package nethermod;
        import net.minecraftforge.fml.common.Mod;
        import net.minecraftforge.fml.common.Mod.EventHandler;
        import net.minecraftforge.fml.common.event.FMLInitializationEvent;
        import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
        import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = nethermod.MODID, version = nethermod.VERSION)

public class nethermod {
    public static final String MODID = "nethermod";
    public static final String VERSION = "0.4";


    @Mod.Instance(nethermod.MODID)
    public static nethermod Instance;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        modrecipes.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        modrecipes.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        modrecipes.init();
    }

}
