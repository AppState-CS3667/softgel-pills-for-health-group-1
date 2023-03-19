package tests.pills;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pills.AcheAway;
import pills.AdultAcheAway;
import pills.ChildAcheAway;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * This is the AcheAwayTest class, which tests the AcheAway class.
 * @author Subteam B
 * @version 1.6
 */
public class AcheAwayTest
{
    // AcheAway test constants
    private final double TEST_STRENGTH = 5.0;
    private final double TEST_SIZE = 4.5;
    private final String TEST_COLOR = "Yellow";
    private final String TEST_CASING = "X";
    private final String TEST_SOLUTION = "Y";
    private final String TEST_ACTIVE = "Z";
    // Adult AcheAway test constants
    private final double ADULT_STRENGTH = 10.0;
    private final double ADULT_SIZE = 9.5;
    private final String ADULT_COLOR = "Blue";
    // Child AcheAway test constants
    private final double CHILD_STRENGTH = 1.0;
    private final double CHILD_SIZE = 0.5;
    private final String CHILD_COLOR = "Red";

    // AcheAway test fields
    private AcheAway acheAway;
    private AdultAcheAway adultAcheAway;
    private ChildAcheAway childAcheAway;
    
    /**
     *  A mock AcheAway class for testing.
     */                                             
    private class AcheAwayMock extends AcheAway
    {
        /**
         * Constructor for a mock AcheAway class.
	     * @param strength the strength of the AcheAway mock class
	     * @param size the size of the AcheAway mock class
	     * @param color the color of the AcheAway mock class
         * @param casing the casing of the AcheAway mock class
         * @param solution the solution of the AcheAway mock class
         * @param active the active of the AcheAway mock class
         */
        AcheAwayMock(double strength, double size, String color, String casing, String solution, String active)
        {
            super(strength, size, color, casing, solution, active);
        }
    }

    /**
     *  Redirect output and create a new test AcheAway object before each test.
     */  
    @BeforeEach
    public void beforeEach() 
    {
        this.acheAway = new AcheAway(TEST_STRENGTH, TEST_SIZE, TEST_COLOR, TEST_CASING, TEST_SOLUTION, TEST_ACTIVE);
        this.adultAcheAway = new AdultAcheAway(ADULT_STRENGTH, ADULT_SIZE, ADULT_COLOR);
        this.childAcheAway = new ChildAcheAway(CHILD_STRENGTH, CHILD_SIZE, CHILD_COLOR);

    }

    /**
     * Test an AcheAway object's getStrength() method against an expected value.
     */
    @Test
    public void testStrength() 
    {
        assertEquals(TEST_STRENGTH, acheAway.getStrength());
        assertEquals(ADULT_STRENGTH, acheAway.getStrength());
        assertEquals(CHILD_STRENGTH, acheAway.getStrength());
    }

    /**
     * Test an AcheAway object's getSize() method against an expected value.
     */
    @Test
    public void testSize() 
    {
        assertEquals(TEST_SIZE, acheAway.getSize());
        assertEquals(ADULT_SIZE, acheAway.getSize());
        assertEquals(CHILD_SIZE, acheAway.getSize());
    }

    /**
     * Test an AcheAway object's getSize() method against an expected value.
     */
    @Test
    public void testColor() 
    {
        assertEquals(TEST_SIZE, acheAway.getColor());
        assertEquals(ADULT_COLOR, acheAway.getColor());
        assertEquals(CHILD_COLOR, acheAway.getColor());
    }
}
