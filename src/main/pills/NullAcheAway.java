package pills;

/**
 * NullAcheAway is a subclass of the AcheAway class.
 * @author Subteam B
 * @version 1.0
 */
public class NullAcheAway extends AcheAway
{

	static final double NULLDOUBLE = -99.99;

	/*
	 * Constructor for NullAcheAway
	 */	
	public NullAcheAway()
	{
		super(NULLDOUBLE, NULLDOUBLE, "No Color", "No Casing", "No Solution", "No Active");
	}
	
	public void accept(Inspector insp)
	{
        insp.inspect(this);
    }
}
