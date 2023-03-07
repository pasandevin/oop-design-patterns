package iteratorbuiltin;

import iteratorbuiltin.aggregate.CafeMenu;
import iteratorbuiltin.aggregate.DinerMenu;
import iteratorbuiltin.aggregate.Menu;
import iteratorbuiltin.aggregate.PancakeHouseMenu;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {

        ArrayList menus = new ArrayList();

        Menu pancakeHouseMenu = (Menu) new PancakeHouseMenu();
        Menu dinerMenu = (Menu) new DinerMenu();
        Menu cafeMenu = (Menu) new CafeMenu();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        menus.add(cafeMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }
}
