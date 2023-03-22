package tests.pills;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pills.Dreamly;
import pills.AdultDreamly; 
import pills.ChildDreamly; 

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;	

/**
 * This is the TestDreamly class, which tests the Dreamly class.
 * @author Subteam A
 * @version 1.1
 */
public class TestDreamly 
{
	// Dreamly test Constants 
    private final String CORRECT_NAME = "Dreamly";
    private final double CORRECT_STRENGTH = 1.1;
    private final double CORRECT_SIZE = 2.2;
    private final String CORRECT_COLOR = "White";
    private final String CORRECT_CASING = "Plasticizer";
    private final String CORRECT_SOLUTION = "Oil";
    private final String CORRECT_ACTIVE = "Zolpidem";
    private final String TOSTRING_FSTRING = "%.2fmg %s Pill";
    private final String DESCRIPTION_FSTRING = "%s Pill\n\tStrength: %.2f\n\t"
                                               + "Size: %.2f\n\tColor: %s\n\t"
                                               + "Casing: %s\n\tSolution: %s"
                                               + "\n\tActive: %s";
    private final String MANUFACTURE_FSTRING = "Manufacturing...\nadding %s "
                                               + "casing\nadding %s solution\n"
                                               + "adding %s active\n... "
                                               + "completed manufacturing\n";
   // Adult Dreamly test constants
    private final double ADULT_STRENGTH = 5.2;
    private final double ADULT_SIZE = 12.24;
    private final String ADULT_COLOR = "Tan"; 
 
 //  Child Dreamly test constants
	private final double CHILD_STRENGTH = 1.25;
    private final double CHILD_SIZE = 4.5;
    private final String CHILD_COLOR = "Fuchsia";
   
	
	private DreamlyMock dreamly;
	private ChildDreamly child; 
	private AdultDreamly adult; 
	
	private class DreamlyMock extends Dreamly{
		DreamlyMock(double strength, double size, String color, String casing, String solution, String active){
			super(strength, size, color, casing, solution, active);
		}
	}


    /**
     *  Redirect output and create a new test Dreamly object before each test.
     */
    @BeforeEach
    public void beforeEach() 
    {   
        this.dreamly = new DreamlyMock(CORRECT_STRENGTH, CORRECT_SIZE, CORRECT_COLOR, CORRECT_CASING, CORRECT_SOLUTION, CORRECT_ACTIVE);
    	this.adult = new AdultDreamly(CORRECT_CASING, CORRECT_SOLUTION, CORRECT_ACTIVE); 
		this.child = new ChildDreamly(CORRECT_CASING, CORRECT_SOLUTION, CORRECT_ACTIVE); 
	}
    

    /**
     * Test a Dreamly object's getName() method against an expected value.
     
    @Test
    public void testName() 
    {
        assertEquals(CORRECT_NAME, dreamly.getName());

    }	*/

    /**
     * Test a Dreamly object's getStrength() method against an expected value.
     */
    @Test
    public void testStrength() 
    {
        assertEquals(CORRECT_STRENGTH, dreamly.getStrength());
    	assertEquals(ADULT_STRENGTH, adult.getStrength()); 
		assertEquals(CHILD_STRENGTH, child.getStrength()); 
	}

    /**
     * Test a Dreamly object's getSize() method against an expected value.
     */
    @Test
    public void testSize() 
    {
        assertEquals(CORRECT_SIZE, dreamly.getSize());
    	assertEquals(ADULT_SIZE, adult.getSize()); 
		assertEquals(CHILD_SIZE, child.getSize()); 
	}

    /**
     * Test a Dreamly object's getColor() method against an expected value.
     */
    @Test
    public void testColor() 
    {
        assertEquals(CORRECT_COLOR, dreamly.getColor());
    	assertEquals(ADULT_COLOR, adult.getColor());
		assertEquals(CHILD_COLOR, child.getColor()); 
	}

    /**
     * Test a Dreamly object's getCasing() method against an expected value.
     */
    @Test
    public void testCasing() 
    {
        assertEquals(CORRECT_CASING, dreamly.getCasing());
    }

    /**
     * Test a Dreamly object's getSolution() method against an expected value.
     */
    @Test
    public void testSolution() 
    {
        assertEquals(CORRECT_SOLUTION, dreamly.getSolution());
    }
	
	/**
     * Test a Dreamly object's getActive() method against an expected value.
     */
    @Test
    public void testActive() 
    {
        assertEquals(CORRECT_ACTIVE, dreamly.getActive());
    }

    /**
     * Test a Dreamly object's manufacture() method against an expected value.
    
    @Test
	public void testManufactureProcess() 
    {
        assertEquals(String.format(MANUFACTURE_FSTRING, obj.getCasing(), 
                                   obj.getSolution(), obj.getActive()), 
                                   getOutput());
    }
		*/

}
