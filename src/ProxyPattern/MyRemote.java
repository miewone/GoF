package ProxyPattern;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wgPark on 2023-02-11.
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;

}
