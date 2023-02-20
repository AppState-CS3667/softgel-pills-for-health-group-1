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
    private final String TEST_SOLUTOIN = "Y";
    private final String TEST_ACTIVE = "Z";
    
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

    private void getOutput() {
        this.oldOut = System.out;
        this.baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
    }

    @BeforeEach
    public void beforeEach() {
        this.obj = new GelCapMock(TEST_NAME, TEST_STRENGTH, TEST_SIZE, TEST_COLOR);
        getOutput();
    }
    
    @AfterEach
    public void afterEach() {
        System.setOut(oldOut);
    }

    @Test
    public void TestName() {
        assertEquals(TEST_NAME, obj.getName());
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
        assertEquals(TEST_CASING, obj.getCasing());
    }
}
