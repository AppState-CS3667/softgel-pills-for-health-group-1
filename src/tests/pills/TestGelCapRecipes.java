package pills;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

/**
 * This is the TestGelCapRecipes class, which tests the GelCapRecpies class.
 * @author Subteam A
 * @version 1.0
 */
public class TestGelCapRecipes {
    private GelCapRecipes gelCapRecipes;
    
    /**
     *  Create a new test GelCapRecipies object before each test.
     */
    @BeforeEach
    public void beforeEach()
    {
        gelCapRecipes = new GelCapRecipes();
    }

    /**
     *  Test the getCasings method.
     */
    @Test
    public void testCasings()
    {
        assertTrue(gelCapRecipes.CASINGS.get("acheAway") instanceof GelatinCasing);
        assertTrue(gelCapRecipes.CASINGS.get("dreamly") instanceof PlasticizerCasing);
    }

    /**
     *  Test the getSolutions method.
     */
    @Test
    public void testSolutions()
    {
        assertTrue(gelCapRecipes.SOLUTIONS.get("acheAway") instanceof SalineSolution);
        assertTrue(gelCapRecipes.SOLUTIONS.get("dreamly") instanceof OilSolution);
    }

    /**
     *  Test the getActives method.
     */
    @Test
    public void testActives()
    {
        assertTrue(gelCapRecipes.ACTIVES.get("acheAway") instanceof AcetaminophenActive);
        assertTrue(gelCapRecipes.ACTIVES.get("dreamly") instanceof ZolpidemActive);
    }
}
