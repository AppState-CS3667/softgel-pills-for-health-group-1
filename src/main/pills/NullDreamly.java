package pills;

/**
 * NullDreamly is a subclass of the Dreamly class.
 * @author Subteam B
 * @version 1.2
 */
public class NullDreamly extends Dreamly
{

	static final double NULLDOUBLE = -99.99;
	/*
	 * Constructor for NullAcheAway
	 */	
	public NullDreamly()
	{
		super(NULLDOUBLE, NULLDOUBLE, "No Color", "No Casing", "No Solution", "No Active");
	}
	/**
	 * Allows for the acceptance of an inspector
	 * from the Inspector abstract class.
	 * @param insp the accepted inspector
	 */
	public void accept(Inspector insp)
	{
        insp.inspect(this);
    }
}

