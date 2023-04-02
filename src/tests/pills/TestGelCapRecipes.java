package pills;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * This is the TestGelCapRecipes class, which tests the GelCapRecpies class.
 * @author Subteam A
 * @version 1.0
 */
public class TestGelCapRecipes 
{
    // private GelCapRecipes gelCapRecipes;
    
    // /**
    //  *  Create a new test GelCapRecipies object before each test.
    //  */
    // @BeforeEach
    // public void beforeEach()
    // {
    //     gelCapRecipes = new GelCapRecipes();
    // }

    /**
     *  Test the getCasings method.
     */
    @Test
    public void testCasings()
    {
        assertTrue(GelCapRecipes.CASINGS.get("dreamly") instanceof GelatinCasing);
        assertTrue(GelCapRecipes.CASINGS.get("acheAway") instanceof PlasticizerCasing);
    }

    /**
     *  Test the getSolutions method.
     */
    @Test
    public void testSolutions()
    {
        assertTrue(GelCapRecipes.SOLUTIONS.get("dreamly") instanceof OilSolution);
        assertTrue(GelCapRecipes.SOLUTIONS.get("acheAway") instanceof SalineSolution);
    }

    /**
     *  Test the getActives method.
     */
    @Test
    public void testActives()
    {
        assertTrue(GelCapRecipes.ACTIVES.get("dreamly") instanceof AcetaminophenActive);
        assertTrue(GelCapRecipes.ACTIVES.get("acheAway") instanceof ZolpidemActive);
    }
}
