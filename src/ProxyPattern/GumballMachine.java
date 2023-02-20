package ProxyPattern;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by wgPark on 2023-02-11.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    State soldOutState;
    State noQuarterState;

    @Override
    public String getLocation() throws RemoteException {
        return null;
    }

    @Override
    public State getState() throws RemoteException {
        return null;
    }

    State hasQuarterState;
    State soldState;
    State winnerState;

    String location;

    State state;

    int count = 0;
    public GumballMachine(int numberGumballs) throws RemoteException {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if(numberGumballs >0 ){
            state = noQuarterState;
        }else{
            state = soldOutState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinnerState() {
        return winnerState;
    }
    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCrank(){
        state.turnCrank();
    }

    public void dispense(){
        state.dispense();
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public int getCount() {
        return count;
    }

    public State getSoldState() {
        return soldState;
    }

    void releaseBall(){
        System.out.println("알맹이를 내보내고 있습니다.");
        if(count >0){
            count -= 1;
        }
    }
    @Override
    public String toString() {
        return "상태 "+ count;
    }
}
