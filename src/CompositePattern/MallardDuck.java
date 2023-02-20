package CompositePattern;

/**
 * Created by wgPark on 2023-02-20.
 */
public class MallardDuck implements Quackable{
    Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("빽빽");
        notifyObserver();
    }

    public void registerObserver(Observer observer){
        observable.registerObserver(observer);
    }


    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }
}
