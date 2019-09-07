package org.filip.dp.store;

import org.filip.dp.pizza.Pizza;
import org.filip.dp.store.impl.NewYorkPizzaStore;

/**
 * This represents the Factory Method Pattern
 * - the createPizza represents the factory method
 * - the creation of Products is delegated to the subclasses
 *   {@link NewYorkPizzaStore}
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
