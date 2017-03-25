package es.iglu.futurecraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = FutureCraft.MOD_ID,
        name = FutureCraft.MOD_NAME,
        version = FutureCraft.VERSION
)
public class FutureCraft {

    public static final String MOD_ID = "FutureCraft";
    public static final String MOD_NAME = "FutureCraft";
    public static final String VERSION = "1.0-SNAPSHOT";

    @EventHandler
    public void init(FMLInitializationEvent event) {

    }
}
