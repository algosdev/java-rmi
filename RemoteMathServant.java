import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteMathServant extends UnicastRemoteObject implements IRemoteMath {


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    protected RemoteMathServant(final int port) throws RemoteException {
        super(port);
    }

    public RemoteMathServant() throws RemoteException {
        super();

    }

    public double add (final double i, final double j ) throws RemoteException {

        return (i+j);

    }

    public double subtract ( final double i, final double j ) throws RemoteException {

        return (i-j);

    }
    public double divide ( final double i, final double j ) throws RemoteException {

    return (i/j);

    }
    public double multiply ( final double i, final double j ) throws RemoteException {

    return (i*j);

    }



}
