package pills;

/**
 * This is the AcheAway class, a subclass of the GelCap class.
 * @author Subteam A
 * @version 1.2
 */
public abstract class AcheAway extends GelCap
{
    /**
     * Constructor for an AcheAway object.
     * @param strength the strength of the AcheAway object
     * @param size the size of the AcheAway object
     * @param color the color of AcheAway object
     */
    public AcheAway(double strength, double size, String color, String casing, String solution, String active)  
    {
        super("AcheAway", strength, size, color, casing, solution, active);
    }
    
}
