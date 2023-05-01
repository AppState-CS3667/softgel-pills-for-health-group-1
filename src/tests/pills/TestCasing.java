package pills;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.rmi.RemoteException;	

/**
 * This is the TestCasing class, a class for testing the gelatin and 
 * plasticizer solution classes.
 * @author Subteam A
 * @version 1.1
 */
public class TestCasing
{
    private final String TEST_GELATIN_RETURN = "gelatin";
    private final String TEST_GELATIN_PRINT = "Mixing gelatin, water, opacifier, and glycerin...\n"
                                                + "Shaping...\nReturning gelatin casing...\n";
    private final String TEST_PLAST_RETURN = "plasticizer";
    private final String TEST_PLAST_PRINT = "Mixing starch, water, opacifier, and glycerin...\n"
                                                + "Shaping...\nReturning plasticizier casing...\n";

    private ByteArrayOutputStream baos;
    private PrintStream oldOut;

    private OilSolution gelatinCasing;
    private SalineSolution plastCasing;

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
     * Redirect output and create a new test Dreamly object before each test.
     * @exception e RemoteException
     */
    @BeforeEach
    public void beforeEach()
    {
        this.oldOut = System.out;
        this.baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        try
        {
            final int GELATIN_CASING_PORT = 1098;
            gelatinCasing = new OilSolution(GELATIN_CASING_PORT);
            final int PLAST_CASING_PORT = 1097;
            plastCasing  = new SalineSolution(PLAST_CASING_PORT);
        }
        catch (RemoteException e)
        {
            gelatinCasing = null;
            plastCasing  = null;
        }
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
        String result = gelatinCasing.generateSolution();
        assertEquals(TEST_GELATIN_RETURN, result);
        assertEquals(TEST_GELATIN_PRINT, getOutput());
    }

    /**
     * Tests the SalineSolution class.
     */
    @Test
    public void testSaline()
    {
        String result = plastCasing.generateSolution();
        assertEquals(TEST_PLAST_RETURN, result);
        assertEquals(TEST_PLAST_PRINT, getOutput());
    }
}
