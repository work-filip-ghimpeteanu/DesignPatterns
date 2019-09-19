package org.filip.dp.store;

import junit.framework.TestCase;
import org.filip.dp.pizza.Pizza;
import org.filip.dp.store.impl.ChicagoPizzaStore;
import org.filip.dp.store.impl.NewYorkPizzaStore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class PizzaStoreTest extends TestCase {

    private PizzaStore pizzaStore;

    @Test
    public void orderPizza_fromANewYorkPizzaStore_success() {
        pizzaStore = new NewYorkPizzaStore();

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);

        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println(pizza);

        pizza = pizzaStore.orderPizza("clam");
        System.out.println(pizza);

        pizza = pizzaStore.orderPizza("ham");
        System.out.println(pizza);
    }

    @Test
    public void orderPizza_fromAChicagoPizzaStore_success() {
        pizzaStore = new ChicagoPizzaStore();

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza);

        pizza = pizzaStore.orderPizza("pepperoni");
        System.out.println(pizza);

        pizza = pizzaStore.orderPizza("clam");
        System.out.println(pizza);

        pizza = pizzaStore.orderPizza("ham");
        System.out.println(pizza);
    }
}