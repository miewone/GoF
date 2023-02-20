package ProxyPattern;

/**
 * Created by wgPark on 2023-02-11.
 */
public class NoQuarterState implements State {
    private static final long serialVersionUID = 2L;
    transient GumballMachine gumballMachine;


    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("동적을 넣으셨습니다.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어 주세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어 주세요");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어 주세요");
    }

    @Override
    public void refill() {

    }
}
