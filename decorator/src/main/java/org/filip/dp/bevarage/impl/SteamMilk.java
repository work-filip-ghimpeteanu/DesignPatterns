package org.filip.dp.bevarage.impl;

import org.filip.dp.bevarage.Beverage;
import org.filip.dp.bevarage.CondimentDecorator;

public class SteamMilk extends CondimentDecorator {
    // this is the object which we wrap it with this class
    private Beverage beverage;

    public SteamMilk(Beverage beverage) {
        this.description = getClass().getSimpleName();
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", beverage.getDescription(), description);
    }

    @Override
    public Double cost() {
        return beverage.cost() + .10;
    }
}
