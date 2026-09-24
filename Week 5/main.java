public class main {
    public static void main(String[] args) {
        
        // Create a new Student object
        sStudent student1 = new sStudent("CU12345", "Ali", 3.75, "BIT");
        
        // Display student information
        System.out.println("=== Student Information ===");
        student1.displayInfo();
        
        System.out.println("\n=== Testing Getters ===");
        System.out.println("Student ID: " + student1.getStudentID());
        System.out.println("Name: " + student1.getName());
        System.out.println("CGPA: " + student1.getCGPA());
        System.out.println("Programme: " + student1.getProgramme());
        
        System.out.println("\n=== Testing Setters ===");
        student1.setName("Ali Ahmed");
        student1.setCGPA(3.85);
        student1.setProgramme("Information Technology");
        
        System.out.println("\n=== Updated Student Information ===");
        student1.displayInfo();
        
        System.out.println("\n=== Testing Validation ===");
        student1.setCGPA(5.0);
        System.out.println("Current CGPA: " + student1.getCGPA());
    }
}