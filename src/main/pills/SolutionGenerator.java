package pills;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * This is the SolutionGenerator interface.
 * @author Subteam B
 * @version 1.1
 */
public interface SolutionGenerator extends Remote
{
    /**
     * Will generate a solution when implemented.
     * @return a String to complete generation of solution
     * @throws RemoteException
     */
    public String generateSolution() throws RemoteException;
}
