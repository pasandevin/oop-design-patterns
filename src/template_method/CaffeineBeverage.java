package template_method;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    public final void boilWater() {
        System.out.println("Boiling water");
    }

    public final void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
