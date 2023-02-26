package pills;

/**
 * This is the GelCap class, an abstract class for a soft gel pill.
 * @author Subteam B
 * @version 1.5
 */
public abstract class GelCap
{
	protected String name;
	protected double strength;
	protected double size;
	protected String color;
	protected String casing;
	protected String solution;
	protected String active;

	/**
	 * Constructor for an object that extends GelCap. Calls the manufacture 
	 * method after setting name, strength, size, and color.
	 * @param name the name of the GelCap
	 * @param strength the strength of the GelCap
	 * @param size the size of the GelCap
	 * @param color the color of the GelCap
	 */
	public GelCap(String name, double strength, double size, String color)
	{
		this.name = name;
		this.strength = strength;
		this.size = size;
		this.color = color;
		manufacture();
	}
	
	/**
	 * A to String method for the GelCap class.
	 * @return a string representation of the instance.
	 */
	public String toString()
	{
		String s = "";
		s = String.format("%.2fmg %s Pill", strength, name);
		return s;
	}
	
	/**
	 * A descriptino method for the GelCap class.
	 * @return a string description of the instance.
	 */
	public String description()
	{
		String s = "";
		s = String.format("%s Pill\n\tStrength: %.2f\n\tSize: %.2f\n\tColor: "
		                  + "%s\n\tCasing: %s\n\tSolution: %s\n\tActive: %s", 
						  name, strength, size, color, 
						  casing, solution, active);
		return s;
	}
	
	/**
	 * Accessor for the name field.
	 * @return the value of name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Accessor for the strength field.
	 * @return the value of strength
	 */
	public double getStrength()
	{
		return strength;
	}
	
	/**
	 * Accessor for the size field.
	 * @return the value of size
	 */
	public double getSize()
	{
		return size;
	}
	
	/**
	 * Accessor for the color field.
	 * @return the value of color
	 */
	public String getColor()
	{
		return color;
	}
	
	/**
	 * Accessor for the casing field.
	 * @return the value of casing
	 */
	public String getCasing()
	{
		return casing;
	}
	
	/**
	 * Accessor for the solution field.
	 * @return the value of solution
	 */
	public String getSolution()
	{
		return solution;	
	}
	
	/**
	 * Accessor for the active field.
	 * @return the value of active
	 */
	public String getActive()
	{
		return active;
	}
	
	/**
	 * Prints the stages of manufacturing.
	 */
	protected void manufacture()
	{
		System.out.print("Manufacturing...\n");
		addCasing();
		addSolution();
		addActive();
		System.out.println("... completed manufacturing");
	}
	
	/**
	 * This method must be implemented by classes that extend GelCap.
	 */
	protected abstract void addCasing();

	/**
	 * This method must be implemented by classes that extend GelCap.
	 */
	protected abstract void addSolution();
	
	/**
	 * This method must be implemented by classes that extend GelCap.
	 */
	protected abstract void addActive();
}
