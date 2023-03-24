package pills;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pills.GelCap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;	

/**
 * This is the TestGelCap class, which tests the GelCap class.
 * @author Subteam B
 * @version 1.5
 */
public class TestGelCap 
{
    private final String TEST_NAME = "Provolone";
    private final double TEST_STRENGTH = 1.1;
    private final double TEST_SIZE = 2.2;
    private final String TEST_COLOR = "White";
    private final String TEST_CASING = "X";
    private final String TEST_SOLUTION = "Y";
    private final String TEST_ACTIVE = "Z";    
    private ByteArrayOutputStream baos;
    private PrintStream oldOut;
    private GelCap obj;

    /**
     * A mock GelCap class for testing.
     */
    private class GelCapMock extends GelCap
    {
        /**
         * Constructor for a mock GelCap class.
         * @param name the name of the GelCap mock class
	     * @param strength the strength of the GelCap mock class
	     * @param size the size of the GelCap mock class
	     * @param color the color of the GelCap mock class
         */
        GelCapMock(String name, double strength, double size, String color, String casing, String solution, String active)
        {
            super(name, strength, size, color, casing, solution, active);
        } 
    }

    /**
     *  Create a new test Dreamly object before each test.
     */
    @BeforeEach
    public void beforeEach()
    {
        this.obj = new GelCapMock(TEST_NAME, TEST_STRENGTH, 
        TEST_SIZE, TEST_COLOR, TEST_CASING, TEST_SOLUTION, TEST_ACTIVE);
    }


    /**
     * Test a GelCap object's getCasing() method against an expected value.
     */
    @Test
    public void testCasing()
    {
        assertEquals(TEST_CASING, obj.getCasing());
    }

    /**
     * Test a GelCap object's getSolution() method against an expected value.
     */
    @Test
    public void testSolution()
    {
        assertEquals(TEST_SOLUTION, obj.getSolution());
    }

    /**
     * Test a GelCap object's getActive() method against an expected value.
     */
    @Test
    public void testActive()
    {
        assertEquals(TEST_ACTIVE, obj.getActive());
    }

}
