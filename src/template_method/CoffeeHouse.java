package template_method;

public class CoffeeHouse {
    public static void main(String[] args) {
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        System.out.println("Making tea...");
        tea.prepareRecipe();

        System.out.println("Making coffee...");
        coffee.prepareRecipe();
    }
}
