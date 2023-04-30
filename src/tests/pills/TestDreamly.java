package pills;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

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

   // Adult Dreamly test constants
    private final double ADULT_STRENGTH = 5.2;
    private final double ADULT_SIZE = 12.24;
    private final String ADULT_COLOR = "tan"; 
 
 //  Child Dreamly test constants
	private final double CHILD_STRENGTH = 1.25;
    private final double CHILD_SIZE = 4.5;
    private final String CHILD_COLOR = "fuchsia";
   
	
	private DreamlyMock dreamly;
	private ChildDreamly childDreamly; 
	private AdultDreamly adultDreamly; 
	/**
     * Dreamly class Mock for testing
     */
	private class DreamlyMock extends Dreamly
    {
        /**
         * Constructor for mock that calls the superclass's 
         * constructor
         * @param strength of the pill
         * @param size of the pill
         * @param color of the pill
         * @param casing of the pill
         * @param solution of the pill
         * @param active of the pill
         */
		DreamlyMock(double strength, double size, String color, 
                    String casing, String solution, String active)
        {
			super(strength, size, color, casing, solution, active);
		}
        /**
         * Shows the accepting of the inspector object passed.
         */
        @Override
        public void accept(Inspector insp) 
        {
            System.out.println("Inspecting...");
        }
	}


    /**
     *  Redirect output and create a new test Dreamly object before each test.
     */
    @BeforeEach
    public void beforeEach() 
    {   
        this.dreamly = new DreamlyMock(CORRECT_STRENGTH, CORRECT_SIZE, 
                                       CORRECT_COLOR, CORRECT_CASING, 
                                       CORRECT_SOLUTION, CORRECT_ACTIVE);
    	this.adultDreamly = new AdultDreamly(CORRECT_CASING, CORRECT_SOLUTION, CORRECT_ACTIVE); 
		this.childDreamly = new ChildDreamly(CORRECT_CASING, CORRECT_SOLUTION, CORRECT_ACTIVE); 
	}
    
    /**
    * Test a Dreamly object's toString() method against an expected value.
    */ 
    @Test
    public void testToString() 
    {
        assertEquals(String.format(TOSTRING_FSTRING, 
                                   dreamly.getStrength(), 
                                   dreamly.getName()), 
                                   dreamly.toString());
        assertEquals(String.format(TOSTRING_FSTRING, 
                                   adultDreamly.getStrength(), 
                                   adultDreamly.getName()), 
                                   adultDreamly.toString());
        assertEquals(String.format(TOSTRING_FSTRING, 
                                   childDreamly.getStrength(), 
                                   childDreamly.getName()), 
                                   childDreamly.toString());
    }

    /**
    * Test a Dreamly object's description() method against an expected value.
    */ 
    @Test
    public void testDescription() 
    {
        assertEquals(String.format(DESCRIPTION_FSTRING, 
                                   dreamly.getName(), 
                                   dreamly.getStrength(), 
                                   dreamly.getSize(), 
                                   dreamly.getColor(), 
                                   dreamly.getCasing(), 
                                   dreamly.getSolution(), 
                                   dreamly.getActive()), 
                                   dreamly.description());
        assertEquals(String.format(DESCRIPTION_FSTRING,  
                                   adultDreamly.getName(), 
                                   adultDreamly.getStrength(), 
                                   adultDreamly.getSize(), 
                                   adultDreamly.getColor(),
                                   adultDreamly.getCasing(), 
                                   adultDreamly.getSolution(), 
                                   adultDreamly.getActive()), 
                                   adultDreamly.description());
        assertEquals(String.format(DESCRIPTION_FSTRING,  
                                   childDreamly.getName(), 
                                   childDreamly.getStrength(), 
                                   childDreamly.getSize(), 
                                   childDreamly.getColor(), 
                                   childDreamly.getCasing(), 
                                   childDreamly.getSolution(), 
                                   childDreamly.getActive()), 
                                   childDreamly.description());
    }

    /**
     * Test a Dreamly object's getName() method against an expected value.
    */ 
    @Test
    public void testName() 
    {
        assertEquals(CORRECT_NAME, dreamly.getName());
        assertEquals(CORRECT_NAME, adultDreamly.getName());
        assertEquals(CORRECT_NAME, childDreamly.getName());
    }

    /**
     * Test a Dreamly object's getStrength() method against an expected value.
     */
    @Test
    public void testStrength() 
    {
        assertEquals(CORRECT_STRENGTH, dreamly.getStrength());
    	assertEquals(ADULT_STRENGTH, adultDreamly.getStrength()); 
		assertEquals(CHILD_STRENGTH, childDreamly.getStrength()); 
	}

    /**
     * Test a Dreamly object's getSize() method against an expected value.
     */
    @Test
    public void testSize() 
    {
        assertEquals(CORRECT_SIZE, dreamly.getSize());
    	assertEquals(ADULT_SIZE, adultDreamly.getSize()); 
		assertEquals(CHILD_SIZE, childDreamly.getSize()); 
	}

    /**
     * Test a Dreamly object's getColor() method against an expected value.
     */
    @Test
    public void testColor() 
    {
        assertEquals(CORRECT_COLOR, dreamly.getColor());
    	assertEquals(ADULT_COLOR, adultDreamly.getColor());
		assertEquals(CHILD_COLOR, childDreamly.getColor()); 
	}

    /**
     * Test a Dreamly object's getCasing() method against an expected value.
     */
    @Test
    public void testCasing() 
    {
        assertEquals(CORRECT_CASING, dreamly.getCasing());
        assertEquals(CORRECT_CASING, adultDreamly.getCasing());
        assertEquals(CORRECT_CASING, childDreamly.getCasing());
    }

    /**
     * Test a Dreamly object's getSolution() method against an expected value.
     */
    @Test
    public void testSolution() 
    {
        assertEquals(CORRECT_SOLUTION, dreamly.getSolution());
        assertEquals(CORRECT_SOLUTION, adultDreamly.getSolution());
        assertEquals(CORRECT_SOLUTION, childDreamly.getSolution());
    }
	
	/**
     * Test a Dreamly object's getActive() method against an expected value.
     */
    @Test
    public void testActive() 
    {
        assertEquals(CORRECT_ACTIVE, dreamly.getActive());
        assertEquals(CORRECT_ACTIVE, adultDreamly.getActive());
        assertEquals(CORRECT_ACTIVE, childDreamly.getActive());
    }

}
