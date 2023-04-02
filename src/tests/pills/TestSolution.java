package pills;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;	

/**
 * This is the TestSolution class, a class for testing the oil and 
 * saline solution classes.
 * @author Subteam A
 * @version 1.0
 */
public class TestSolution
{
    private final String TEST_OIL_RETURN = "oil";
    private final String TEST_OIL_PRINT = "Extracting pill-sized quantity of oil..."
                                        + "\nReturning oil solution\n";
    private final String TEST_SALINE_RETURN = "saline";
    private final String TEST_SALINE_PRINT = "Mixing salt and water...\n"
                                             + "Verifying ratio...\n"
                                             + "Returning saline solution\n";

    private ByteArrayOutputStream baos;
    private PrintStream oldOut;

    private OilSolution oilSolution;
    private SalineSolution salineSolution;

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
        oilSolution = new OilSolution();
        salineSolution  = new SalineSolution();
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
     * Tests the OilSolution class.
     */
    @Test
    public void testOil()
    {
        String result = oilSolution.generateSolution();
        assertEquals(TEST_OIL_RETURN, result);
        assertEquals(TEST_OIL_PRINT, getOutput());
    }

    /**
     * Tests the SalineSolution class.
     */
    @Test
    public void testSaline()
    {
        String result = salineSolution.generateSolution();
        assertEquals(TEST_SALINE_RETURN, result);
        assertEquals(TEST_SALINE_PRINT, getOutput());
    }
}
