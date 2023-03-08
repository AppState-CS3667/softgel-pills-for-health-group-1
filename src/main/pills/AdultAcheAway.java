package pills;
import pills.AcheAway;

public class AdultAcheAway extends AcheAway
{
	static final double STRENGTH = 825.00;
	static final double SIZE = 8.50;
	static final String COLOR = "white";
	public AdultAcheAway(String casing, String solution, String active)
	{
		super(STRENGTH, SIZE, COLOR, casing, solution, active);
	}
}
