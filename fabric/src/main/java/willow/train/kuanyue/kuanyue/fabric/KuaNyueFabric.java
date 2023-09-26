package willow.train.kuanyue.kuanyue.fabric;

import willow.train.kuanyue.kuanyue.KuaNyue;
import net.fabricmc.api.ModInitializer;

public class KuaNyueFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        KuaNyue.init();
    }
}