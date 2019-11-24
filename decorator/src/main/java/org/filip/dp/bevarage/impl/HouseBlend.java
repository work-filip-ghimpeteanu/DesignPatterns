package org.filip.dp.bevarage.impl;

import org.filip.dp.bevarage.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = getClass().getSimpleName() + " Coffee";
    }

    @Override
    public Double cost() {
        return .89;
    }
}
