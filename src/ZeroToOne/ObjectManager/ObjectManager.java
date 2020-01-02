package ZeroToOne.ObjectManager;

import java.util.HashMap;
import java.util.Objects;

/**
 * ServiceLocator
 */
public class ObjectManager extends FactoryMapping {

    private static HashMap<Class<?>, Object> cache = new HashMap<>();

    /**
     * Get object by class
     *
     * @param className name of class <br><b>For example:</b> <code>MyClass.class</code>
     * @param <Obj>     class of return instance
     * @return instance not null
     * @throws Exception when not instantiated class
     */
    public static <Obj> Obj get(Class<Obj> className) throws Exception {
        Obj instance = null;

        if (MAPPER.isEmpty()) {
            init();
        } else if (cache.containsKey(className)) {
            return (Obj) cache.get(className);
        }

        if (MAPPER.containsKey(className)) {
            Class<? extends FactoryInterface> factoryClass = MAPPER.get(className);

            if (factoryClass == null) {
                instance = className.newInstance();
            } else {
                instance = (Obj) factoryClass.newInstance().create();
            }

            cache.put(className, instance);
        }

        return Objects.requireNonNull(instance, "Required not null");
    }
}
