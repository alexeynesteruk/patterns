package com.strategy;

import com.strategy.Ducks.Duck;
import com.strategy.Ducks.MallardDuck;
import com.strategy.Ducks.ModelDuck;
import com.strategy.FlyBehaviors.FlyRocketPowered;

public class Strategy {

    public static void main(String[] args) {

	Duck mallard = new MallardDuck();
	mallard.performFly();
	mallard.performQuack();

	Duck model = new ModelDuck();
	model.performFly();
	model.setFlyBehavior(new FlyRocketPowered());
	model.performFly();

    }
}
