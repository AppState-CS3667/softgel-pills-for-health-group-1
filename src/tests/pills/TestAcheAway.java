package pills;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;	

/**
 * This is the TestAcheAway class, which tests the AcheAway class.
 * @author Subteam A
 * @version 1.1
 */
public class TestAcheAway 
{
	// AcheAway test Constants 
    private final String CORRECT_NAME = "AcheAway";
    private final double CORRECT_STRENGTH = 1.1;
    private final double CORRECT_SIZE = 2.2;
    private final String CORRECT_COLOR = "Yellow";
    private final String CORRECT_CASING = "Gelatin";
    private final String CORRECT_SOLUTION = "Saline";
    private final String CORRECT_ACTIVE = "Acetaminophen";
    private final String TOSTRING_FSTRING = "%.2fmg %s Pill";
    private final String DESCRIPTION_FSTRING = "%s Pill\n\tStrength: %.2f\n\t"
                                               + "Size: %.2f\n\tColor: %s\n\t"
                                               + "Casing: %s\n\tSolution: %s"
                                               + "\n\tActive: %s";

   // Adult AcheAway test constants
    private final double ADULT_STRENGTH = 825.00;
    private final double ADULT_SIZE = 8.50;
    private final String ADULT_COLOR = "white"; 
 
 //  Child AcheAway test constants
	private final double CHILD_STRENGTH = 415.00;
    private final double CHILD_SIZE = 3.25;
    private final String CHILD_COLOR = "cyan";
   
	
	private AcheAwayMock AcheAway;
	private ChildAcheAway childAcheAway; 
	private AdultAcheAway adultAcheAway; 
	
	private class AcheAwayMock extends AcheAway{
		AcheAwayMock(double strength, double size, String color, String casing, String solution, String active){
			super(strength, size, color, casing, solution, active);
		}
	}


    /**
     *  Redirect output and create a new test AcheAway object before each test.
     */
    @BeforeEach
    public void beforeEach() 
    {   
        this.AcheAway = new AcheAwayMock(CORRECT_STRENGTH, CORRECT_SIZE, CORRECT_COLOR, CORRECT_CASING, CORRECT_SOLUTION, CORRECT_ACTIVE);
    	this.adultAcheAway = new AdultAcheAway(CORRECT_CASING, CORRECT_SOLUTION, CORRECT_ACTIVE); 
		this.childAcheAway = new ChildAcheAway(CORRECT_CASING, CORRECT_SOLUTION, CORRECT_ACTIVE); 
	}
    
    /**
    * Test a AcheAway object's toString() method against an expected value.
    */ 
    @Test
    public void testToString() 
    {
        assertEquals(String.format(TOSTRING_FSTRING, AcheAway.getStrength(), AcheAway.getName()), AcheAway.toString());
        assertEquals(String.format(TOSTRING_FSTRING, adultAcheAway.getStrength(), adultAcheAway.getName()), adultAcheAway.toString());
        assertEquals(String.format(TOSTRING_FSTRING, childAcheAway.getStrength(), childAcheAway.getName()), childAcheAway.toString());
    }

    /**
    * Test a AcheAway object's description() method against an expected value.
    */ 
    @Test
    public void testDescription() 
    {
        assertEquals(String.format(DESCRIPTION_FSTRING, AcheAway.getName(), AcheAway.getStrength(), AcheAway.getSize(), AcheAway.getColor(), AcheAway.getCasing(), AcheAway.getSolution(), AcheAway.getActive()), AcheAway.description());
        assertEquals(String.format(DESCRIPTION_FSTRING,  adultAcheAway.getName(), adultAcheAway.getStrength(), adultAcheAway.getSize(), adultAcheAway.getColor(), adultAcheAway.getCasing(), adultAcheAway.getSolution(), adultAcheAway.getActive()), adultAcheAway.description());
        assertEquals(String.format(DESCRIPTION_FSTRING,  childAcheAway.getName(), childAcheAway.getStrength(), childAcheAway.getSize(), childAcheAway.getColor(), childAcheAway.getCasing(), childAcheAway.getSolution(), childAcheAway.getActive()), childAcheAway.description());
    }

    /**
     * Test a AcheAway object's getName() method against an expected value.
    */ 
    @Test
    public void testName() 
    {
        assertEquals(CORRECT_NAME, AcheAway.getName());
        assertEquals(CORRECT_NAME, adultAcheAway.getName());
        assertEquals(CORRECT_NAME, childAcheAway.getName());
    }

    /**
     * Test a AcheAway object's getStrength() method against an expected value.
     */
    @Test
    public void testStrength() 
    {
        assertEquals(CORRECT_STRENGTH, AcheAway.getStrength());
    	assertEquals(ADULT_STRENGTH, adultAcheAway.getStrength()); 
		assertEquals(CHILD_STRENGTH, childAcheAway.getStrength()); 
	}

    /**
     * Test a AcheAway object's getSize() method against an expected value.
     */
    @Test
    public void testSize() 
    {
        assertEquals(CORRECT_SIZE, AcheAway.getSize());
    	assertEquals(ADULT_SIZE, adultAcheAway.getSize()); 
		assertEquals(CHILD_SIZE, childAcheAway.getSize()); 
	}

    /**
     * Test a AcheAway object's getColor() method against an expected value.
     */
    @Test
    public void testColor() 
    {
        assertEquals(CORRECT_COLOR, AcheAway.getColor());
    	assertEquals(ADULT_COLOR, adultAcheAway.getColor());
		assertEquals(CHILD_COLOR, childAcheAway.getColor()); 
	}

    /**
     * Test a AcheAway object's getCasing() method against an expected value.
     */
    @Test
    public void testCasing() 
    {
        assertEquals(CORRECT_CASING, AcheAway.getCasing());
        assertEquals(CORRECT_CASING, adultAcheAway.getCasing());
        assertEquals(CORRECT_CASING, childAcheAway.getCasing());
    }

    /**
     * Test a AcheAway object's getSolution() method against an expected value.
     */
    @Test
    public void testSolution() 
    {
        assertEquals(CORRECT_SOLUTION, AcheAway.getSolution());
        assertEquals(CORRECT_SOLUTION, adultAcheAway.getSolution());
        assertEquals(CORRECT_SOLUTION, childAcheAway.getSolution());
    }
	
	/**
     * Test a AcheAway object's getActive() method against an expected value.
     */
    @Test
    public void testActive() 
    {
        assertEquals(CORRECT_ACTIVE, AcheAway.getActive());
        assertEquals(CORRECT_ACTIVE, adultAcheAway.getActive());
        assertEquals(CORRECT_ACTIVE, childAcheAway.getActive());
    }

}
