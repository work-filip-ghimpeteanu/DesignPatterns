package org.filip.dp.ingredients;

import org.filip.dp.pizza.Pizza;
import org.filip.dp.store.impl.NewYorkPizzaStore;

/**
 * This represents the Abstract Factory Pattern
 * - its methods are like Factory Methods
 * - it is base on composition, e.g. the {@link Pizza} receives
 *   in its constructor an {@link IngredientsFactory} reference depending on
 *   the store type (e.g. {@link NewYorkPizzaStore}
 */
public interface IngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Topping[] createToppings();
}
