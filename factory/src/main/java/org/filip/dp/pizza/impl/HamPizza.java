package org.filip.dp.pizza.impl;

import org.filip.dp.ingredients.IngredientsFactory;
import org.filip.dp.pizza.Pizza;

public class HamPizza extends Pizza {

    private IngredientsFactory ingredientsFactory;

    public HamPizza(IngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        dough       = ingredientsFactory.createDough();
        sauce       = ingredientsFactory.createSauce();
        veggies     = ingredientsFactory.createVeggies();
        ham         = ingredientsFactory.createHam();
        printPrepareMessage();
    }
}
