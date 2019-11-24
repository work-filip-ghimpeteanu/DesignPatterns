package org.filip.dp.bevarage.impl;

import org.filip.dp.bevarage.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = getClass().getSimpleName() + " Coffee";
    }

    @Override
    public Double cost() {
        return 1.05;
    }
}
