package pills;
import org.junit.jupiter.api.Test;
import pills.GelCapFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * This is the GelCapFactory Test.
 * author Subteam B
 * @version 1.0
 */

public class TestGelCapFactory
{
	private final String TEST_A_CASING = "Gelatin";
	private final String TEST_D_CASING = "Plasticizer";
	private final String TEST_A_SOLUTION = "Saline";
	private final String TEST_D_SOLUTION = "Oil";
	private final String TEST_A_ACTIVE = "Acetaminophen";
	private final String TEST_D_ACTIVE = "Zolpidem";
	private final String TEST_PD_P = "Creating a Dreamly pill...\n"
					+ "constructDreamly called\n"
					+ "Returning a good Dreamly GelCap Pill\n";
	private final String TEST_PD_F = "Creating a Dreamly pill...\n"
                                        + "constructDreamly called\n"
                                        + "Error during Dreamly production. Returning null.\n";
	private final String TEST_PA_P = "Creating a AcheAway pill...\n"
                                        + "constructAcheAway called\n"
                                        + "Returning a good AcheAway GelCap Pill\n";
	private final String TEST_PA_F = "Creating a AcheAway pill...\n"
                                        + "constructAcheAway called\n"
                                        + "Error during AcheAway production. Returning null.\n";




	
	private ByteArrayOutputStream baos;
	private PrintStream oldOut;
	private GelCapFactory obj;

	private class GelCapFactoryMock extends GelCapFactory
	{
		/**
		 * Updating abstract method constructDreamly for GelCapFactoryMock to print called statements.
		 * @param casing
		 * @param solution
		 * @param active
		 * @return DreamlyMock
		 */
		@Override
		protected Dreamly constructDreamly(String casing, String solution, String active)
		{
			System.out.print("constructDreamly called\n");
			return super.constructDreamly(casing, solution, active);
		}
		/**
		 * Updating abstract method constructAcheAway for GelCapFactoryMock to print called statements.
		 * @param casing
		 * @param solution
		 * @param active
		 * @return AcheAwayMock
		 */
		@Override
		protected AcheAway constructAcheAway(String casing, String solution, String active)
		{
			System.out.print("constructAcheAway called\n");
			return super.constructAcheAway(casing, solution, active);
		}
		
		/**
		 * Updating abstract method getDreamlyStrength for GelCapFactoryMock to print called statements.
		 * @return default value of 0
		 */
		@Override
		protected int getDreamlyStrength()
		{
			System.out.print("getDreamlyStrength called\n");
			return 0;
		}
		
		/**
		 * Updating abstract method getAcheAwayStrength for GelCapFactoryMock to print called statements.
		 * @return default value of 0
		 */
		@Override
		protected int getAcheAwayStrength()
		{
			System.out.print("getAcheAwayStrength called\n");
			return 0;
		}
		
	}

	/**
	 * Flushes data from PrintStream into baos
	 * @return the output with return characters stripped
	 */
	private String getOutput()
	{
		System.out.flush();
		return baos.toString().replaceAll("\r", "");
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
 	 * Test produceDreamly() method, whether the printstatements are correct and whether the chances of qualitycheck is around 10%.
 	 */
	@Test
	public void testProduceDreamly()
	{
		int fail = 0;
		int success = 0;
		for (int i = 0; i < 101; i++)
		{
			obj.produceDreamly();
			String output = getOutput();
			if (output.equals(TEST_PD_P))
			{
				success++;
			}
			else if (output.equals(TEST_PD_F))
			{
				fail++;
			}
			else 
			{
				fail("The output did not match the expected result.");
			}
		}
		assertTrue(fail >= 7 && fail <= 13);
	}
	/**
 	 * Test produceAcheAway() method, whether the printstatements are correct and whether the chances of qualitycheck is around 10%.
 	 */
	@Test
	public void testProduceAcheAway()
	{
		int fail = 0;
		int success = 0;
		for (int i = 0; i < 101; i++)
		{
			obj.produceAcheAway();
			String output = getOutput();
			if (obj.qualityCheck(TEST_PA_P))
			{
				success++;
			}
			else if (output.equals(TEST_PA_F))
			{
				fail++;
			}
			else
			{
				fail("The output did not match the expected result.");
			}
		assertTrue(fail >= 7 && fail <= 13);
		}
	}
}
