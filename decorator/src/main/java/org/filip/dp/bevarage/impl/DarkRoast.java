package org.filip.dp.bevarage.impl;

import org.filip.dp.bevarage.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = getClass().getSimpleName() + " Coffee";
    }

    @Override
    public Double cost() {
        return .99;
    }
}
