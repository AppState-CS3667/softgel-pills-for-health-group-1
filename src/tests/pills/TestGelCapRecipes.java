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
        assertTrue(GelCapRecipes.CASINGS.get("dreamly") instanceof CasingGenerator);
        assertTrue(GelCapRecipes.CASINGS.get("acheAway") instanceof CasingGenerator);
    }

    /**
     *  Test the getSolutions method.
     */
    @Test
    public void testSolutions()
    {
        assertTrue(GelCapRecipes.SOLUTIONS.get("dreamly") instanceof SolutionGenerator);
        assertTrue(GelCapRecipes.SOLUTIONS.get("acheAway") instanceof SolutionGenerator);
    }

    /**
     *  Test the getActives method.
     */
    @Test
    public void testActives()
    {
        assertTrue(GelCapRecipes.ACTIVES.get("dreamly") instanceof ActiveGenerator);
        assertTrue(GelCapRecipes.ACTIVES.get("acheAway") instanceof ActiveGenerator);
    }
}
