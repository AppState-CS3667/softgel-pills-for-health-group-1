package tests.pills;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;	

public class TestGelCap {
    private final String TEST_NAME = "Provolone";
    private final double TEST_STRENGTH = 1.1;
    private final double TEST_SIZE = 2.2;
    private final String TEST_COLOR = "White";
    private final String TEST_CASING = "X";
    private final String TEST_SOLUTION = "Y";
    private final String TEST_ACTIVE = "Z";
    private final String TOSTRING_FSTRING = "%.2fmg %s Pill";
    private final String DESCRIPTION_FSTRING = "%s Pill\n\tStrength: %.2f\n\tSize: %.2f\n\tColor: %s\n\tCasing: %f\n\tSolution: %f\n\tActive: %f\n";
    private final String MANUFACTURE_FSTRING = "Manufacturing... \n%s\n%s\n%s\n... Manufacturing... \n";
    
    private ByteArrayOutputStream baos;
    private PrintStream oldOut;
    private GelCapMock obj;

    private class GelCapMock extends GelCap{
        protected String name;
        protected double strength;
        protected double size;
        protected String color;
        protected String casing;
        protected String solution;
        protected String active;


        GelCapMock(String name, double strength, double size, String color) {
            this.name = name;
            this.strength = strength;
            this.size = size;
            this.color = color;
        }

        protected void addCasing() {
            casing = "X";
            System.out.print(casing + "\n");
        }

        protected void addSolution() {
            solution = "Y";
            System.out.print(solution + "\n");
        }

        protected void addActive() {
            active = "Z";
            System.out.print(active + "\n");
        }
    }

    private String getOutput() {
        // flush all data from the PrintStream into our ByteArrayOutputStream
        System.out.flush();	
        // return the output with return characters stripped.
        // stripping return characters ensure the test works on mac, unix, and windows
        return baos.toString().replaceAll("\r", "");
    }

    @BeforeEach
    public void beforeEach() {
        this.obj = new GelCapMock(TEST_NAME, TEST_STRENGTH, TEST_SIZE, TEST_COLOR);
        
        this.oldOut = System.out;
        this.baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }
    
    @AfterEach
    public void afterEach() {
        System.setOut(oldOut);
    }

    @Test
    public void testName() {
        assertEquals(TEST_NAME, obj.getName());
    }

    @Test
    public void testStrength() {
        assertEquals(TEST_STRENGTH, obj.getStrength());
    }

    @Test
    public void testSize() {
        assertEquals(TEST_SIZE, obj.getSize());
    }

    @Test
    public void testColor() {
        assertEquals(TEST_COLOR, obj.getColor());
    }

    @Test
    public void testCasing() {
        assertEquals(TEST_CASING, obj.getCasing());
    }

    @Test
    public void testSolution() {
        assertEquals(TEST_SOLUTION, obj.getSolution());
    }

    @Test
    public void testActive() {
        assertEquals(TEST_ACTIVE, obj.getActive());
    }

    @Test
    public void testToString() {
        assertEquals(String.format(TOSTRING_FSTRING, obj.getStrength(), obj.getName()), obj.toString());    }

    @Test
    public void testDescription() {
        assertEquals(String.format(DESCRIPTION_FSTRING, obj.getName(), obj.getStrength(), obj.getSize(), obj.getColor(), obj.getCasing(), obj.getSolution(), obj.getActive()), obj.description());    }

    @Test
    public void testManufactureProcess() {
        assertEquals(String.format(MANUFACTURE_FSTRING, obj.getCasing()), obj.getSolution(), obj.getActive()), getOutput());
    }
}
