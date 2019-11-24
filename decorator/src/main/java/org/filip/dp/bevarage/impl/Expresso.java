package org.filip.dp.bevarage.impl;

import org.filip.dp.bevarage.Beverage;

public class Expresso extends Beverage {

    public Expresso() {
        description = getClass().getSimpleName() + " Coffee";
    }

    @Override
    public Double cost() {
        return  1.99;
    }
}
