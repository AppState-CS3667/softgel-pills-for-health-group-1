package pills;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GelatinCasing extends UnicastRemoteObject implements CasingGenerator
{
    public GelatinCasing() throws RemoteException {};

    @Override
    public String generateCasing() throws RemoteException
    {
        String output = String.format("Mixing gelatin, water, opacifier," 
                                      + " and glycerin .\nShaping .\nReturning"
                                      + " gelatin casing .\n");
        System.out.print(output);
        return "gelatin";
    }
}
