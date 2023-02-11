package StatePattern;

/**
 * Created by wgPark on 2023-02-11.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
