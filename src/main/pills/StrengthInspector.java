package pills;
/**
 * Inspector class that extends the Inspector
 * abstract class that aims to check the Strength
 * of pills in an order.
 * author
 * @author Subteam B
 * @version 1.0
 */
public class StrengthInspector extends Inspector
{
    private double dreamlyStrength;
    private double acheAwayStrength;
    /**
     * Getter for the dreamlyStrength field.
     * @return total dreamlyStrength
     */
    public double getDreamlyStrength()
    {
        return dreamlyStrength;
    }
    /**
     * Getter for the acheAwayStrength field.
     * @return total acheAwayStrength
     */
    public double getAcheAwayStrength()
    {
        return acheAwayStrength;
    }
    /**
    * Inspects object passed and adds 
    * to acheAwayStrength.
    * @param e an AdultAcheAway object
    */
    @Override
    public void inspect(AdultAcheAway e)
    {
        acheAwayStrength += e.getStrength(); 
    }
    /**
    * Inspects object passed and adds 
    * to acheAwayStrength.
    * @param e a ChildAcheAway object
    */
    @Override
    public void inspect(ChildAcheAway e)
    {
        acheAwayStrength += e.getStrength();
    }
    /**
    * Inspects object passed and adds 
    * to dreamlyStrength
    * @param e a AdultDreamly object
    */
    @Override
    public void inspect(AdultDreamly e)
    {
   		dreamlyStrength += e.getStrength(); 
	}
    /**
    * Inspects object passed and adds 
    * to dreamlyStrength
    * @param e a ChildDreamly object
    */
    @Override
    public void inspect(ChildDreamly e)
    {
        dreamlyStrength += e.getStrength(); 
    }
    /**
     * Creates string that is a report
     * of the strength the inspectors calculated.
     * @return String that is the report
     */
    public String report()
    {
		return "Strength Report\n\tAcheAway Pills : " 
            + getAcheAwayStrength() + "\n\tChild Pills : " + getDreamlyStrength(); 
	}
    /**
     * Resets the field back to zero.
     */
    public void reset()
    {
        this.acheAwayStrength = 0;
        this.dreamlyStrength = 0;
    }
}
