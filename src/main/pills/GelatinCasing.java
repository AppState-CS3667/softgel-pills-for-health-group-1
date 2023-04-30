package pills;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 * This is the GelatinCasing class.
 * A subclass of the UnicastRemoteObject 
 * class and extends CasingGenerator.
 * @author Subteam A
 * @version 1.0
 */
public class GelatinCasing extends UnicastRemoteObject implements CasingGenerator
{
    /**
     * Constructor for class that calls the
     * superclass's constructor.
     * @param port the chosen port
     * @throws RemoteException
     */
    protected GelatinCasing(int port) throws RemoteException
    {
        super(port);
    }
    /**
     * Implemented method from CasingGenerator interface,
     * Creates gelatin casing.
     * @return String to complete generation
     */
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
