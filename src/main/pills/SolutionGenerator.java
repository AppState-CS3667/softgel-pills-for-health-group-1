package pills;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is the SolutionGenerator interface.
 * @author Subteam B
 * @version 1.0
 */
public interface SolutionGenerator extends Remote
{
    public String generateSolution() throws RemoteException;
}
