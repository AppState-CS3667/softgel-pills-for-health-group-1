package pills;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the ZolpidemActive class that implements ActiveGenerator.
 * @author Subteam A
 * @version 1.0
 */
public class ZolpidemActive extends UnicastRemoteObject implements ActiveGenerator 
{
    public ZolpidemActive() throws RemoteException {};

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
