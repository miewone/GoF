package CompositePattern;

/**
 * Created by wgPark on 2023-02-20.
 */
public class QuackCounter implements Quackable{ // Decorator 패턴
    Quackable duck;
    static int numberOfQuacks;
    Observable observable;
    public QuackCounter(Quackable duck){
        this.duck = duck;
        observable = new Observable(this);
    }


    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObserver() {
        observable.notifyObserver();
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks(){
        return numberOfQuacks;
    }
}
