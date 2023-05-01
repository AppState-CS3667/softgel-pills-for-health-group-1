package pills;
/**
 * Inspector class that extends the Inspector.
 * Abstract class that aims to check the failure
 * rate of pills in an order.
 * author
 * @author Subteam B
 * @version 1.1
 */
public class FailureInspector extends Inspector 
{
    private int nullCount;
    private int totalCount;

    /**
    * Getter method for nullCount field.
    * @return int nullCount 
    */
    public int getNullCount()
    {
		return nullCount; 
    }

    /**
    * Getter method for totalCount field.
    * @return int totalCount 
    */
	  public int getTotalCount()
    {
		return totalCount; 
	}

    /**
    * Inspects object passed and adds 
    * to totalCount.
    * @param e an AdultAcheAway object
    */
    @Override
    public void inspect(AdultAcheAway e)
    {
        totalCount += 1;  
    }

    /**
    * Inspects object passed and adds 
    * to totalCount.
    * @param e a ChildAcheAway object
    */
    @Override
    public void inspect(ChildAcheAway e)
    {
        totalCount += 1; 
	}

    /**
    * Inspects object passed and adds 
    * to totalCount and nullCount.
    * @param e a NullAcheAway object
    */
    @Override
    public void inspect(NullAcheAway e)
    {
		nullCount += 1;
        totalCount += 1; 
	}

    /**
    * Inspects object passed and adds 
    * to totalCount.
    * @param e an AdultDreamly object
    */
    @Override
    public void inspect(AdultDreamly e)
    {
		totalCount += 1; 
	}

    /**
    * Inspects object passed and adds 
    * to totalCount.
    * @param e a ChildDreamly object
    */
    @Override
    public void inspect(ChildDreamly e)
    {
		totalCount += 1; 
	}

    /**
    * Inspects object passed and adds 
    * to totalCount and nullCount.
    * @param e a NullDreamly object
    */
    @Override
    public void inspect(NullDreamly e)
    {
		nullCount += 1;
        totalCount += 1; 
	}

    /**
     * Creates string that is a report
     * of the failures the inspectors caught.
     * @return String that is the report
     */
    public String report()
    {
		return "Failure Report\n\tNull Pills : " + nullCount 
            + "\n\tChild Pills : " + totalCount; 
	}

    /**
     * Resets the private field back to zero.
     */
    public void reset()
    { 
        nullCount = 0; 
        totalCount = 0;
    }

    /**
     * Gets final fail rate.
     * @return the rate of failure
     */
    public double getFailRate()
    {
		    return nullCount / totalCount;
	}
}
