package pills;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the ZolpidemActive class that implements ActiveGenerator.
 * @author Subteam A
 * @version 1.1
 */
public class ZolpidemActive extends UnicastRemoteObject implements ActiveGenerator 
{   
    /**
     * Constructor for an ZolpidemActive object.
     * @param port for the remote. 
     */
    protected ZolpidemActive(int port) throws RemoteException
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
        String output = String.format("Opening secure storage area...\n"
                                      + "Carefully extracting %.2fmg of zolpidem\n"
                                      + "Returning %.2fmg of zolpidem\n", amount, amount);
        System.out.print(output);
        return "zolpidem";
    }
    
}
