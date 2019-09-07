package org.filip.dp.store.impl;

import org.filip.dp.ingredients.IngredientsFactory;
import org.filip.dp.ingredients.impl.NewYorkIngredientsFactory;
import org.filip.dp.pizza.impl.CheesePizza;
import org.filip.dp.pizza.impl.PepperoniPizza;
import org.filip.dp.pizza.Pizza;
import org.filip.dp.store.PizzaStore;

public class NewYorkPizzaStore extends PizzaStore {
    private IngredientsFactory ingredientsFactory = new NewYorkIngredientsFactory();

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName("NY Style Cheese Pizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName("NY Style Pepperoni Pizza");
        }

        return pizza;
    }
}
