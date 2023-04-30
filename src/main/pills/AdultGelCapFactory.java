package pills;

/**
 * This is the AdultGelCapFactory singleton class that extends GelCapFactory.
 * @author Subteam B
 * @version 1.0
 */
public class AdultGelCapFactory extends GelCapFactory
{
    private static AdultGelCapFactory adultGelCapFactoryInst;

    /**
 	 * The private constructor.
 	 */
    private AdultGelCapFactory() 
    {
        super();
    }

    /**
 	 * The getInstance method.
 	 * @return a AdultGelCapFactory object 
 	 */
    public static AdultGelCapFactory getInstance() 
    {
        if (adultGelCapFactoryInst == null) 
        {
			synchronized (AdultGelCapFactory.class) 
            {
				if (adultGelCapFactoryInst == null) 
                {
                    adultGelCapFactoryInst = new AdultGelCapFactory();
                }
            }
        }	
		return adultGelCapFactoryInst;
    }

    
    /**
 	 * The constructDreamly method.
     * @param casing
     * @param solution
     * @param active
 	 * @return a Dreamly object 
 	 */ 
    @Override
    protected Dreamly constructDreamly(String casing, String solution, 
                                       String active) 
    {
        System.out.print("Constructing adult version of Dreamly\n");
        return new AdultDreamly(casing, solution, active);
    }

    /**
 	 * The constructAcheAway method.
     * @param casing
     * @param solution
     * @param active
 	 * @return a AcheAway object 
 	 */ 
    @Override
    protected AcheAway constructAcheAway(String casing, String solution, 
                                         String active) 
    {
        System.out.print("Constructing adult version of AcheAway\n");
        return new AdultAcheAway(casing, solution, active);
    }

    /**
 	 * The getDreamlyStrength method.
 	 * @return a double
 	 */ 
    @Override
    protected double getDreamlyStrength() 
    {
        return AdultDreamly.STRENGTH;
    }

    /**
 	 * The getAcheAwayStrength method.
 	 * @return a double
 	 */ 
    @Override
    protected double getAcheAwayStrength() 
    {
        return AdultAcheAway.STRENGTH;
    }
}
