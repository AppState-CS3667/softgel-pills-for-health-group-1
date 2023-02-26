package pills;

public class Dreamly extends GelCap
{
	public Dreamly(double strength, double size, String color)
	{
		super("Dreamly", strength, size, color);
	}

	@Override	
	protected void addCasing()
	{
		casing = "Plasticizer";
		System.out.println("adding Plasticizer casing");
	}
	
	@Override
	protected void addSolution()
	{
		solution = "Oil";
		System.out.println("adding Oil solution");
	}
	
	@Override
	protected void addActive()
	{
		active = "Zolpidem";
		System.out.println("adding Zolpidem active");
	}

}
