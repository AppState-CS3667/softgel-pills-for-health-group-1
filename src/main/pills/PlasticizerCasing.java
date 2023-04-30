package pills;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * This is the PlasticizerCasing class that implements CasingGenerator.
 * @author Subteam A
 * @version 1.0
 */
public class PlasticizerCasing extends UnicastRemoteObject  implements CasingGenerator
{
    /**
     * Constructor for class that calls the
     * superclass's constructor.
     * @param port the chosen port
     * @throws RemoteException
     */
    protected PlasticizerCasing(int port) throws RemoteException
    {
        super(port);
    }
    /**
     * Implemented method from CasingGenerator interface,
     * Creates plasticizer casing.
     * @return String to complete generation
     */
    @Override
    public String generateCasing() 
    {
        String output = String.format("Mixing starch, water, opacifier, and glycerin...\n"
                                      + "Shaping...\nReturning plasticizer casing...\n");
        System.out.print(output);
        return "plasticizer";
    }
}
