package pills;


/**
 * ChildAcheAway is a subclass of the AcheAway class.
 * @author Subteam B
 * @version 1.0
 */
public class ChildAcheAway extends AcheAway
{
	static final double STRENGTH = 415.00;
	static final double SIZE = 3.25;
	static final String COLOR = "cyan";
	

	/*
	 * Constructor for ChildAcheAway
	 * @param casing
	 * @param solution
	 * @param active
	 */	
	public ChildAcheAway(String casing, String solution, String active)
	{
		super(STRENGTH, SIZE, COLOR, casing, solution, active);
	}
	public void accept(Inspector insp){
		insp.inspect(this); 
	}
}
