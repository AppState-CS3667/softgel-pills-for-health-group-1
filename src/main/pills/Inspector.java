package pills; 
/**
 * Inspector abstract class that has an inspector
 * for each type of pill. Includes 6 empty inspector
 * methods and 2 abstract methods that will require
 * implementation.
 * @author Subteam B
 * @version 1.1
 */
public abstract class Inspector
{
	/**
	 * Empty inspector for an AdultAcheAway
	 * object.
	 * @param e AdultAcheAway object to be inspected
	 */
	public void inspect(AdultAcheAway e)
	{ }; 
	
	/**
	 * Empty inspector for an ChildAcheAway
	 * object.
	 * @param e ChildAcheAway object to be inspected
	 */
	public void inspect(ChildAcheAway e)
	{ };
	
	/**
	 * Empty inspector for an NullAcheAway
	 * object.
	 * @param e NullAcheAway object to be inspected
	 */
	public void inspect(NullAcheAway e)
	{ }; 
	
	/**
	 * Empty inspector for an AdultDreamly
	 * object.
	 * @param e AdultDreamly object to be inspected
	 */
	public void inspect(AdultDreamly e)
	{ };
	
	/**
	 * Empty inspector for an ChildDreamly
	 * object.
	 * @param e ChildDreamly object to be inspected
	 */
	public void inspect(ChildDreamly e)
	{ };
	
	/**
	 * Empty inspector for an NullDreamly
	 * object.
	 * @param e NullDreamly object to be inspected
	 */
	public void inspect(NullDreamly e)
	{ };
	
	/**
	 * Abstract method that will report the
	 * results obtained from inspectors. 
	 * @return string as report 
	 */
	public abstract String report(); 
	
	/**
	 * Abstract method that will reset corresponding
	 * field for Inspector class. 
	 */
	public abstract void reset(); 
}
