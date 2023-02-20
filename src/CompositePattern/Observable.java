package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wgPark on 2023-02-20.
 */
public class Observable implements QuackObservable{
    List<Observer> observers = new ArrayList<Observer>();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck = duck;
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
