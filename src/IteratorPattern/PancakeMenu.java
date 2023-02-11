package IteratorPattern;

import java.util.Iterator;
import java.util.List;

/**
 * Created by wgPark on 2023-02-09.
 */
public class PancakeMenu{
    List<MenuItem> menuItems;

    public Iterator<MenuItem> createIterator(){
//        return new PancakeHouseIterator(menuItems);
        return menuItems.iterator();
    }
}
