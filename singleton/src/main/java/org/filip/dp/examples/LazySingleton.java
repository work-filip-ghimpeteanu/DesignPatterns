package org.filip.dp.examples;

/**
 * This one besides the characteristics of {@link BasicSingleton} has lazy instantiation which can be
 * profitable if the INSTANCE is resource intensive.
 */
public class LazySingleton {
    private static LazySingleton INSTANCE;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE =new LazySingleton();
        }
        return INSTANCE;

    }
}
