package pills;


/**
 * ChildAcheAway is a subclass of the AcheAway class.
 * @author Subteam B
 * @version 1.1
 */
public class ChildAcheAway extends AcheAway
{
	static final double STRENGTH = 415.00;
	static final double SIZE = 3.25;
	static final String COLOR = "cyan";
	

	/**
	 * Constructor for ChildAcheAway.
	 * @param casing casing for ChildAcheAway
	 * @param solution solution for ChildAcheAway
	 * @param active active for ChildAcheAway
	 */	
	public ChildAcheAway(String casing, String solution, String active)
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
