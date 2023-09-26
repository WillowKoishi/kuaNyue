package willow.train.kuanyue.kuanyue.forge;

import dev.architectury.platform.forge.EventBuses;
import willow.train.kuanyue.kuanyue.KuaNyue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KuaNyue.MOD_ID)
public class KuaNyueForge {
    public KuaNyueForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(KuaNyue.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            KuaNyue.init();
    }
}