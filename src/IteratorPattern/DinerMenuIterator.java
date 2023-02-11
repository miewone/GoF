package IteratorPattern;

import java.util.Iterator;
/**
 * Created by wgPark on 2023-02-09.
 */
public class DinerMenuIterator implements Iterator<MenuItem>{
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position =+1;
        return menuItem;
    }

    public void remove(){
        throw new UnsupportedOperationException("메뉴 항목은 지우면 안됨");
    }
}
