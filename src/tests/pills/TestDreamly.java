package tests.pills;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import pills.Dreamly;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;	

public class TestDreamly {
    private final String CORRECT_NAME = "Dreamly";
    private final double CORRECT_STRENGTH = 1.1;
    private final double CORRECT_SIZE = 2.2;
    private final String CORRECT_COLOR = "White";
    private final String CORRECT_CASING = "Plasticizer";
    private final String CORRECT_SOLUTION = "Oil";
    private final String CORRECT_ACTIVE = "Zolpidem";
    private final String TOSTRING_FSTRING = "%.2fmg %s Pill";
    private final String DESCRIPTION_FSTRING = "%s Pill\n\tStrength: %.2f\n\tSize: %.2f\n\tColor: %s\n\tCasing: %s\n\tSolution: %s\n\tActive: %s";
    private final String MANUFACTURE_FSTRING = "Manufacturing...\nadding %s casing\nadding %s solution\nadding %s active\n... completed manufacturing\n";
    
    private ByteArrayOutputStream baos;
    private PrintStream oldOut;
    private Dreamly obj;

    private String getOutput() {
        // flush all data from the PrintStream into our ByteArrayOutputStream
        System.out.flush();	
        // return the output with return characters stripped.
        // stripping return characters ensure the test works on mac, unix, and windows
        return baos.toString().replaceAll("\r", "");
    }

    @BeforeEach
    public void beforeEach() {
        // this.obj = new GelCapMock(TEST_NAME, TEST_STRENGTH, TEST_SIZE, TEST_COLOR);
        
        this.oldOut = System.out;
        this.baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        this.obj = new Dreamly(CORRECT_STRENGTH, CORRECT_SIZE, CORRECT_COLOR);
    }
    
    @AfterEach
    public void afterEach() {
        System.setOut(oldOut);
    }

    @Test
    public void testName() {
        assertEquals(CORRECT_NAME, obj.getName());
    }

    @Test
    public void testStrength() {
        assertEquals(CORRECT_STRENGTH, obj.getStrength());
    }

    @Test
    public void testSize() {
        assertEquals(CORRECT_SIZE, obj.getSize());
    }

    @Test
    public void testColor() {
        assertEquals(CORRECT_COLOR, obj.getColor());
    }

    @Test
    public void testCasing() {
        assertEquals(CORRECT_CASING, obj.getCasing());
    }

    @Test
    public void testSolution() {
        assertEquals(CORRECT_SOLUTION, obj.getSolution());
    }

    @Test
    public void testActive() {
        assertEquals(CORRECT_ACTIVE, obj.getActive());
    }

    @Test
    public void testManufactureProcess() {
        assertEquals(String.format(MANUFACTURE_FSTRING, obj.getCasing(), obj.getSolution(), obj.getActive()), getOutput());
    }


}
