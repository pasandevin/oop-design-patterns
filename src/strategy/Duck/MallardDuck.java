package strategy.Duck;

import strategy.FlyBehavior.FlyWithWings;
import strategy.QuackBehavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
