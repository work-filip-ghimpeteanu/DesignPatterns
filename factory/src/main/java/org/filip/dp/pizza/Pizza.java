package org.filip.dp.pizza;

import org.filip.dp.ingredients.*;
import org.filip.dp.store.PizzaStore;

import java.util.Arrays;

import static java.lang.String.format;

/**
 * This abstraction + the factory pattern is an example of Dependecy Inversion
 * in the PizzaStore:
 * - it doesn't depend any more of concrete Pizza references
 * - it doesn't create any more Pizza references, but it delegates the
 * creation to it's store subclasses via the {@link PizzaStore#createPizza(String)} method
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Topping[] toppings;

    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("Baking pizza at 100 C");
    }

    public void cut() {
        System.out.println("Cutting pizza nicely");
    }

    public void box() {
        System.out.println("Boxing using premium material");
    }

    @Override
    public String toString() {
        return String.format("Your ordered a [--%s--]", name.toUpperCase());
    }

    /**
     * Declared final so it cannot be overridden in subclasses
     */
    protected final void printPrepareMessage() {
        System.out.println(format("Choosing a %s with %s ", dough, sauce));
        System.out.println(format("Tossing Topping: \n\t%s", Arrays.toString(toppings)));
    }

}
