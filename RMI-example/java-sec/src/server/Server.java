package server;

import implement.RMIremote;
import implement.RMIremoteTest;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        RMIremote rmi = new RMIremoteTest();
        Registry registry = LocateRegistry.createRegistry(1099);
        registry.bind("rmi://127.0.0.1:1099/test", rmi);
    }
}
