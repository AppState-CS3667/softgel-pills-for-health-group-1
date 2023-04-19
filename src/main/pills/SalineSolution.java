package pills;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the SalineSolution class that implements SolutionGenerator.
 * @author Subteam B
 * @version 1.0
 */
public class SalineSolution extends UnicastRemoteObject implements SolutionGenerator
{
    protected SalineSolution(int port) throws RemoteException
    {
        super(port);
    }

    @Override
    public String generateSolution() 
    {
        String output = String.format("Mixing salt and water..."
                                      + "\nVerifying ratio..."
                                      + "\nReturning saline solution\n");
        System.out.print(output);
        return "saline";
    }
}
