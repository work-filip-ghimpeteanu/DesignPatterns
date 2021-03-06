package org.filip.dp.ingredients.impl;

import org.filip.dp.ingredients.*;

public class NewYorkIngredientsFactory implements IngredientsFactory {

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SpicyPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }

    @Override
    public Ham createHam() {
        return new ParmaHam();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {
                Veggies.GARLIC,
                Veggies.MUSHROOM,
                Veggies.SWEET_CORN
        };
    }
}
