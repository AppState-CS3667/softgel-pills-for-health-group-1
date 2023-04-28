package pills;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is the ActiveGenerator interface.
 * @author Subteam A
 * @version 1.0
 */
public interface ActiveGenerator extends Remote
{
    public String generateActive(double amount) throws RemoteException;
}
