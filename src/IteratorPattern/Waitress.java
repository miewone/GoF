package IteratorPattern;

import java.util.Iterator;
import java.util.List;

/**
 * Created by wgPark on 2023-02-09.
 */
public class Waitress {
    List<Menu> menus;
    public Waitress(List<Menu> menus){
        this.menus = menus;
    }

    public void printMenu(){
        Iterator<Menu> menuIterator = menus.iterator();

        while(menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator){
//        for (MenuItem menuItem: iterator){
//            System.out.println(menuItem.getPrice());
//        }
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() +", ");
            System.out.println(menuItem.getPrice()+ " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
