package pills;

import java.rmi.RemoteException;

/**
 *GelCapFactory class.
 *@author Subteam A
 *@version 1.0
 */
public abstract class GelCapFactory 
{
    /**
 	 * The produceDreamly method.
 	 * @return a Dreamly object 
 	 */ 	
    public final Dreamly produceDreamly() 
    {
        System.out.print("Creating a Dreamly pill...\n");
        Dreamly result;
        try
        {
            result = constructDreamly(
                GelCapRecipes.CASINGS.get("dreamly").generateCasing(),   
                GelCapRecipes.SOLUTIONS.get("dreamly").generateSolution(), 
                GelCapRecipes.ACTIVES.get("dreamly").generateActive(getAcheAwayStrength()));
        }
        catch (RemoteException e)
        {
            return null;
        }
        if (qualityCheck()) 
        {
            System.out.print("Returning a good Dreamly GelCap Pill\n");
            return result;
        }
        else 
        {
            System.out.print("Error during Dreamly production."
                             + " Returning null.\n");
            return null;
        }
    }

    /**
 	 * The produceAcheAway method.
 	 * @return a Dreamly object 
 	 */ 	
    public final AcheAway produceAcheAway()
    {
        System.out.print("Creating a AcheAway pill...\n");
        AcheAway result;
        try
        {
            result = constructAcheAway(
                GelCapRecipes.CASINGS.get("acheAway").generateCasing(), 
                GelCapRecipes.SOLUTIONS.get("dreamly").generateSolution(), 
                GelCapRecipes.ACTIVES.get("dreamly").generateActive(getAcheAwayStrength()));
        }
        catch (RemoteException e)
        {
            return null;
        }
        if (qualityCheck()) 
        {
            System.out.print("Returning a good AcheAway GelCap Pill\n");
            return result;
        }
        else 
        {
            System.out.print("Error during AcheAway production."
                             + " Returning null.\n");
            return null;
        }
    }

    /**
 	 * The qualityCheck method.
 	 * @return a boolean
 	 */ 	
    private final boolean qualityCheck() 
    {
        final double PERCENT = 0.9;
        System.out.print("Performing quality check...\n");
        if (Math.random() < PERCENT) 
        {
            System.out.print("quality check passed\n");
            return true;
        }
        else 
        {
            System.out.print("quality check failed\n");
            return false;
        }
    }

    /**
 	 * The abstract constructDreamly method.
     * @param casing
     * @param solution
     * @param active
     * @return abstract
 	 */ 	
    protected abstract Dreamly constructDreamly(String casing, 
                                                String solution, 
                                                String active);

    /**
 	 * The abstract constructAcheAway method.
     * @param casing
     * @param solution
     * @param active
     * @return abstract
 	 */ 	
    protected abstract AcheAway constructAcheAway(String casing, 
                                                  String solution, 
                                                  String active);

    /**
 	 * The abstract getDreamlyStrength method.
     * @return abstract
 	 */ 	
    protected abstract double getDreamlyStrength();

    /**
     * The abstract getAcheAwayStrength method.
     * @return abstract
     */ 	
    protected abstract double getAcheAwayStrength();
}
