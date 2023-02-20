package ProxyPattern;

/**
 * Created by wgPark on 2023-02-11.
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이는 한범나 돌려주세요");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            System.out.println("하나 더~");
            if(gumballMachine.getCount() == 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("알맹 없어");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
