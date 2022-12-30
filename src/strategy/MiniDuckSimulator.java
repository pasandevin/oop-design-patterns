package strategy;

import strategy.Duck.Duck;
import strategy.Duck.MallardDuck;
import strategy.Duck.ModelDuck;
import strategy.FlyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        //setting behaviour dynamically
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
