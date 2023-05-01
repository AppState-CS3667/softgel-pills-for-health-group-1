package pills;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * This is the SoftGelPillStore Test.
 * @author Subteam A
 * @version 1.2
 */
public class TestInspector 
{
    private final String TEST_LOGIN_NAME = "Tester";
    private final int TEST_LOGIN_AGE_ADULT = 18;
	private final int TEST_LOGIN_AGE_CHILD = 17;
    
    private final String TEST_DS_ORDER_INPUT = "1\n3\n";
    private final String TEST_AS_ORDER_INPUT = "2\n3\n";

	private final String CORRECT_CONSISTENCY_REPORT = "Consistency Report\n\t"
													+ "Adult Pills : 0\n\tChild Pills : 0";
	private final String CORRECT_FAILURE_REPORT = "Failure Report\n\t"
												+ "Null Pills : 0\n\tChild Pills : 0";
	private final String CORRECT_STRENGTH_REPORT = "Strength Report\n\t"
												+ "AcheAway Pills : 0.0\n\tChild Pills : 0.0";
    
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
 	 * Test the strength inspector using adult dreamly. 
 	 */
	@Test 
	public void testStrengthInspectorAdultDreamly()
	{
		this.obj.logIn(TEST_LOGIN_NAME, TEST_LOGIN_AGE_ADULT);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		this.obj.setOutput(new PrintStream(baos));
		this.obj.setInput(new Scanner(TEST_DS_ORDER_INPUT));
		this.obj.order();
		assertEquals(AdultDreamly.STRENGTH, obj.getDreamlyStrength());
	}

    /**
 	 * Test the strength inspector using child dreamly. 
 	 */
	@Test 
	public void testStrengthInspectorChildDreamly()
	{
		this.obj.logIn(TEST_LOGIN_NAME, TEST_LOGIN_AGE_CHILD);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		this.obj.setOutput(new PrintStream(baos));
		this.obj.setInput(new Scanner(TEST_DS_ORDER_INPUT));
		this.obj.order();
		assertEquals(ChildDreamly.STRENGTH, obj.getDreamlyStrength());
	}
	
	/**
 	 * Test the strength inspector using adult acheAway. 
 	 */
	@Test
	public void testStrengthInspectorAdultAdultAcheAway()
	{
		this.obj.logIn(TEST_LOGIN_NAME, TEST_LOGIN_AGE_ADULT);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		this.obj.setOutput(new PrintStream(baos));
		this.obj.setInput(new Scanner(TEST_AS_ORDER_INPUT));
		this.obj.order();
		assertEquals(AdultAcheAway.STRENGTH, obj.getAcheAwayStrength());
	}

    /**
 	 * Test the strength inspector using child acheAway. 
 	 */
	@Test
	public void testStrengthInspectorChildAdultAcheAway()
	{
		this.obj.logIn(TEST_LOGIN_NAME, TEST_LOGIN_AGE_CHILD);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		this.obj.setOutput(new PrintStream(baos));
		this.obj.setInput(new Scanner(TEST_AS_ORDER_INPUT));
		this.obj.order();
		assertEquals(ChildAcheAway.STRENGTH, obj.getAcheAwayStrength());
	}
	
	/**
 	 * Test the report() method of the consistency inspector.
 	 */
	@Test
	public void testConsistencyResetReport()
	{
		ConsistencyInspector testInspector = new ConsistencyInspector();
		testInspector.reset();
		assertEquals(CORRECT_CONSISTENCY_REPORT, testInspector.report());
	}    
	
	/**
 	 * Test the report() method of the failure inspector.
 	 */
	  @Test
	  public void testFailureResetReport()
	  {
		  FailureInspector testInspector = new FailureInspector();
		  testInspector.reset();
		  assertEquals(CORRECT_FAILURE_REPORT, testInspector.report());
	  } 

	  /**
 	 * Test the report() method of the strength inspector.
 	 */
	  @Test
	  public void testStrengthResetReport()
	  {
		  StrengthInspector testInspector = new StrengthInspector();
		  testInspector.reset();
		  assertEquals(CORRECT_STRENGTH_REPORT, testInspector.report());
	  } 
}

