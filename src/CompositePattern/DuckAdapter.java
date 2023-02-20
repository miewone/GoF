package CompositePattern;

/**
 * Created by wgPark on 2023-02-20.
 */
public class DuckAdapter implements Quackable{ // Adapter Pattern
    Goose goose;
    Observable observable;

    public DuckAdapter(){
        observable = new Observable(this);
    }
    public DuckAdapter(Goose goose){
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
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
