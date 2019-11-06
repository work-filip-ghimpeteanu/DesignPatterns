package org.filip.dp.flybehavior.impl;

import org.filip.dp.flybehavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
