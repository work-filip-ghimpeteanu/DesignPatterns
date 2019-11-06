package org.filip.dp.flybehavior.impl;

import org.filip.dp.flybehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying like a duck");
    }
}
