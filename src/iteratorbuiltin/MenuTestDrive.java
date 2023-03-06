package iteratorbuiltin;

import iteratorbuiltin.aggregate.CafeMenu;
import iteratorbuiltin.aggregate.DinerMenu;
import iteratorbuiltin.aggregate.Menu;
import iteratorbuiltin.aggregate.PancakeHouseMenu;

public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = (Menu) new PancakeHouseMenu();
        Menu dinerMenu = (Menu) new DinerMenu();
        Menu cafeMenu = (Menu) new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
