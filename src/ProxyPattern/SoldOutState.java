package ProxyPattern;

/**
 * Created by wgPark on 2023-02-11.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("매진 상태입니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("매진 상태입니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("매진 상태입니다.");
    }

    @Override
    public void dispense() {
        System.out.println("매진 상태입니다.");
    }

    @Override
    public void refill() {
        System.out.println("상품을 다시 채웁니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
