public class main {
    public static void main(String[] args) {
        
        System.out.println("========== SMART HOME APPLIANCE SYSTEM ==========\n");
        
        // Create different appliances
        Appliance washing = new WashingMachine("LG");
        Appliance fridge = new Refrigerator("Panasonic");
        Appliance ac = new AirConditioner("Daikin");
        Appliance microwave = new Microwave("Samsung");
        Appliance tv = new Television("Sony");
        
        // Use Washing Machine
        System.out.println("--- Washing Machine ---");
        washing.displayBrand();
        washing.turnOn();
        washing.operate();
        washing.turnOff();
        
        System.out.println("\n--- Refrigerator ---");
        fridge.displayBrand();
        fridge.turnOn();
        fridge.operate();
        fridge.turnOff();
        
        System.out.println("\n--- Air Conditioner ---");
        ac.displayBrand();
        ac.turnOn();
        ac.operate();
        ac.turnOff();
        
        System.out.println("\n--- Microwave ---");
        microwave.displayBrand();
        microwave.turnOn();
        microwave.operate();
        microwave.turnOff();
        
        System.out.println("\n--- Television ---");
        tv.displayBrand();
        tv.turnOn();
        tv.operate();
        tv.turnOff();
    }
}