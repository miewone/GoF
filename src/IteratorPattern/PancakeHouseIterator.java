//package IteratorPattern;
//
//import java.util.Iterator;
//import java.util.List;
//
///**
// * Created by wgPark on 2023-02-09.
// */
//public class PancakeHouseIterator implements Iterator {
//    List<MenuItem> menuItems;
//    int position;
//    public PancakeHouseIterator(List<MenuItem> items){
//        this.menuItems = items;
//    }
//
//    @Override
//    public boolean hasNext() {
//        if(menuItems.isEmpty() || menuItems.get(position) == null){
//            return false;
//        }else {
//            return true;
//        }
//    }
//
//    @Override
//    public Iterator<MenuItem> next() {
//        MenuItem menuItem = menuItems.get(position);
//        position += 1;
//        return menuItem;
//    }
//}
