package org.filip.dp.pizza.impl;

import org.filip.dp.ingredients.IngredientsFactory;
import org.filip.dp.pizza.Pizza;

public class ClamPizza extends Pizza {

    private IngredientsFactory ingredientsFactory;

    public ClamPizza(IngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        clam        = ingredientsFactory.createClam();
        dough       = ingredientsFactory.createDough();
        sauce       = ingredientsFactory.createSauce();
        printPrepareMessage();
    }
}
