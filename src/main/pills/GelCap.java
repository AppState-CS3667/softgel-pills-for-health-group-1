package pills;
public abstract class GelCap
{
	protected String name;
	protected double strength;
	protected double size;
	protected String color;
	protected String casing;
	protected String solution;
	protected String active;

	public GelCap(String name, double strength, double size, String color)
	{
		this.name = name;
		this.strength = strength;
		this.size = size;
		this.color = color;
		manufacture();
	}
	
	public String toString()
	{
		String s = "";
		s = String.format("%.2fmg %s Pill", strength, name);
		return s;
	}
	
	public String description()
	{
		String s = "";
		s = String.format("%s Pill\n\tStrength: %.2f\n\tSize: %.2f\n\tColor: %s\n\tCasing: %s\n\tSolution: %s\n\tActive: %s\n", name, strength, size, color, casing, solution, active);
		return s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getStrength()
	{
		return strength;
	}
	
	public double getSize()
	{
		return size;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getCasing()
	{
		return casing;
	}
	
	public String getSolution()
	{
		return solution;	
	}
	
	public String getActive()
	{
		return active;
	}
	
	protected void manufacture()
	{
		System.out.println("\nManufacturing...");
		addCasing();
		addSolution();
		addActive();
		System.out.println("... completed manufacturing.");
	}
	
	protected abstract void addCasing();

	
	protected abstract void addSolution();
	
	
	protected abstract void addActive();
	 
	 
}
