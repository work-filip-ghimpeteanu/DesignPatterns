package org.filip.dp.duck;

import org.filip.dp.flybehavior.impl.FlyNoWay;
import org.filip.dp.quackbehavior.impl.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
