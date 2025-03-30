public class WoodenCraft extends Handicraft {
    private String woodType;

    public WoodenCraft(String craftName, String craftID, double basePrice, String woodType) {
        super(craftName, craftID, basePrice);
        this.woodType = woodType;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Wood Type: " + woodType + "\n");
    }

}
