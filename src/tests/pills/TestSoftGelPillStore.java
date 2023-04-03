package pills;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * This is the SoftGelPillStore Test.
 * @author Subteam A
 * @version 1.0
 */
public class TestSoftGelPillStore 
{
    private final String TEST_LOGIN_NAME = "Tester";
    private final int TEST_LOGIN_AGE = 50;
    private final String TEST_LOGIN_INPUT = "Tester\n50\n";
    private final String TEST_LOGIN_OUTPUT = "What is your name?\nWhat is your age?\n";
    private final String TEST_LOGOUT_INPUT = "y\n";
    private final String TEST_CHECKOUT_OUTPUT = "You need to log in and order before you can checkout\n";
    private final String TEST_ORDER_INPUT = "asdf\n3\n";
    private final String TEST_ORDER_OUTPUT = "Hello, Tester. What would you like to order?\nOptions:\n1) Dreamly\n2) AcheAway\n3) Cancel\nPlease enter a 1, 2, or 3\n";
    
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

        // Test SoftGelPillStore(Scanner input)
        this.obj = new SoftGelPillStore(INPUT);
        assertEquals(this.obj.getInput(), INPUT);
        assertEquals(this.obj.getOutput(), System.out);

        // Test SoftGelPillStore(PrintStream output)
        this.obj = new SoftGelPillStore(OUTPUT);
        assertEquals(this.obj.getOutput(), OUTPUT);

        // Test oftGelPillStore()  - Nothing in the instructions about doing these
        this.obj = new SoftGelPillStore();
        assertEquals(this.obj.getOutput(), System.out);
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

    /**
 	 * Test the logIn methods.
 	 */
	@Test
	public void testLogIn()
	{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        this.obj.setOutput(new PrintStream(baos));
        this.obj.setInput(new Scanner(TEST_LOGIN_INPUT));
        this.obj.logIn();
        System.out.flush();
		String result = baos.toString().replaceAll("\r", "");
        assertEquals(result, TEST_LOGIN_OUTPUT);
    }
    
    /**
 	 * Test the logOut methods.
 	 */
	@Test
	public void testLogOut()
	{
        this.obj.logIn(TEST_LOGIN_NAME, TEST_LOGIN_AGE);
        this.obj.setInput(new Scanner(TEST_LOGOUT_INPUT));
        assertTrue(this.obj.logOut());
    }

    /**
 	 * Test the checkout method.
 	 */
	@Test
	public void testCheckOut()
	{
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        this.obj.setOutput(new PrintStream(baos));
        this.obj.checkOut();
        System.out.flush();
		String result = baos.toString().replaceAll("\r", "");
        assertEquals(result, TEST_CHECKOUT_OUTPUT);
    }

    /**
 	 * Test the order method.
 	 */
	@Test
	public void testOrder()
	{
        this.obj.logIn(TEST_LOGIN_NAME, TEST_LOGIN_AGE);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        this.obj.setOutput(new PrintStream(baos));
        this.obj.setInput(new Scanner(TEST_ORDER_INPUT));
        this.obj.order();
        System.out.flush();
		String result = baos.toString().replaceAll("\r", "");
        assertEquals(result, TEST_ORDER_OUTPUT);
    }
}
