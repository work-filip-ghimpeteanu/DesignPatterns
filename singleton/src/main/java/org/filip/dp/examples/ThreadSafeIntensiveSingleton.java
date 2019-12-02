package org.filip.dp.examples;

/**
 * This one besides the characteristics of {@link LazySingleton} has thread safe functionality.
 * The problem with it is that we use thread synchronization each time a Thread uses this method and we need it just
 * once, when we set the value for the first time.
 */
public class ThreadSafeIntensiveSingleton {
    private static ThreadSafeIntensiveSingleton INSTANCE;

    private ThreadSafeIntensiveSingleton() {}

    public static synchronized ThreadSafeIntensiveSingleton getInstance() {
        if (null == INSTANCE) {
            INSTANCE = new ThreadSafeIntensiveSingleton();
        }
        return INSTANCE;
    }
}
