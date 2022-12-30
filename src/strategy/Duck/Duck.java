package strategy.Duck;

import strategy.FlyBehavior.FlyBehavior;
import strategy.QuackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehaviour;
    QuackBehavior quackBehaviour;

    public void setFlyBehaviour(FlyBehavior fb) {
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehavior qb) {
        quackBehaviour = qb;
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All Ducks float, Even decoys");
    }

}
