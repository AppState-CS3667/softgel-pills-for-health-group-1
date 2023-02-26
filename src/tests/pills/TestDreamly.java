package tests.pills;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pills.Dreamly;

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
    
    private ByteArrayOutputStream baos;
    private PrintStream oldOut;
    private Dreamly obj;

    /**
     * Flushes data from PrintStream into boas.
     * @return the ouput with return characters stripped
     */
    private String getOutput() 
    {
        // flush all data from the PrintStream into our ByteArrayOutputStream
        System.out.flush();	
        // return the output with return characters stripped.
        // stripping return characters ensure the test works
        // on mac, unix, and windows
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
        this.obj = new Dreamly(CORRECT_STRENGTH, CORRECT_SIZE, CORRECT_COLOR);
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
     * Test a Dreamly object's getName() method against an expected value.
     */
    @Test
    public void testName() 
    {
        assertEquals(CORRECT_NAME, obj.getName());
    }

    /**
     * Test a Dreamly object's getStrength() method against an expected value.
     */
    @Test
    public void testStrength() 
    {
        assertEquals(CORRECT_STRENGTH, obj.getStrength());
    }

    /**
     * Test a Dreamly object's getSize() method against an expected value.
     */
    @Test
    public void testSize() 
    {
        assertEquals(CORRECT_SIZE, obj.getSize());
    }

    /**
     * Test a Dreamly object's getColor() method against an expected value.
     */
    @Test
    public void testColor() 
    {
        assertEquals(CORRECT_COLOR, obj.getColor());
    }

    /**
     * Test a Dreamly object's getCasing() method against an expected value.
     */
    @Test
    public void testCasing() 
    {
        assertEquals(CORRECT_CASING, obj.getCasing());
    }

    /**
     * Test a Dreamly object's getSolution() method against an expected value.
     */
    @Test
    public void testSolution() 
    {
        assertEquals(CORRECT_SOLUTION, obj.getSolution());
    }

    /**
     * Test a Dreamly object's getActive() method against an expected value.
     */
    @Test
    public void testActive() 
    {
        assertEquals(CORRECT_ACTIVE, obj.getActive());
    }

    /**
     * Test a Dreamly object's manufacture() method against an expected value.
     */
    @Test
    public void testManufactureProcess() 
    {
        assertEquals(String.format(MANUFACTURE_FSTRING, obj.getCasing(), 
                                   obj.getSolution(), obj.getActive()), 
                                   getOutput());
    }


}
