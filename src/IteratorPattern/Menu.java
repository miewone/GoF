package IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wgPark on 2023-02-09.
 */
//public interface Menu {
//    public Iterator<MenuItem> createIterator();
//}
public class Menu extends MenuComponent{
    List<MenuComponent> menuComponents =new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("\n"+ getName());
        System.out.println(", "+getDescription());
        System.out.println("-------------------");

        for(MenuComponent menuComponent: menuComponents){
            menuComponent.print();
        }
    }
}