package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wgPark on 2023-02-09.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
//        PancakeMenu pancakeMenu = new PancakeMenu();
//        DinerMenu dinerMenu = new DinerMenu();
//        CafeMenu cafeMenu = new CafeMenu();
//        List<Menu> menus = new ArrayList<Menu>();
//        menus.add(0,pancakeMenu);
//
//        Waitress waitress = new Waitress(pancakeMenu,dinerMenu,cafeMenu);
//        waitress.printMenu();

        MenuComponent pancakeHouseMenu = new Menu("pancake","morning");
        MenuComponent dinerMenu = new Menu("Object restaurant menu","afternoon");
        MenuComponent cafeMenu = new Menu("Cafe menu","dinner Menu");
        MenuComponent dessertMenu = new Menu("dessert Menu","enjoy dessert");

        MenuComponent allMenus = new Menu("All Menus","All Menus");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("pasta","marinara",true,3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Apple pie","Cranch crust",true,1.69));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();


    }
}
