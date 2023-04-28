package pills;

/**
 * This is the ChildGelCapFactory singleton class that extends GelCapFactory.
 * @author Subteam B
 * @version 1.0
 */
public class ChildGelCapFactory extends GelCapFactory
{
    private static ChildGelCapFactory childGelCapFactoryInst;

    /**
 	 * The private constructor.
 	 */
    private ChildGelCapFactory() {
        super();
    }

    /**
 	 * The getInstance method.
 	 * @return a ChildGelCapFactory object 
 	 */
    public static ChildGelCapFactory getInstance() {
        if (childGelCapFactoryInst == null) {
			synchronized(ChildGelCapFactory.class) {
				if (childGelCapFactoryInst == null) {
                    childGelCapFactoryInst = new ChildGelCapFactory();
                }
            }
        }	
		return childGelCapFactoryInst;
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
        System.out.print("Constructing child version of Dreamly\n");
        return new ChildDreamly(casing, solution, active);
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
        System.out.print("Constructing child version of AcheAway\n");
        return new ChildAcheAway(casing, solution, active);
    }
  
    /**
    * The getDreamlyStrength method.
    * @return a double
    */ 
    @Override
    protected double getDreamlyStrength() 
    {
        return ChildDreamly.STRENGTH;
    }
  
    /**
     * The getAcheAwayStrength method.
     * @return a double
     */ 
    @Override
    protected double getAcheAwayStrength() 
    {
        return ChildAcheAway.STRENGTH;
    }
}
