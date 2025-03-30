public class TextileCraft extends Handicraft {

    private int threadCount;

    public TextileCraft(String craftName, String craftID, double basePrice, int threadCount) {
        super(craftName, craftID, basePrice);
        this.threadCount = threadCount;
    }
    public int baseTimeInSecondsTC = 3600;

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Thread Count: " + threadCount + "\n");
    }
    public double productionTime(double speedFactor){
        return (baseTimeInSecondsTC * threadCount) / (speedFactor * 100);
    }

}
