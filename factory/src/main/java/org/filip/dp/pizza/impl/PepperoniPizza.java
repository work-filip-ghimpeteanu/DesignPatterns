package org.filip.dp.pizza.impl;

import org.filip.dp.ingredients.IngredientsFactory;
import org.filip.dp.pizza.Pizza;

public class PepperoniPizza extends Pizza {

    private IngredientsFactory ingredientsFactory;

    public PepperoniPizza(IngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        dough       = ingredientsFactory.createDough();
        sauce       = ingredientsFactory.createSauce();
        toppings    = ingredientsFactory.createToppings();
        cheese      = ingredientsFactory.createCheese();
        printPrepareMessage();
    }
}
