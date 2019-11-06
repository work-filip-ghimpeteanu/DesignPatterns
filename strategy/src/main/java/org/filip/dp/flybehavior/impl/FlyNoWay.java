package org.filip.dp.flybehavior.impl;

import org.filip.dp.flybehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly captain");
    }
}
