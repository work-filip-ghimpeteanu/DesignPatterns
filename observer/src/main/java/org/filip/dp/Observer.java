package org.filip.dp;

/**
 * This class waits for notifications from the Subject.
 * When Subject's state is changed, it will be notified via
 * the {@link Observer#update()} method and it will update it's display.
 */
public interface Observer {
    void update();
}
