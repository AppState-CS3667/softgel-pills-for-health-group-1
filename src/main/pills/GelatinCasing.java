package pills;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GelatinCasing extends UnicastRemoteObject implements CasingGenerator
{
    protected GelatinCasing(int port) throws RemoteException
    {
        super(port);
    }

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
