package pills;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the AcetaminophenActive class that implements ActiveGenerator
 * and extends the UnicastRemoteObject.
 * @author Subteam A
 * @version 1.2
 */
public class AcetaminophenActive extends UnicastRemoteObject  implements ActiveGenerator 
{
    /**
     * Constructor for an AcheAcetaminophenActiveAway object.
     * @param port for the remote. 
     */
    protected AcetaminophenActive(int port) throws RemoteException
    {
        super(port);
    }
    /**
     * Generates the active needed with 
     * the correct amount.
     * @param amount needed for active. 
     * @return String as active
     */
    @Override
    public String generateActive(double amount) 
    {
        String output = String.format("Acetylating para-aminophenol" 
        + " with acetic anhydride\n" 
        + "Carefully extracting %.2fmg of acetaminophen\n" 
        + "Returning %.2fmg of acetaminophen\n", amount, amount);
        System.out.print(output);
        return "acetaminophen";
    }
    
}
