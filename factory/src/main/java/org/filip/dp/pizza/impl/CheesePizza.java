package org.filip.dp.pizza.impl;

import org.filip.dp.ingredients.IngredientsFactory;
import org.filip.dp.pizza.Pizza;

public class CheesePizza extends Pizza {

    private IngredientsFactory ingredientsFactory;

    public CheesePizza(IngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        veggies     = ingredientsFactory.createVeggies();
        dough       = ingredientsFactory.createDough();
        sauce       = ingredientsFactory.createSauce();
        cheese      = ingredientsFactory.createCheese();
        printPrepareMessage();
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza in squares");
    }
}
