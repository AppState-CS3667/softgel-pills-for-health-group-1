package pills;

/**
 * This is the Dreamly class, a subclass of the GelCap class.
 * @author Subteam B
 * @version 1.0
 */
public abstract class Dreamly extends GelCap
{
	/**
	 * Constructor for a Dreamly object.
	 * @param strength the strength of the AcheAway object
     * @param size the size of the AcheAway object
     * @param color the color of AcheAway object
	 * @param casing
	 * @param solution
	 * @param active
	 */
	public Dreamly(double strength, double size, String color, 
				   String casing, String solution, String active)
	{
		super("Dreamly", strength, size, color, casing, solution, active);
	}


}
