package strategy.Duck;

import strategy.FlyBehavior.FlyNoWay;
import strategy.QuackBehavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model Duck");
    }
}
