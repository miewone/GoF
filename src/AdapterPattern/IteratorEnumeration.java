package AdapterPattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by wgPark on 2023-02-04.
 */
public class IteratorEnumeration implements Enumeration<Object> {
    Iterator<?> iterator;

    public IteratorEnumeration(Iterator<?> iterator){
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.hasNext();
    }
}
