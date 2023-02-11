package IteratorPattern;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wgPark on 2023-02-09.
 */
public class CafeMenu implements Menu{
    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu(){

    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name,menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
