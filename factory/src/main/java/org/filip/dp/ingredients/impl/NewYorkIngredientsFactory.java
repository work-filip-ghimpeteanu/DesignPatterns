package org.filip.dp.ingredients.impl;

import org.filip.dp.ingredients.*;

public class NewYorkIngredientsFactory implements IngredientsFactory {

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Topping[] createToppings() {
        return new Topping[] {
                Topping.GARLIC,
                Topping.ONION,
                Topping.MUSHROOM,
                Topping.RED_PEPPER,
                Topping.SLICED_PEPPERONI,
                Topping.FRESH_CLAMS
        };
    }
}
