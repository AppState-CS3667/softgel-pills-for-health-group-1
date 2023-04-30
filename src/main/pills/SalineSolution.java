package pills;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the SalineSolution class that implements SolutionGenerator.
 * @author Subteam B
 * @version 1.0
 */
public class SalineSolution extends UnicastRemoteObject implements SolutionGenerator
{
    /**
     * Constructor for class that calls the
     * superclass's constructor.
     * @param port the chosen port
     * @throws RemoteException
     */
    protected SalineSolution(int port) throws RemoteException
    {
        super(port);
    }
    /**
     * Implemented method from SolutionGenerator interface,
     * Creates saline solution.
     * @return String to complete generation
     */
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
