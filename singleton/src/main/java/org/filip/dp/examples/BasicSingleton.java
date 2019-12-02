package org.filip.dp.examples;

/**
 * The most simple variation:
 *  - it isn't thread safe
 *  - it has eager instantiation
 */
public class BasicSingleton {
    private final static BasicSingleton INSTANCE = new BasicSingleton();

    private BasicSingleton() {}

    public static BasicSingleton getIntance() {
        return INSTANCE;
    }
}
