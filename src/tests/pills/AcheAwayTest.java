package tests.pills;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pills.AcheAway;

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
    private final String CORRECT_NAME = "AcheAway";
    private final double TEST_STRENGTH = 2.0;
    private final double TEST_SIZE = 5.0;
    private final String TEST_COLOR = "Yellow";
    private final String CORRECT_CASING = "Gelatin";
    private final String CORRECT_SOLUTION = "Saline";
    private final String CORRECT_ACTIVE = "Acetaminophen";
    private final String MANUFACTURE_FSTRING = "Manufacturing..."
                                               + "\nadding %s casing\n"
                                               + "adding %s solution"
                                               + "\nadding %s active\n... "
                                               + "completed manufacturing\n";
    private ByteArrayOutputStream baos;
    private PrintStream oldOut;
    private AcheAway obj;
    
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
     *  Redirect output and create a new test AcheAway object before each test.
     */  
    @BeforeEach
    public void beforeEach() 
    {
        this.oldOut = System.out;
        this.baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        this.obj = new AcheAway(TEST_STRENGTH, TEST_SIZE, TEST_COLOR);
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
     * Test an AcheAway object's getName() method against an expected value.
     */
    @Test
    public void testName() 
    {
        assertEquals(CORRECT_NAME, obj.getName());
    }

    /**
     * Test an AcheAway object's getStrength() method against an expected value.
     */
    @Test
    public void testStrength() 
    {
        assertEquals(TEST_STRENGTH, obj.getStrength());
    }

    /**
     * Test an AcheAway object's getSize() method against an expected value.
     */
    @Test
    public void testSize() 
    {
        assertEquals(TEST_SIZE, obj.getSize());
    }

    /**
     * Test an AcheAway object's getColor() method against an expected value.
     */
    @Test
    public void testColor() 
    {
        assertEquals(TEST_COLOR, obj.getColor());
    }

    /**
     * Test an AcheAway object's getCasing() method against an expected value.
     */
    @Test
    public void testCasing() 
    {
        assertEquals(CORRECT_CASING, obj.getCasing());
    }

    /**
     * Test an AcheAway object's getSolution() method against an expected value.
     */
    @Test
    public void testSolution() 
    {
        assertEquals(CORRECT_SOLUTION, obj.getSolution());
    }

    /**
     * Test an AcheAway object's getActive() method against an expected value.
     */
    @Test
    public void testActive()
    {
        assertEquals(CORRECT_ACTIVE, obj.getActive());
    }
    
    /**
     * Test an AcheAway object's manufacture() method against an expected value.
     */
    @Test
    public void testManufactureProcess() 
    {
        assertEquals(String.format(MANUFACTURE_FSTRING, obj.getCasing(), 
                                   obj.getSolution(), obj.getActive()), 
                                   getOutput());
    }   
}
