package implement;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RMIremoteTest extends UnicastRemoteObject implements RMIremote {
    public RMIremoteTest() throws RemoteException {
        super();
    }

    @Override
    public String rmiTest() throws RuntimeException {
        return "RMI 演示";
    }
}
