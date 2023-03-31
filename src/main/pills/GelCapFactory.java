package pills;

/**
 *GelCapFactory class.
 *@author Subteam A
 *@version 1.0
 */
public abstract class GelCapFactory {
    /**
 	 * The produceDreamly method.
 	 * @return a Dreamly object 
 	 */ 	
    public final Dreamly produceDreamly() {
        System.out.print("Creating a Dreamly pill...\n");
        constructDreamly(GelCapRecipies.CASINGS.get("dreamly"), GelCapRecipies.SOLUTIONS.get("dreamly"), GelCapRecipies.ACTIVES.get("dreamly"));
        Dreamly result;
        if (qualityCheck()) {
            System.out.print("Returning a good Dreamly GelCap Pill\n");
            return result;
        }
        else {
            System.out.print("Error during Dreamly production. Returning null.\n");
            return null;
        }
    }

    /**
 	 * The produceAcheAway method.
 	 * @return a Dreamly object 
 	 */ 	
    public final AcheAway produceAcheAway() {
        System.out.print("Creating a AcheAway pill...\n");
        constructDreamly(GelCapRecipies.CASINGS.get("dreamly"), GelCapRecipies.SOLUTIONS.get("dreamly"), GelCapRecipies.ACTIVES.get("dreamly"))
        AcheAway result;
        if (qualityCheck()) {
            System.out.print("Returning a good AcheAway GelCap Pill\n");
            return result;
        }
        else {
            System.out.print("Error during AcheAway production. Returning null.\n");
            return null;
        }
    }

    /**
 	 * The qualityCheck method.
 	 * @return a boolean
 	 */ 	
    private final boolean qualityCheck() {
        System.out.print("Performing quality check...\n");
        if (Math.random() >= 0.9) {
            System.out.print("quality check passed\n");
            return true;
        }
        else {
            System.out.print("quality check failed\n");
            return false;
        }
    }

    /**
 	 * The abstract constructDreamly method.
 	 */ 	
    protected abstract Dreamly constructDreamly(String casing, String solution, String active);

    /**
 	 * The abstract constructAcheAway method.
 	 */ 	
    protected abstract AcheAway constructAcheAway(String casing, String solution, String active);

    /**
 	 * The abstract getDreamlyStrength method.
 	 */ 	
    protected abstract double getDreamlyStrength();

    /**
     * The abstract getAcheAwayStrength method.
     */ 	
    protected abstract double getAcheAwayStrength();
}
