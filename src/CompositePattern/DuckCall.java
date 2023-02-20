package CompositePattern;

/**
 * Created by wgPark on 2023-02-20.
 */
public class DuckCall implements Quackable{
    Observable observable;
    public DuckCall(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("꽉꽉");
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
