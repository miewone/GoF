package CompositePattern;

/**
 * Created by wgPark on 2023-02-20.
 */
public class RubberDuck implements Quackable{

    Observable observable;

    public RubberDuck(){
        observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("삑삑");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObserver() {

    }
}
