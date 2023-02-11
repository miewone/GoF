package IteratorPattern;

import java.util.Iterator;

/**
 * Created by wgPark on 2023-02-09.
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
