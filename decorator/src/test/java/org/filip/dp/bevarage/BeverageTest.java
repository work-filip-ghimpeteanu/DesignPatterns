package org.filip.dp.bevarage;

import junit.framework.TestCase;
import org.filip.dp.bevarage.Beverage;
import org.filip.dp.bevarage.impl.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeverageTest extends TestCase {

    private static final String ORDER_MSG = "You ordered a %s and costs %.2f$";
    private Beverage beverage;

    @Test
    public void create_darkRoastSoyWhip_success() {
        beverage = new Whip(new Soy(new DarkRoast()));

        System.out.println(String.format("Main class is %s", beverage.getClass().getSimpleName()));

        System.out.println(String.format(ORDER_MSG,
                beverage.getDescription(), beverage.cost()));
    }


    @Test
    public void create_somethingCrazy_success() {
        beverage = new Soy(new SteamMilk(new Whip(new Decaf())));

        System.out.println(String.format("Main class is %s", beverage.getClass().getSimpleName()));

        System.out.println(String.format(ORDER_MSG,
                beverage.getDescription(), beverage.cost()));
    }

    @Test
    public void create_doubleMochaSoyLatteWithWhip_success() {
        beverage = new Mocha(new Mocha(new Soy(new Whip(new DarkRoast()))));

        System.out.println(String.format("Main class is %s", beverage.getClass().getSimpleName()));

        System.out.println(String.format(ORDER_MSG,
                beverage.getDescription(), beverage.cost()));
    }
}