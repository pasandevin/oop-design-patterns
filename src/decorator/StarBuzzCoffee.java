package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.Espresso;
import decorator.beverage.HouseBlend;
import decorator.condimentdecorator.Mocha;

public class StarBuzzCoffee {

        public static void main(String[] args) {

            Beverage beverage = new Espresso();
            System.out.println(beverage.getDescription() + " $" + beverage.cost());
            beverage = new Mocha(beverage);
            beverage = new Mocha(beverage);
            System.out.println(beverage.getDescription() + " $" + beverage.cost());

            Beverage beverage2 = new HouseBlend();
            beverage2 = new Mocha(beverage2);
            System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        }
}
