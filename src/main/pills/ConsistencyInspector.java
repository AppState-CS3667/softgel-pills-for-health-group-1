package pills;
/**
 * Inspector class that extends the Inspector
 * abstract class that aims to check whether
 * an order is mixing child and adult pills.
 * author
 * @author Subteam B
 * @version 1.0
 */
public class ConsistencyInspector extends Inspector
{
	private int adultCount;
    private int childCount;
    /**
	 * Getter method for adultCount.
	 * @return int adultCount
	 */
	public int getAdultCount()
	{
		return adultCount; 
	}
	/**
	 * Getter method for childCount.
	 * @return int childCount
	 */
	public int getChildCount()
	{
		return childCount; 
	}
	/**
	 * Inspects the given object passed
	 * and increases adultCount field
	 * @param e an AdultAcheAway object 
	 */
	@Override
    public void inspect(AdultAcheAway e)
	{
   		adultCount += 1;  
	}
	/**
	 * Inspects the given object passed
	 * and increases childCount field.
	 * @param e an ChildAcheAway object 
	 */
    @Override
    public void inspect(ChildAcheAway e)
	{
    	childCount += 1; 
	}
	/**
	 * Inspects the given object passed
	 * and increases adultCount field.
	 * @param e an AdultDreamly object 
	 */
    @Override
    public void inspect(AdultDreamly e)
	{
		adultCount += 1; 
	}
	/**
	 * Inspects the given object passed
	 * and increases childCount field.
	 * @param e an ChildDreamly object 
	 */
    @Override
    public void inspect(ChildDreamly e)
	{
		childCount += 1; 
	}
	/**
	 * Creates a report that summarizes the
	 * two private pill counting fields.
	 * @return a string as the report
	 */
    public String report()
	{
		return "Consistency Report\n\tAdult Pills : " 
			+ getAdultCount() + "\n\tChild Pills : " + getChildCount(); 
	}
	/**
	 * Resets the two private pill counting
	 * field back to 0.
	 */
    public void reset()
	{
		this.adultCount = 0; 
		this.childCount = 0;
	}
	/**
	 * Checks that child and adult
	 * pills are not mixed.
	 * @return boolean check that
	 * says whether there the order is
	 * consistent with no mixing
	 */
    public boolean soFarSoConsistent()
	{
		boolean check = true; 
		if (getAdultCount() > 0 && getChildCount() > 0)
		{
			check = false; 
		}  
		return check; 
	}
}

