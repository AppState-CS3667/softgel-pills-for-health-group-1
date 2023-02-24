package pills;
import pills.GelCap;

public class AcheAway extends GelCap{
    public AcheAway(double strength, String color, double size ) {
        super("AcheAway", strength, size, color);
    }
    
    @Override
    protected void addCasing() {
        casing = "Gelatin";
        System.out.printf("adding %s casing\n", casing);
    }

    @Override
    protected void addSolution() {
        solution = "Saline";
        System.out.printf("adding %s solution\n", casing);
    }

    @Override
    protected void addActive() {
        active = "Acetaminophen";
        System.out.printf("adding %s active\n", casing);
    }
    
}
