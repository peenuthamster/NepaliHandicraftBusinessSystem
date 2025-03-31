public class StoneCraft extends Handicraft{
        private String stoneType;

        public StoneCraft(String craftName, String craftID, double basePrice, String stoneType) {
            super(craftName, craftID, basePrice);
            this.stoneType = stoneType;
        }

        @Override
        public void displayDetails() {
            super.displayDetails();
            System.out.println("Stone Type: " + stoneType);
        }
}

