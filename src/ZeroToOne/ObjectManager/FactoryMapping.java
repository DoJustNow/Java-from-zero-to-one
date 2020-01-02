package ZeroToOne.ObjectManager;

import ZeroToOne.FlashOfLightning.DistanceCalculator;
import java.util.HashMap;

public class FactoryMapping {
    protected static final HashMap<Class<?>, Class<? extends FactoryInterface>> MAPPER = new HashMap<>();

    protected static void init() {
        MAPPER.put(DistanceCalculator.class, null);
    }
}
