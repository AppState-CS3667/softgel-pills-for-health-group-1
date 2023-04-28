package pills;

public class FailureInspector extends Inspector {
    private int nullCount;
    private int totalCount;
    public int getNullCount(){
		return nullCount; 
	}
	public int getTotalCount(){
		return totalCount; 
	}
    @Override
    public void inspect(AdultAcheAway e){
        totalCount += 1;  
	}
    @Override
    public void inspect(ChildAcheAway e){
    	totalCount += 1; 
	}
    @Override
    public void inspect(NullAcheAway e){
		nullCount += 1;
        totalCount += 1; 
	}
    @Override
    public void inspect(AdultDreamly e){
		totalCount += 1; 
	}
    @Override
    public void inspect(ChildDreamly e){
		totalCount += 1; 
	}
    @Override
    public void inspect(NullDreamly e){
		nullCount += 1;
        totalCount += 1; 
	}
    public String report(){
		return "Failure Report\n\tNull Pills : " + nullCount + "\n\tChild Pills : " + totalCount; 
	}
    public void reset(){ nullCount = 0; totalCount = 0;}
    public double getFailRate(){
		return nullCount / totalCount;
	}
}
