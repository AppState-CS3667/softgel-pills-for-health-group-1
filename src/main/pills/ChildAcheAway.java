package pills;

import pills.AcheAway;

public class ChildAcheAway extends AcheAway
{
	static final double STRENGTH = 415.00;
	static final double SIZE = 3.25;
	static final String COLOR = "cyan";
	
	public ChildAcheAway(String casing, String solution, String active)
	{
		super(STRENGTH, SIZE, COLOR, casing, solution, active);
	}
}
