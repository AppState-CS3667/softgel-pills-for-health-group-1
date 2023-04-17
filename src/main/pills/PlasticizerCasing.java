package pills;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the SalineSolution class that implements SolutionGenerator.
 * @author Subteam A
 * @version 1.0
 */
public class PlasticizerCasing extends UnicastRemoteObject  implements CasingGenerator
{
    public PlasticizerCasing() throws RemoteException {};

    @Override
    public String generateCasing() 
    {
        String output = String.format("Mixing starch, water, opacifier, and glycerin...\n"
                                      + "Shaping...\nReturning plasticizer casing...\n");
        System.out.print(output);
        return "plasticizer";
    }
}
