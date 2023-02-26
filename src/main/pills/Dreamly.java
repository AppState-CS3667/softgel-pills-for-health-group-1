package pills;

/**
 * This is the Dreamly class, a subclass of the GelCap class.
 * @author Subteam B
 * @version 1.0
 */
public class Dreamly extends GelCap
{
	/**
	 * Constructor for a Dreamly object.
	 * @param strength the strength of the AcheAway object
     * @param size the size of the AcheAway object
     * @param color the color of AcheAway object
	 */
	public Dreamly(double strength, double size, String color)
	{
		super("Dreamly", strength, size, color);
	}

	/**
	 * Prints the casing field.
	 */
	@Override	
	protected void addCasing()
	{
		casing = "Plasticizer";
		System.out.println("adding Plasticizer casing");
	}
	
	/**
	 * Prints the solution field.
	 */
	@Override
	protected void addSolution()
	{
		solution = "Oil";
		System.out.println("adding Oil solution");
	}
	
	/**
	 * Prints the active field.
	 */
	@Override
	protected void addActive()
	{
		active = "Zolpidem";
		System.out.println("adding Zolpidem active");
	}

}
