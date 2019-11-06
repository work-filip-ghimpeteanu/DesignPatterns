package org.filip.dp.quackbehavior.impl;

import org.filip.dp.quackbehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak squeak ...");
    }
}
