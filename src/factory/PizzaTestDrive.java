package factory;

import factory.creator.ChicagoPizzaStore;
import factory.creator.NYPizzaStore;
import factory.creator.PizzaStore;
import factory.product.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {

        // Creating new PizzaStores
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        // Ordering a Pizza from NYStore
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        // Ordering a Pizza from ChicagoStore
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
