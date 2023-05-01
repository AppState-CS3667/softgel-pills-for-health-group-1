package pills;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * This is the GelCapFactory Test.
 * @author Subteam B
 * @version 1.2
 */

public class TestGelCapFactory
{
	private final String TEST_PD_P = "Creating a Dreamly pill...\n"
										+ "getDreamlyStrength called\n"
										+ "constructDreamly called\n"
										+ "Performing quality check...\n"
										+ "quality check passed\n"
										+ "Returning a good Dreamly GelCap Pill\n";
	private final String TEST_PD_F = "Creating a Dreamly pill...\n"
										+ "getDreamlyStrength called\n"
                                        + "constructDreamly called\n" 
										+ "Performing quality check...\n"
										+ "quality check failed\n"
                                        + "Error during Dreamly production. Returning null.\n";
	private final String TEST_PA_P = "Creating a AcheAway pill...\n"
										+ "getAcheAwayStrength called\n"
                                        + "constructAcheAway called\n"
										+ "Performing quality check...\n"
										+ "quality check passed\n"
                                        + "Returning a good AcheAway GelCap Pill\n";
	private final String TEST_PA_F = "Creating a AcheAway pill...\n"
										+ "getAcheAwayStrength called\n"
                                        + "constructAcheAway called\n"
										+ "Performing quality check...\n"
										+ "quality check failed\n"
                                        + "Error during AcheAway production. Returning null.\n";

	private ByteArrayOutputStream baos;
	private PrintStream oldOut;
	private GelCapFactory obj;
	
	/**
	 * Mock of the GelCap class for testing.
	 */
	private class GelCapFactoryMock extends GelCapFactory
	{
		/**
		 * Updating abstract method constructDreamly for GelCapFactoryMock to print 
		 * called statements.
		 * @param casing the casing of the GelCapFactory mock
		 * @param solution the solution of the GelCapFactory mock
		 * @param active the active of the GelCapFactory mock
		 * @return DreamlyMock
		 */
		@Override
		protected Dreamly constructDreamly(String casing, String solution, String active)
		{
			System.out.print("constructDreamly called\n");
			return null;
		}

		/**
		 * Updating abstract method constructAcheAway for GelCapFactoryMock to print 
		 * called statements.
		 * @param casing the casing of the GelCapFactory mock
		 * @param solution the solution of the GelCapFactory mock
		 * @param active the active of the GelCapFactory mock
		 * @return AcheAwayMock
		 */
		@Override
		protected AcheAway constructAcheAway(String casing, String solution, String active)
		{
			System.out.print("constructAcheAway called\n");
			return null;
		}
		
		/**
		 * Updating abstract method getDreamlyStrength for GelCapFactoryMock to 
		 * print called statements.
		 * @return default value of 0
		 */
		@Override
		protected double getDreamlyStrength()
		{
			System.out.print("getDreamlyStrength called\n");
			return 0;
		}
		
		/**
		 * Updating abstract method getAcheAwayStrength for GelCapFactoryMock to 
		 * print called statements.
		 * @return default value of 0
		 */
		@Override
		protected double getAcheAwayStrength()
		{
			System.out.print("getAcheAwayStrength called\n");
			return 0;
		}
		
	}

	/**
	 * Flushes data from PrintStream into baos.
	 * @return the output with return characters stripped
	 */
	private String getOutput()
	{
		System.out.flush();
		String output = baos.toString().replaceAll("\r", "");
		baos.reset();
		return output;
	}

	/**
 	 * Redirect output and create a new GelCapFactory object before each test.
 	 */
	@BeforeEach
	public void beforeEach()
	{
		this.oldOut = System.out;
		this.baos = new ByteArrayOutputStream();
		System.setOut(new PrintStream(baos));
		this.obj = new GelCapFactoryMock();
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
 	 * Test produceDreamly() method, whether the printstatements are correct and
	 * whether the chances of qualitycheck is around 10%.
 	 */
	@Test
	public void testDreamlyFactoryType()
	{
		GelCapFactory testAdultFactory = AdultGelCapFactory.getInstance();
		assertTrue(testAdultFactory.produceDreamly() instanceof Dreamly);
		testAdultFactory = ChildGelCapFactory.getInstance();
		assertTrue(testAdultFactory.produceDreamly() instanceof Dreamly);
	}

	/**
	 * Test produceDreamly() method, whether the printstatements are correct and
	* whether the chances of qualitycheck is around 10%.
	*/
	@Test
	public void testAcheAwayFactoryType()
	{
		GelCapFactory testAdultFactory = AdultGelCapFactory.getInstance();
		assertTrue(testAdultFactory.produceAcheAway() instanceof AcheAway);
		testAdultFactory = ChildGelCapFactory.getInstance();
		assertTrue(testAdultFactory.produceAcheAway() instanceof AcheAway);
	}

	/**
 	 * Test produceDreamly() method, whether the printstatements are correct and
	 * whether the chances of qualitycheck is around 10%.
 	 */
	@Test
	public void testProduceDreamly()
	{
		int fail = 0;
		int success = 0;
		final int AMOUNT = 101; 
		for (int i = 0; i < AMOUNT; i++)
		{
			obj.produceDreamly();
			String screen = getOutput();
			
			if (screen.equals(TEST_PD_P))
			{
				success++;
			}
			else if (screen.equals(TEST_PD_F))
			{
				fail++;
			}
			else 
			{
				fail("The output did not match the expected result: \n" + screen);
			}
		}
		double failRate = fail / (double) success;
		final double RANGE = 0.05;
		final double LOWER = 0.1;
		assertTrue(failRate <= LOWER + RANGE || failRate >= LOWER - RANGE);
	}
	/**
 	 * Test produceAcheAway() method, whether the printstatements are correct and
	 * whether the chances of qualitycheck is around 10%.
 	 */
	@Test
	public void testProduceAcheAway()
	{
		int fail = 0;
		int success = 0;   
		final int AMOUNT = 101;
		for (int i = 0; i < AMOUNT; i++)
		{
			obj.produceAcheAway();
			String screen = getOutput();

			if (screen.equals(TEST_PA_P))
			{
				success++; 
			}
			else if (screen.equals(TEST_PA_F))
			{
				fail++;
			}
			else
			{
				fail("The output did not match the expected result: \n" + screen);
			}
			double failRate = fail / (double) success;
			final double RANGE = 0.05;
			final double LOWER = 0.1;
			assertTrue(failRate <= LOWER + RANGE || failRate >= LOWER - RANGE);
		}
	}	
}
