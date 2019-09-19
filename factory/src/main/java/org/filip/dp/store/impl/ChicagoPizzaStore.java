package org.filip.dp.store.impl;

import org.filip.dp.ingredients.IngredientsFactory;
import org.filip.dp.ingredients.impl.ChicagoIngredientsFactory;
import org.filip.dp.ingredients.impl.NewYorkIngredientsFactory;
import org.filip.dp.pizza.Pizza;
import org.filip.dp.pizza.impl.CheesePizza;
import org.filip.dp.pizza.impl.ClamPizza;
import org.filip.dp.pizza.impl.HamPizza;
import org.filip.dp.pizza.impl.PepperoniPizza;
import org.filip.dp.store.PizzaStore;

import static java.lang.String.format;

public class ChicagoPizzaStore extends PizzaStore {

    private IngredientsFactory ingredientsFactory = new ChicagoIngredientsFactory();
    private static final String PIZZA_NAME_FORTMAT = "Chicago Style %s Pizza";

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(ingredientsFactory);
            pizza.setName(format(PIZZA_NAME_FORTMAT, "Cheese"));
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(ingredientsFactory);
            pizza.setName(format(PIZZA_NAME_FORTMAT, "Pepperoni"));
        } else if ("ham".equals(type)) {
            pizza = new HamPizza(ingredientsFactory);
            pizza.setName(format(PIZZA_NAME_FORTMAT, "Ham"));
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza(ingredientsFactory);
            pizza.setName(format(PIZZA_NAME_FORTMAT, "Clam"));
        }

        return pizza;
    }
}
