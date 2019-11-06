package org.filip.dp.quackbehavior.impl;

import org.filip.dp.quackbehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("...");
    }
}
