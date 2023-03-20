package pills;
import pills.AcheAway;


/**
 *AdultAcheAway is a subclass of AcheAway.
 *@author Subteam B
 *@version 1.0
 */ 
public class AdultAcheAway extends AcheAway
{
	static final double STRENGTH = 825.00;
	static final double SIZE = 8.50;
	static final String COLOR = "white";

	/**
 	 * Constructor for AdultAcheAway
 	 * @param casing
 	 * @param solution
 	 * @param active
 	 */ 	
	public AdultAcheAway(String casing, String solution, String active)
	{
		super(STRENGTH, SIZE, COLOR, casing, solution, active);
	}
}
