package pills;

public class ChildGelCapFactory extends GelCapFactory{
    /**
 	 * The constructDreamly method.
     * @param casing
     * @param solution
     * @param active
 	 * @return a Dreamly object 
 	 */ 
    @Override
    protected Dreamly constructDreamly(String casing, String solution, String active) {
        System.out.print("Constructing child version of Dreamly");
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
    protected AcheAway constructAcheAway(String casing, String solution, String active) {
        System.out.print("Constructing child version of AcheAway");
        return new ChildAcheAway(casing, solution, active);
    }
  
    /**
    * The getDreamlyStrength method.
    * @return a double
    */ 
    @Override
    protected double getDreamlyStrength() {
        return ChildDreamly.STRENGTH;
    }
  
    /**
     * The getAcheAwayStrength method.
     * @return a double
     */ 
    @Override
    protected double getAcheAwayStrength() {
        return ChildAcheAway.STRENGTH;
    }
}
