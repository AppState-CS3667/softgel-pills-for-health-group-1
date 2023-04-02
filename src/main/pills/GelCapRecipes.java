package pills;

import java.util.HashMap;

public class GelCapRecipes 
{
    public static final HashMap<String, CasingGenerator> CASINGS = getCasings();
    public static final HashMap<String, SolutionGenerator> SOLUTIONS = getSolutions();
    public static final HashMap<String, ActiveGenerator> ACTIVES = getActives();

    private static HashMap<String, CasingGenerator> getCasings()
    {
        HashMap<String, CasingGenerator> thisMap = new HashMap<String, CasingGenerator>();
        thisMap.put("dreamly", new GelatinCasing());
        thisMap.put("acheAway", new PlasticizerCasing());
        return thisMap;
    }

    private static HashMap<String, SolutionGenerator> getSolutions()
    {
        HashMap<String, SolutionGenerator> thisMap = new HashMap<String, SolutionGenerator>();
        thisMap.put("dreamly", new OilSolution());
        thisMap.put("acheAway", new SalineSolution());
        return thisMap;
    }

    private static HashMap<String, ActiveGenerator> getActives()
    {
        HashMap<String, ActiveGenerator> thisMap = new HashMap<String, ActiveGenerator>();
        thisMap.put("dreamly", new AcetaminophenActive());
        thisMap.put("acheAway", new ZolpidemActive());
        return thisMap;
    }
}
