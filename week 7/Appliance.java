public abstract class Appliance {
    
    protected String brand;
    
    public Appliance(String brand) {
        this.brand = brand;
    }
    
    public void displayBrand() {
        System.out.println("Brand : " + brand);
    }
    
    public void turnOn() {
        System.out.println("Power ON");
    }
    
    public void turnOff() {
        System.out.println("Power OFF");
    }
    
    // Abstract method - must be implemented by child classes
    public abstract void operate();
}