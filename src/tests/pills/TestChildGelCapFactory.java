package pills;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * This is the TestChildGelCapFactory class, which tests the ChildGelCapFactory class.
 * @author Subteam A
 * @version 1.1
 */
public class TestChildGelCapFactory 
{
    private final String TEST_CASING = "Test Casing";
    private final String TEST_SOLUTION = "Test Solution";
    private final String TEST_ACTIVE = "Test Active";
    private final double CORRECT_DREAMLY_STRENGTH = 1.25;
    private final double CORRECT_ACHEAWAY_STRENGTH = 415.00;
    private final String CORRECT_DREAMLY_PRINT = "Constructing child version of Dreamly\n";
    private final String CORRECT_ACHEAWAY_PRINT = "Constructing child version of AcheAway\n";
    
    private ByteArrayOutputStream baos;
	private PrintStream oldOut;

    private ChildGelCapFactory obj;

    /**
	 * Flushes data from PrintStream into baos.
	 * @return the output with return characters stripped
	 */
	private String getOutput()
	{
		System.out.flush();
		return baos.toString().replaceAll("\r", "");
	}

	/**
 	 * Redirect output and create a new ChildGelCapFactory object before each test.
 	 */
	@BeforeEach
	public void beforeEach()
	{
		this.oldOut = System.out;
		this.baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));
		this.obj = ChildGelCapFactory.getInstance();
	}

	/**
	 * Reset after each test.
	 */
	@AfterEach
	public void afterEach()
	{
		System.setOut(oldOut);
	} 

    /**
     * Test the constructDreamly method.
     */
    @Test
    public void testConstructDreamly() 
    {
        Dreamly result = obj.constructDreamly(TEST_CASING, TEST_SOLUTION, TEST_ACTIVE);
        assertEquals(CORRECT_DREAMLY_PRINT, getOutput());
        assertTrue(result instanceof ChildDreamly);
    }

    /**
     * Test the constructAcheAway method.
     */
    @Test
    public void testConstructAcheAway() 
    {
        AcheAway result = obj.constructAcheAway(TEST_CASING, TEST_SOLUTION, TEST_ACTIVE);
        assertEquals(CORRECT_ACHEAWAY_PRINT, getOutput());
        assertTrue(result instanceof ChildAcheAway);
    }

    /**
     * Test the getDreamlyStrength method.
     */
    @Test
    public void testGetDreamlyStrength() 
    {
        assertEquals(obj.getDreamlyStrength(), CORRECT_DREAMLY_STRENGTH);
    }

    /**
     * Test the getAcheAwayStrength method.
     */
    @Test
    public void testGetAcheAwayStrength() 
    {
        assertEquals(obj.getAcheAwayStrength(), CORRECT_ACHEAWAY_STRENGTH);
    }

    /**
     * Test the getAcheAwayStrength method.
     */
    @Test
    public void testOnlyOneChildFactory() 
    {
        ChildGelCapFactory obj2 = ChildGelCapFactory.getInstance();
        assertEquals(this.obj.hashCode(), obj2.hashCode());
    }
}
