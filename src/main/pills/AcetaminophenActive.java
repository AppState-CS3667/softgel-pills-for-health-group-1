package pills;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the AcetaminophenActive class that implements ActiveGenerator.
 * @author Subteam A
 * @version 1.0
 */
public class AcetaminophenActive extends UnicastRemoteObject  implements ActiveGenerator 
{
    public AcetaminophenActive() throws RemoteException {};

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
