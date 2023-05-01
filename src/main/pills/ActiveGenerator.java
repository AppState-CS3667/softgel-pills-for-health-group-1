package pills;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is the ActiveGenerator interface.
 * @author Subteam A
 * @version 1.1
 */
public interface ActiveGenerator extends Remote
{
    /**
     * Will generate the active needed with 
     * the correct amount when implemented.
     * @param amount needed for active. 
     * @return String as active
     */
    public String generateActive(double amount) throws RemoteException;
}
