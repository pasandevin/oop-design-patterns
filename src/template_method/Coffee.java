package template_method;

public class Coffee extends CaffeineBeverage {
     void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    protected void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
