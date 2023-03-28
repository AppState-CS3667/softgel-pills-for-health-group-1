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
    private GelCapRecipies gelCapRecipies;
    
    /**
     *  Create a new test GelCapRecipies object before each test.
     */
    @BeforeEach
    public void beforeEach()
    {
        gelCapRecipies = new GelCapRecipies();
    }

    /**
     *  Test the getCasings method.
     */
    @Test
    public void testCasings()
    {
        assertTrue(gelCapRecipies.CASINGS.get("acheAway") instanceof(GelatinCasing));
        assertTrue(gelCapRecipies.CASINGS.get("dreamly") instanceof(PlasticizerCasing));
    }

    /**
     *  Test the getSolutions method.
     */
    @Test
    public void testSolutions()
    {
        assertTrue(gelCapRecipies.SOLUTIONS.get("acheAway") instanceof(SalineSolution));
        assertTrue(gelCapRecipies.SOLUTIONS.get("dreamly") instanceof(OilSolution));
    }

    /**
     *  Test the getActives method.
     */
    @Test
    public void testActives()
    {
        assertTrue(gelCapRecipies.ACTIVES.get("acheAway") instanceof(AcetaminophenActive));
        assertTrue(gelCapRecipies.ACTIVES.get("dreamly") instanceof(ZolpidemActive));
    }
}
