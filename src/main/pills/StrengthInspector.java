package pills;
public class StrengthInspector extends Inspector
{
    private double dreamlyStrength;
    private double acheAwayStrength;
    
    public double getDreamlyStrength()
    {
        return dreamlyStrength;
    }

    public double getAcheAwayStrength()
    {
        return acheAwayStrength;
    }

    @Override
    public void inspect(AdultAcheAway e)
    {
        acheAwayStrength += e.getStrength(); 
    }

    @Override
    public void inspect(ChildAcheAway e)
    {
        acheAwayStrength += e.getStrength();
    }

    @Override
    public void inspect(AdultDreamly e)
    {
   		dreamlyStrength += e.getStrength(); 
	 }

    @Override
    public void inspect(ChildDreamly e)
    {
        dreamlyStrength += e.getStrength(); 
    }

    public String report()
    {
		return "Strength Report\n\tAcheAway Pills : " 
            + getAcheAwayStrength() + "\n\tChild Pills : " + getDreamlyStrength(); 
	}
	
    public void reset()
    {
        this.acheAwayStrength = 0;
        this.dreamlyStrength = 0;
    }
}
