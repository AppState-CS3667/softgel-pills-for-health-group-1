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
	}
	
	public String toString()
	{
		String s = "";
		s += String.format("%.2f", strength) + "mg " + name + " Pill";
		return s;
	}
	
	public String description()
	{
		String s = "";
		s+= name + " Pill\n";
		s+= "\tStrength: " + String.format("%.2f", strength) + "n";
		s+= "\tSize: " + String.format("%.2f", size) + "\n";
		s+= "\tColor: " + color + "\n";
		s+= "\tCasing: " + casing + "\n";
		s+= "\tSolution: " + solution + "\n";
		s+= "\tActive: " + active + "\n";
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
		System.out.println("Manufacturing... \n");
		addCasing();
		addSolution();
		addActive();
		System.out.println("... completed manufacturing\n");
	}
	
	protected void addCasing()
	{
	}
	
	protected void addSolution()
	{
	}
	
	protected void addActive()
	{
	} 
	 
}
