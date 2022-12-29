package Strategy;

import Strategy.Duck.Duck;
import Strategy.Duck.MallardDuck;
import Strategy.Duck.ModelDuck;
import Strategy.FlyBehavior.FlyRocketPowered;

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
