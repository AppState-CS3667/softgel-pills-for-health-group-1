package pills;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * This is the SoftGelPillStore Test.
 * @author Subteam A
 * @version 1.0
 */
public class TestSoftGelPillStore 
{
    private final PrintStream OUTPUT = new PrintStream(System.out);
    private final Scanner INPUT = new Scanner(System.in);
    
    private SoftGelPillStore obj;

    /**
 	 * Create new testing objects.
 	 */
	@BeforeEach
	public void beforeEach()
	{
		this.obj = new SoftGelPillStore();
	}

    /**
 	 * Test all four SoftGelPillStore constructors.
 	 */
	@Test
	public void testConstructors()
	{
		// Test SoftGelPillStore(Scanner input, PrintStream output)
        this.obj = new SoftGelPillStore(INPUT, OUTPUT);
        assertEquals(this.obj.getInput(), INPUT);
        assertEquals(this.obj.getOutput(), OUTPUT);

        // // // Test SoftGelPillStore(Scanner input)
        this.obj = new SoftGelPillStore(INPUT);
        assertEquals(this.obj.getInput(), INPUT);
        // assertEquals(this.obj.getOutput(), new PrintStream(System.out));

        // // Test SoftGelPillStore(PrintStream output)
        this.obj = new SoftGelPillStore(OUTPUT);
        assertEquals(this.obj.getOutput(), OUTPUT);

        // // Test oftGelPillStore()  - Nothing in the instructions about doing these
        // this.obj = new SoftGelPillStore();
        // assertEquals(this.obj.getInput(), new Scanner(System.in));
        // assertEquals(this.obj.getOutput(), new PrintStream(System.out));
	}

    /**
 	 * Test the getInput method.
 	 */
	@Test
	public void testGetInput()
	{
        this.obj.setInput(INPUT);
        assertEquals(this.obj.getInput(), INPUT);
    }

    /**
 	 * Test the getOutput method.
 	 */
	@Test
	public void testGetOutput()
	{
        this.obj.setOutput(OUTPUT);
        assertEquals(this.obj.getOutput(), OUTPUT);
    }

    /**
 	 * Test the setInput method.
 	 */
	@Test
	public void testSetInput()
	{
        this.obj.setInput(INPUT);
        assertEquals(this.obj.getInput(), INPUT);
    }

    /**
 	 * Test the setOutput method.
 	 */
	@Test
	public void testSetOutput()
	{
        this.obj.setOutput(OUTPUT);
        assertEquals(this.obj.getOutput(), OUTPUT);
    }
}
