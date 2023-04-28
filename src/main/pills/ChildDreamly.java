package pills;

/**
 * This is the ChildDreamly class, a subclass of the Dreamly class.
 * @author Subteam A
 * @version 1.0
 */
public class ChildDreamly extends Dreamly
{
    public static final double STRENGTH = 1.25;
    public static final double SIZE = 4.5;
    public static final String COLOR = "fuchsia";

    /**
	 * Constructor for an ChildDreamly object.
	 * @param casing the casing of the ChildDreamly object
     * @param solution the solution of the ChildDreamly object
     * @param active the active of ChildDreamly object
	 */
	public ChildDreamly(String casing, String solution, String active)
	{
		super(STRENGTH, SIZE, COLOR, casing, solution, active);
	}
	public void accept(Inspector insp){
        insp.inspect(this);
    }
}
