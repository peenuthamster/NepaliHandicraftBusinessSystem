public class MetalCraft extends Handicraft{
    private double weight;

    public MetalCraft(String craftName, String craftID, double basePrice, double weight) {
        super(craftName, craftID, basePrice);
        this.weight = weight;
    }
    int baseTimeInSecondsMC = 7200;
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("weight = " + weight + "kg\n");
    }

    public double productionTime(double speedFactor){
        return (baseTimeInSecondsMC * weight) / speedFactor;
    }
}
