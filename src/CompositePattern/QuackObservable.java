package CompositePattern;

/**
 * Created by wgPark on 2023-02-20.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObserver();
}
