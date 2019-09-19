package org.filip.dp.ingredients.impl;

import org.filip.dp.ingredients.*;

public class ChicagoIngredientsFactory implements IngredientsFactory {

    @Override
    public Cheese createCheese() {
        return new GorgonzolaCheese();
    }

    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoesSauce();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SweetPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }

    @Override
    public Ham createHam() {
        return new SmokedHam();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {
                Veggies.TOMATOES,
                Veggies.ONION,
        };
    }
}
