package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wgPark on 2023-02-20.
 */
public class Flock implements  Quackable{ // Composite Patten
    // 복합 객체와 잎 원소에서 같은 인터페이스를 구현해야 한다.
    // 이 코드에서는 Quackable이 잎 원소가 된다.
    List<Quackable> quackers = new ArrayList<Quackable>();
    Observable observable;

    public Flock(){
        observable = new Observable(this);
    }
    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    public void quack(){
        Iterator<Quackable> iterator = quackers.iterator(); // 반복자 패턴
        while(iterator.hasNext()){
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
}
