package pills;
public class ConsistencyInspector extends Inspector{
    private int adultCount;
    private int childCount;
    @Override
    public void inspect(AdultAcheAway e){
   		adultCount += 1;  
	}
    @Override
    public void inspect(ChildAcheAway e){
    	childCount += 1; 
	}
    @Override
    public void inspect(AdultDreamly e){
		adultCount += 1; 
	}
    @Override
    public void inspect(ChildDreamly e){
		childCount += 1; 
	}
    public String report(){
		return "Adult Pills : " + adultCount + "Child Pills : " + childCount; 
	}
    public void reset(){ adultCount = 0; childCount = 0;}
    public boolean soFarSoConsistent(){
		boolean check = true; 
		if(adultCount > 0 && childCount > 0){
			check = false; 
		}  
		return check; 
	}
}

