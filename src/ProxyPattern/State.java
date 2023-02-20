package ProxyPattern;

import java.io.Serializable;

/**
 * Created by wgPark on 2023-02-11.
 */
public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
