package pills;


/**
 *AdultAcheAway is a subclass of AcheAway.
 *@author Subteam B
 *@version 1.2
 */ 
public class AdultAcheAway extends AcheAway
{
	static final double STRENGTH = 825.00;
	static final double SIZE = 8.50;
	static final String COLOR = "white";

	/**
 	 * Constructor for AdultAcheAway.
 	 * @param casing casing for AdultAcheAway
 	 * @param solution casing for AdultAcheAway
 	 * @param active casing for AdultAcheAway
 	 */ 	
	public AdultAcheAway(String casing, String solution, String active)
	{
		super(STRENGTH, SIZE, COLOR, casing, solution, active);
	}
	/**
 	 * Accepts an inspector objectfrom
     * the Inspector abstract class.
	 * @param insp the accepted inspector
 	 */ 
	@Override
	public void accept(Inspector insp)
	{
        insp.inspect(this);
    }
}
