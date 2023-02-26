package tests.pills;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pills.GelCap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;	

/**
 * This is the TestGelCap class, which tests the GelCap class.
 * @author Subteam A
 * @version 1.4
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
    private final String TOSTRING_FSTRING = "%.2fmg %s Pill";
    private final String DESCRIPTION_FSTRING = "%s Pill\n\tStrength: %.2f\n" 
                                               + "\tSize: %.2f\n\tColor: %s\n" 
                                               + "\tCasing: %s\n" 
                                               + "\tSolution: %s\n" 
                                               + "\tActive: %s";
    private final String MANUFACTURE_FSTRING = "Manufacturing...\n%s\n" 
                                               + "%s\n%s\n... " 
                                               + "completed manufacturing\n";
    
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
        GelCapMock(String name, double strength, double size, String color)
        {
            super(name, strength, size, color);
        }

        /**
         * Implementation of the abstract addCasing method. 
         * Prints the value of casing.
         */
        @Override
        protected void addCasing()
        {
            casing = "X";
            System.out.print(casing + "\n");
        }

        /**
         * Implementation of the abstract addSolution method. 
         * Prints the value of solution.
         */
        @Override
        protected void addSolution()
        {
            solution = "Y";
            System.out.print(solution + "\n");
        }

        /**
         * Implementation of the abstract addActive method. 
         * Prints the value of active.
         */
        @Override
        protected void addActive()
        {
            active = "Z";
            System.out.print(active + "\n");
        }
    }

    /**
     * Flushes data from PrintStream into boas.
     * @return the ouput with return characters stripped
     */
    private String getOutput()
    {
        // flush all data from the PrintStream into our ByteArrayOutputStream
        System.out.flush();	
        // return the output with return characters stripped.
        // stripping return characters ensure the test works on 
        // mac, unix, and windows
        return baos.toString().replaceAll("\r", "");
    }

    /**
     *  Redirect output and create a new test Dreamly object before each test.
     */
    @BeforeEach
    public void beforeEach()
    {
        this.oldOut = System.out;
        this.baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        this.obj = new GelCapMock(TEST_NAME, TEST_STRENGTH, 
        TEST_SIZE, TEST_COLOR);
    }
    
    /**
     * Reset ouput after each test.
     */
    @AfterEach
    public void afterEach()
    {
        System.setOut(oldOut);
    }

    /**
     * Test a GelCap object's getName() method against an expected value.
     */
    @Test
    public void testName()
    {
        assertEquals(TEST_NAME, obj.getName());
    }

    /**
     * Test a GelCap object's getStrength() method against an expected value.
     */
    @Test
    public void testStrength()
    {
        assertEquals(TEST_STRENGTH, obj.getStrength());
    }

    /**
     * Test a GelCap object's getSize() method against an expected value.
     */
    @Test
    public void testSize()
    {
        assertEquals(TEST_SIZE, obj.getSize());
    }

    /**
     * Test a GelCap object's getColor() method against an expected value.
     */
    @Test
    public void testColor()
    {
        assertEquals(TEST_COLOR, obj.getColor());
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

    /**
     * Test a GelCap object's toString() method against an expected value.
     */
    @Test
    public void testToString()
    {
        assertEquals(String.format(TOSTRING_FSTRING, obj.getStrength(), 
        obj.getName()), obj.toString());   
    }

    /**
     * Test a GelCap object's description() method against an expected value.
     */
    @Test
    public void testDescription()
    {
        assertEquals(String.format(DESCRIPTION_FSTRING, obj.getName(), 
        obj.getStrength(), obj.getSize(), obj.getColor(), 
        obj.getCasing(), obj.getSolution(), obj.getActive()), 
        obj.description());
    }

    /**
     * Test a GelCap object's manufacture() method against an expected value.
     */
    @Test
    public void testManufactureProcess()
    {
        assertEquals(String.format(MANUFACTURE_FSTRING, obj.getCasing(), 
        obj.getSolution(), obj.getActive()), getOutput());
    }
}
