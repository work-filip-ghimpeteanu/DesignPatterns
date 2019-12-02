package org.filip.dp.examples;

/**
 * Another variant which gets read of the thread safe {@link ThreadSafeSingleton } synchronization by having an inner
 * class acting as a container for the instance.
 */
public class InnerClassSingleton {
    private InnerClassSingleton() {}

    private static class InstanceHolder {
         private static InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
