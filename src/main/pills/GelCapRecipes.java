package pills;

import java.util.HashMap;
import java.rmi.Remote;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;

import pills.ActiveGenerator;
import pills.CasingGenerator;
import pills.SolutionGenerator;

/**
 * GelCapRecipes that remotely access generators
 *
 * @author subteamA
 * @version 04/10/2023
 */

public class GelCapRecipes extends UnicastRemoteObject implements Remote 
{
    public static final HashMap<String, CasingGenerator> CASINGS = getCasings();
    public static final HashMap<String, SolutionGenerator> SOLUTIONS = getSolutions();
    public static final HashMap<String, ActiveGenerator> ACTIVES = getActives();
    private static final String str = "rmi://152.10.10.40/";

    
	

    private static HashMap<String, CasingGenerator> getCasings()
    {
        try
	{
	HashMap<String, CasingGenerator> thisMap = new HashMap<String, CasingGenerator>();
	CasingGenerator cd = (CasingGenerator) (Naming.lookup(addr + "Gelatin"));
	CasingGenerator ca = (CasingGenerator) (Naming.lookup(addr + "Plasticizer"));
        thisMap.put("dreamly", cd);
        thisMap.put("acheAway", ca);
        } catch (MalformedURLException | RemoteException e)
	{
		e.printStackTrace();	
	}
	return thisMap;
	
    }

    private static HashMap<String, SolutionGenerator> getSolutions()
    {
	try
	{
	HashMap<String, SolutionGenerator> thisMap = new HashMap<String, SolutionGenerator>();
	SolutionGenerator sd = (SolutionGenerator) (Naming.lookup(addr + "Oil"));
	SolutionGenerator sa = (SolutionGenerator) (Naming.lookup(addr + "Saline"));
	thisMap.put("dreamly", sd);
	thisMap.put("acheAway", sa);
	} catch (MalformedURLException | RemoteException e)
	{
		e.printStackTrace();
	}
	return thisMap; 
   }

   private static HashMap<String, ActiveGenerator> getGenerator()
   {
	try
	{
	HashMap<String, ActiveGenerator> thisMap = new HashMap<String, ActiveGenerator>();
	ActiveGenerator ad = (ActiveGenerator) (Naming.lookup(addr + "Acetaminophen"));
	ActiveGenerator aa = (ActiveGenerator) (Naming.lookup(addr + "Zolpidem"));
	} catch (MalformedURLException | RemoteException e)
	{
		e.printStackTrace();
	}
	return thisMap;
   }
}

