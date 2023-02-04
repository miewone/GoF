package AdapterPattern;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by wgPark on 2023-02-04.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        Enumeration<Integer> enumeration = vector.elements();
        EnumerationIterator iteratorEnumeration = new EnumerationIterator(enumeration);

        while(iteratorEnumeration.hasNext()){
            System.out.println(iteratorEnumeration.next());
        }


    }
}
