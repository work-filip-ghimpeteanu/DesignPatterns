package org.filip.dp.duck;

import org.filip.dp.flybehavior.impl.FlyWithWings;
import org.filip.dp.quackbehavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
