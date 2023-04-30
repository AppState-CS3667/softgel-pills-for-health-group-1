package pills;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.util.HashMap;
import java.rmi.RemoteException;

public class GelCapRecipes 
{
    public static final HashMap<String, CasingGenerator> CASINGS = getCasings();
    public static final HashMap<String, SolutionGenerator> SOLUTIONS = getSolutions();
    public static final HashMap<String, ActiveGenerator> ACTIVES = getActives();

    private static HashMap<String, CasingGenerator> getCasings()
    {
        HashMap<String, CasingGenerator> thisMap = new HashMap<String, CasingGenerator>();
        try
        {
            // thisMap.put("dreamly", new GelatinCasing());
            thisMap.put("dreamly", 
                (CasingGenerator) Naming.lookup("rmi://152.10.10.40/GelatinCasing"));
            thisMap.put("acheAway", 
                (CasingGenerator) Naming.lookup("rmi://152.10.10.40/PlasticizerCasing"));
            return thisMap;
        }
        catch (RemoteException e)
        {
            return thisMap;
        } 
        catch (MalformedURLException e) 
        {
            return thisMap;
        } 
        catch (NotBoundException e) 
        {
            return thisMap;
        }
    }

    private static HashMap<String, SolutionGenerator> getSolutions()
    {
        HashMap<String, SolutionGenerator> thisMap = new HashMap<String, SolutionGenerator>();
        try
        {
            thisMap.put("dreamly", 
                (SolutionGenerator) Naming.lookup("rmi://152.10.10.40/OilSolution"));
            thisMap.put("acheAway", 
                (SolutionGenerator) Naming.lookup("rmi://152.10.10.40/SalineSolution"));
            return thisMap;
        }
        catch (RemoteException e)
        {
            return thisMap; 
        } 
        catch (MalformedURLException e) 
        {
            return thisMap;
        } 
        catch (NotBoundException e) 
        {
            return thisMap;
        }
    }

    private static HashMap<String, ActiveGenerator> getActives()
    {
        HashMap<String, ActiveGenerator> thisMap = new HashMap<String, ActiveGenerator>();
        try
        {
            thisMap.put("dreamly", 
                (ActiveGenerator) Naming.lookup("rmi://152.10.10.40/AcetaminophenActive"));
            thisMap.put("acheAway", 
                (ActiveGenerator) Naming.lookup("rmi://152.10.10.40/ZolpidemActive"));
            return thisMap;
        }
        catch (RemoteException e)
        {
            return thisMap;
        } 
        catch (MalformedURLException e) 
        {
            return thisMap;
        } 
        catch (NotBoundException e) 
        {
            return thisMap;
        }
    }
}
