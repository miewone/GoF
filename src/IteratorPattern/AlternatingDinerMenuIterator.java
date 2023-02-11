package IteratorPattern;

import java.util.Calendar;
import java.util.Iterator;

/**
 * Created by wgPark on 2023-02-09.
 */
public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position;
    public AlternatingDinerMenuIterator(MenuItem[] items){
        this.items = items;
        position = Calendar.DAY_OF_WEEK%2;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) return true;
        else return false;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove()는 지원하지 않습니다.");
    }
}
