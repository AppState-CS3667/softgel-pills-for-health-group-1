package pills;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * This is the SoftGelPillStore Test.
 * author Subteam A
 * @version 1.0
 */
public class TestSoftGelPillStore {
    private final PrintStream OUTPUT = System.out;
    private final Scanner INPUT = new Scanner(System.in);
    
    private SoftGelPillStore obj;

    /**
 	 * Create new testing objects.
 	 */
	@BeforeEach
	public void beforeEach()
	{
		obj = new SoftGelPillStore();
	}

    /**
 	 * Test all four SoftGelPillStore constructors.
 	 */
	@Test
	public void testConstructors()
	{
		// Test SoftGelPillStore(Scanner input, PrintStream output)
        obj = new SoftGelPillStore(INPUT, OUTPUT);
        assertEquals(obj.getInput(), INPUT);
        assertEquals(obj.getOutput(), OUTPUT);

        // Test SoftGelPillStore(PrintStream output)
        obj = new SoftGelPillStore(OUTPUT);
        assertEquals(obj.getInput(), INPUT);
        assertEquals(obj.getOutput(), OUTPUT);

        // Test SoftGelPillStore(Scanner input)
        obj = new SoftGelPillStore(INPUT);
        assertEquals(obj.getInput(), INPUT);
        assertEquals(obj.getOutput(), OUTPUT);

        // Test oftGelPillStore()
        obj = new SoftGelPillStore();
        assertEquals(obj.getInput(), INPUT);
        assertEquals(obj.getOutput(), OUTPUT);
	}

    /**
 	 * Test the getInput method.
 	 */
	@Test
	public void testGetInput()
	{
        assertEquals(obj.getInput(), INPUT);
    }

    /**
 	 * Test the getOutput method.
 	 */
	@Test
	public void testGetOutput()
	{
        assertEquals(obj.getOutput(), OUTPUT);
    }

    /**
 	 * Test the setInput method.
 	 */
	@Test
	public void testSetInput()
	{
        obj.setInput(INPUT);
        assertEquals(obj.getInput(), INPUT);
    }

    /**
 	 * Test the setOutput method.
 	 */
	@Test
	public void testSetOutput()
	{
        obj.setOutput(OUTPUT);
        assertEquals(obj.getOutput(), OUTPUT);
    }
}
