package pills;

/**
 * NullDreamly is a subclass of the Dreamly class.
 * @author Subteam B
 * @version 1.0
 */
public class NullDreamly extends Dreamly
{

	/*
	 * Constructor for NullAcheAway
	 */	
	public NullDreamly()
	{
		super(-99.99, -99.99, "No Color", "No Casing", "No Solution", "No Active");
	}
	public void accept(Inspector insp){
        insp.inspect(this);
    }
}

