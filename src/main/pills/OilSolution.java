package pills;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the OilSolution class that implements SolutionGenerator.
 * @author Subteam B
 * @version 1.0
 */
public class OilSolution extends UnicastRemoteObject implements SolutionGenerator
{
    protected OilSolution(int port) throws RemoteException
    {
        super(port);
    }

    @Override
    public String generateSolution() 
    {
        String output = String.format("Extracting pill-sized quantity of oil..."
                                      + "\nReturning oil solution\n");
        System.out.print(output);
        return "oil";
    }
}
