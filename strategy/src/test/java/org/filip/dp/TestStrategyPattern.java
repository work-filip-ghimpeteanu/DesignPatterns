package org.filip.dp;

import org.filip.dp.duck.Duck;
import org.filip.dp.duck.MallardDuck;
import org.filip.dp.duck.ModelDuck;
import org.filip.dp.flybehavior.impl.FlyRocketPowered;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestStrategyPattern {

    @Test
    public void testDucks() {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
    }
}
