package tests.pills;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pills.AcheAway;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class AcheAwayTest{
    private final String CORRECT_NAME = "AcheAway";
    private final double TEST_STRENGTH = 2.0;
    private final double TEST_SIZE = 5.0;
    private final String TEST_COLOR = "Yellow";
    private final String CORRECT_CASING = "Gelatin";
    private final String CORRECT_SOLUTION = "Saline";
    private final String CORRECT_ACTIVE = "Acetaminophen";
    private final String MANUFACTURE_FSTRING = "Manufacturing...\nadding %s casing\nadding %s solution\nadding %s active\n... completed manufacturing\n";
    private ByteArrayOutputStream baos;
    private PrintStream oldOut;
    private AcheAway obj;
    
    private String getOutput() {
    // flush all data from the PrintStream into our ByteArrayOutputStream
         System.out.flush();
         // return the output with return characters stripped.
         // stripping return characters ensure the test works on mac, unix, and windows
        return baos.toString().replaceAll("\r", "");
      }

    @BeforeEach
    public void beforeEach() {
        this.oldOut = System.out;
        this.baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        this.obj = new AcheAway(TEST_STRENGTH, TEST_SIZE, TEST_COLOR);
    }

    @AfterEach
    public void afterEach() {
        System.setOut(oldOut);
    }
    @Test
    public void TestName() {
        assertEquals(CORRECT_NAME, obj.getName());
    }

    @Test
    public void TestStrength() {
        assertEquals(TEST_STRENGTH, obj.getStrength());
    }

    @Test
    public void TestSize() {
        assertEquals(TEST_SIZE, obj.getSize());
    }

    @Test
    public void TestColor() {
        assertEquals(TEST_COLOR, obj.getColor());
    }
    @Test
    public void TestCasing() {
        assertEquals(CORRECT_CASING, obj.getCasing());
    }
    @Test
    public void TestSolution() {
        assertEquals(CORRECT_SOLUTION, obj.getSolution());
    }
@Test
    public void TestActive(){
        assertEquals(CORRECT_ACTIVE, obj.getActive());
    }   
    @Test
    public void testManufactureProcess() {
        assertEquals(String.format(MANUFACTURE_FSTRING, obj.getCasing(), obj.getSolution(), obj.getActive()), getOutput());
    }   
}   


