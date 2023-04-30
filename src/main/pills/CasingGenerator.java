package pills;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is the ActiveGenerator interface.
 * @author Subteam B
 * @version 1.0
 */
public interface CasingGenerator extends Remote
{
    /**
     * Will generate the casing needed when
     * implemented.
     * @return String as casing
     */
    public String generateCasing() throws RemoteException;
}
