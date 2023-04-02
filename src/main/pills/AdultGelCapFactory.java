package pills;

public class AdultGelCapFactory extends GelCapFactory
{
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
        System.out.print("Constructing adult version of Dreamly");
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
        System.out.print("Constructing adult version of AcheAway");
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
