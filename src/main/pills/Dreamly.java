package pills;
import pills.GelCap;
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
		System.out.println("add Plasticizer casing");
	}
	
	@Override
	protected void addSolution()
	{
		solution = "Oil";
		System.out.println("add Oil solution");
	}
	
	@Override
	protected void addActive()
	{
		active = "Zolpidem";
		System.out.println("add Zolpidem active");
	}

}
