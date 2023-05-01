package pills;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the OilSolution class that implements SolutionGenerator.
 * @author Subteam B
 * @version 1.2
 */
public class OilSolution extends UnicastRemoteObject implements SolutionGenerator
{
    /**
     * Constructor for class that calls the
     * superclass's constructor.
     * @param port the chosen port
     * @throws RemoteException
     */
    protected OilSolution(int port) throws RemoteException
    {
        super(port);
    }
    /**
     * Implemented method from SolutionGenerator interface,
     * Creates oil solution.
     * @return String to complete generation
     */
    @Override
    public String generateSolution() 
    {
        String output = String.format("Extracting pill-sized quantity of oil..."
                                      + "\nReturning oil solution\n");
        System.out.print(output);
        return "oil";
    }
}
