package implement;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIremote extends Remote {
    public String rmiTest() throws RuntimeException, RemoteException;
}
