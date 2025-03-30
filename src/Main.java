import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TextileCraft> textileCrafts = new ArrayList<>();
        ArrayList<MetalCraft> metalCrafts = new ArrayList<>();
        ArrayList<WoodenCraft> woodenCrafts = new ArrayList<>();

        textileCrafts.add(new TextileCraft("Dhaka Topi", "T001", 500.0, 200));
        textileCrafts.add(new TextileCraft("Pashmina Shawl", "T002", 3500.0, 300));
        textileCrafts.add(new TextileCraft("Woolen Sweater", "T003", 2500.0, 250));

        metalCrafts.add(new MetalCraft("Khukuri", "M001", 1500.0, 0.5));
        metalCrafts.add(new MetalCraft("Copper Vase", "M002", 4000.0, 2.0));
        metalCrafts.add(new MetalCraft("Brass Buddha Statue", "M003", 8000.0, 3.5));

        woodenCrafts.add(new WoodenCraft("Madush (Wooden Drum)", "W001", 2000.0, "Sal"));
        woodenCrafts.add(new WoodenCraft("Hand-carved Mask", "W002", 3000.0, "Sisau"));
        woodenCrafts.add(new WoodenCraft("Wooden Elephant", "W003", 4500.0, "Teak"));

        System.out.println("=== All Handicraft Details ===\n");
        for (TextileCraft textileCraft : textileCrafts) {
            textileCraft.displayDetails();
        }
        for (MetalCraft metalCraft : metalCrafts){
            metalCraft.displayDetails();
        }
        for (WoodenCraft woodenCraft : woodenCrafts) {
            woodenCraft.displayDetails();
        }

        System.out.println("\n=== Availability Check ===");
        System.out.println("\n=== Textile Crafts ===");
        for (TextileCraft craft : textileCrafts) {
            System.out.println(craft.getCraftName());
            craft.displayDetails(true);
        }
        System.out.println("\n=== Metal Crafts ===");
        for (MetalCraft craft : metalCrafts) {
            System.out.println(craft.getCraftName());
            craft.displayDetails(false);
        }
        System.out.println("\n=== Wooden Crafts ===");
        for (WoodenCraft craft : woodenCrafts) {
            System.out.println(craft.getCraftName());
            craft.displayDetails(true);
        }

        System.out.println("\n=== Export Prices (10% tax) ===");
        for (TextileCraft textileCraft : textileCrafts) {
            System.out.println(textileCraft.getCraftName() + " Export Price: Rs." + textileCraft.calculateExportPrice(10));
        }
        for (MetalCraft metalCraft : metalCrafts) {
            System.out.println(metalCraft.getCraftName() + " Export Price: Rs." + metalCraft.calculateExportPrice(10));
        }
        for (WoodenCraft woodenCraft : woodenCrafts) {
            System.out.println(woodenCraft.getCraftName() + " Export Price: Rs." + woodenCraft.calculateExportPrice(10));
        }


        System.out.println("\n=== Production Times ===");
        double speedFactorTC = 1.5;
        double speedFactorMC = 1.1;
        for (TextileCraft textileCraft : textileCrafts) {
            System.out.println("TextileCraft (" + textileCraft.getCraftName() + ") Production Time: " +
                    textileCraft.productionTime(speedFactorTC)/60 + " minutes");
        }
        for (MetalCraft metalCraft : metalCrafts) {
            System.out.println("MetalCraft (" + metalCraft.getCraftName() + ") Production Time: " + String.format("%.2f", metalCraft.productionTime(speedFactorMC)/60) + " minutes");
        }
    }

}
