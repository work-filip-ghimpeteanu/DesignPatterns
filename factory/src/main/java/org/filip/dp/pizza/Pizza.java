package org.filip.dp.pizza;

import org.filip.dp.ingredients.*;
import org.filip.dp.store.PizzaStore;

import java.util.Arrays;

import static java.lang.String.format;

/**
 * This abstraction + the factory pattern is an example of Dependency Inversion
 * in the PizzaStore. The PizzaStore:
 * - doesn't depend any more on concrete Pizza references
 * - doesn't create any more Pizza references, but it delegates the
 *   creation to it's store subclasses via the {@link PizzaStore#createPizza(String)} method
 */
public abstract class Pizza {

    protected Clam clam;
    protected Cheese cheese;
    protected Dough dough;
    protected Ham ham;
    protected Pepperoni pepperoni;
    protected Sauce sauce;
    protected Veggies[] veggies;

    protected String name;

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
        return format("Your ordered a [-- %s --]\n>>>>>>>>>>>>>>>>>\n", name.toUpperCase());
    }

    /**
     * Declared final so it cannot be overridden in subclasses
     */
    protected final void printPrepareMessage() {
        System.out.println(format("Choosing a %s with %s ", dough, sauce));
        StringBuilder toppings = new StringBuilder();

        if (clam != null) { toppings.append(clam.toString()).append(", "); }
        if (cheese != null) { toppings.append(cheese.toString()).append(", "); }
        if (ham != null) { toppings.append(ham.toString()).append(", "); }
        if (pepperoni != null) { toppings.append(pepperoni.toString()).append(", "); }
        if (veggies != null && veggies.length > 1) { toppings.append(format("\n\tVeggies: %s\n", Arrays.toString(veggies))); }

        System.out.println(format("And: \n\t%stoppings", toppings.toString()));
    }

}
