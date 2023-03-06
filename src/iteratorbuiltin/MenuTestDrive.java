package iteratorbuiltin;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = (Menu) new PancakeHouseMenu();
        Menu dinerMenu = (Menu) new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
