package org.filip.dp.bevarage;

public abstract class Beverage {
    protected String description = "Unknown beverage";

    public abstract Double cost();

    public String getDescription() {
        return description;
    }
}
