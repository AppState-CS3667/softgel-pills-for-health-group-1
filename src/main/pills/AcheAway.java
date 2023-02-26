package pills;

/**
 * This is the AcheAway class, a subclass of the GelCap class.
 * @author Subteam A
 * @version 1.2
 */
public class AcheAway extends GelCap
{
    /**
     * Constructor for an AcheAway object.
     * @param strength the strength of the AcheAway object
     * @param size the size of the AcheAway object
     * @param color the color of AcheAway object
     */
    public AcheAway(double strength, double size, String color)  
    {
        super("AcheAway", strength, size, color);
    }
    
    /**
     * Prints the casing field.
    */
    @Override
    protected void addCasing() 
    {
        casing = "Gelatin";
        System.out.printf("adding %s casing\n", casing);
    }

    /**
     * Prints the solution field.
    */
    @Override
    protected void addSolution() 
    {
        solution = "Saline";
        System.out.printf("adding %s solution\n", solution);
    }

    /**
     * Prints the active field.
    */
    @Override
    protected void addActive() 
    {
        active = "Acetaminophen";
        System.out.printf("adding %s active\n", active);
    }
}
