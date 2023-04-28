package pills;

/**
 * This is the AdultDreamly class, a subclass of the Dreamly class.
 * @author Subteam A
 * @version 1.0
 */
public class AdultDreamly extends Dreamly
{
    public static final double STRENGTH = 5.20;
    public static final double SIZE = 12.24;
    public static final String COLOR = "tan";

    /**
	 * Constructor for an AdultDreamly object.
	 * @param casing the casing of the AdultDreamly object
     * @param solution the solution of the AdultDreamly object
     * @param active the active of AdultDreamly object
	 */
	public AdultDreamly(String casing, String solution, String active)
	{
		super(STRENGTH, SIZE, COLOR, casing, solution, active);
	}
	public void accept(Inspector insp){
        insp.inspect(this);
    }
}
