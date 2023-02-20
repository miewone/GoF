package ProxyPattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wgPark on 2023-02-11.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
