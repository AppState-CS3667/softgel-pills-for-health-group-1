package pills;
public class ConsistencyInspector extends Inspector
{
    private int adultCount;
    private int childCount;
    
	public int getAdultCount()
	{
		return adultCount; 
	}
	public int getChildCount()
	{
		return childCount; 
	}
	@Override
    public void inspect(AdultAcheAway e)
	{
   		adultCount += 1;  
	}
    @Override
    public void inspect(ChildAcheAway e)
	{
    	childCount += 1; 
	}
    @Override
    public void inspect(AdultDreamly e)
	{
		adultCount += 1; 
	}
    @Override
    public void inspect(ChildDreamly e)
	{
		childCount += 1; 
	}
    public String report()
	{
		return "Consistency Report\n\tAdult Pills : " 
			+ getAdultCount() + "\n\tChild Pills : " + getChildCount(); 
	}
    public void reset()
	{
		this.adultCount = 0; 
		this.childCount = 0;
	}
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

