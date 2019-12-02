package org.filip.dp.examples;

/**
 * This one besides the characteristics of {@link ThreadSafeIntensiveSingleton} it is not misusing the thread
 * synchronization.
 *
 * We use a double if, so that we don't have threads waiting again after we receive the instance.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton INSTANCE;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (null == INSTANCE) {
            synchronized (ThreadSafeIntensiveSingleton.class) {
                if (null == INSTANCE) {
                    INSTANCE = new ThreadSafeSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
