package pills;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 * This is the TestActive class, a class for testing the Acetaminophen and 
 * ZolpidemActive solution classes.
 * @author Subteam B
 * @version 1.0
 */
public class TestActive 
{
    private final String TEST_ACETAMINOPHEN_RETURN = "acetaminophen";
    private final String TEST_ACETAMINOPHEN_PRINT = "Acetylating para-aminophenol"
                                                    + " with acetic anhydride\n"
                                                    + "Carefully extracting 5.00mg "
                                                    + "of acetaminophen\n"
                                                    + "Returning 5.00mg of acetaminophen\n";
    private final String TEST_ZOLPIDEM_RETURN = "zolpidem";
    private final String TEST_ZOLPIDEM_PRINT = "Opening secure storage area...\n"
                                               + "Carefully extracting 2.20mg of zolpidem\n"
                                               + "Returning 2.20mg of zolpidem\n";
    private ByteArrayOutputStream baos;
    private PrintStream oldOut;
    private AcetaminophenActive AActive;
    private ZolpidemActive ZActive;
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
     *  Redirect output and create a new 2 active objects for testing.
     */
    @BeforeEach
    public void beforeEach()
    {
        this.oldOut = System.out;
        this.baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        AActive = new AcetaminophenActive();
        ZActive = new ZolpidemActive();
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
     * Tests the AcetaminophenActive class.
     */
    @Test
    public void testAcetaminophenActive()
    {
        final double AMOUNT = 5.00;
        String result = AActive.generateActive(AMOUNT);
        assertEquals(TEST_ACETAMINOPHEN_RETURN, result);
        assertEquals(TEST_ACETAMINOPHEN_PRINT, getOutput());
    }
    /**
     * Tests the ZolpidemActive class.
     */
    @Test
    public void testZolpidemActive()
    {
        final double AMOUNT = 2.20;
        String result = ZActive.generateActive(AMOUNT);
        assertEquals(TEST_ZOLPIDEM_RETURN, result);
        assertEquals(TEST_ZOLPIDEM_PRINT, getOutput());
    }
}

