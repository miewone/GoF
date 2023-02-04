package AdapterPattern;

import java.util.Iterator;

/**
 * Created by wgPark on 2023-02-04.
 */
public class DuckAdapter implements Turkey{
    Duck duck;
    public DuckAdapter(Duck duck){
        this.duck = duck;
    }
    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
