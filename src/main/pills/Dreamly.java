package pills;

/**
 * This is the Dreamly class, a subclass of the GelCap class.
 * @author Subteam B
 * @version 1.2
 */
public abstract class Dreamly extends GelCap
{
	/**
	 * Constructor for a Dreamly object.
	 * @param strength the strength of the Dreamly object
     * @param size the size of the Dreamly object
     * @param color the color of Dreamly object
	 * @param casing the casing of Dreamly object
	 * @param solution the solution of Dreamly object
	 * @param active the active of Dreamly object
	 */
	public Dreamly(double strength, double size, String color, 
				   String casing, String solution, String active)
	{
		super("Dreamly", strength, size, color, casing, solution, active);
	}


}
