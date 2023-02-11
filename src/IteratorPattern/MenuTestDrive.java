package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wgPark on 2023-02-09.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();
        List<Menu> menus = new ArrayList<Menu>();
        menus.add(0,pancakeMenu);

        Waitress waitress = new Waitress(pancakeMenu,dinerMenu,cafeMenu);
        waitress.printMenu();
    }
}
