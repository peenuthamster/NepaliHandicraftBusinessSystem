public class Handicraft {
    private String craftName;
    private String craftID;
    private double basePrice;

    public Handicraft(String craftName, String craftID, double basePrice) {
        this.craftName = craftName;
        this.craftID = craftID;
        this.basePrice = basePrice;
    }

    public void displayDetails(){
        System.out.println(this.toString());
    }

    public void displayDetails(boolean isAvailable){
        System.out.println("Available: " + isAvailable);
    }

    public double calculateExportPrice(double taxRate){
        return basePrice + (basePrice * taxRate)/100;
    }

    @Override
    public String toString() {
        return "Craft Name: " + craftName + "\nCraft ID: " + craftID + "\nBase Price: Rs." + basePrice;
    }

    public String getCraftName() {
        return craftName;
    }
}
