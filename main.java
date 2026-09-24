public class main {
    public static void main(String[] args) {
        
        System.out.println("========== REGULAR EMPLOYEE ==========");
        employee emp1 = new employee("E001", "John");
        emp1.displayInfo();
        
        System.out.println("\n========== LECTURER (Inherits from Employee) ==========");
        lecturer lec1 = new lecturer("L100", "Dr Ahmad", "Java Programming", "Faculty of Information Technology");
        lec1.displayInfo();
        
        System.out.println("\n========== TESTING GETTERS ==========");
        System.out.println("Lecturer ID: " + lec1.getID());
        System.out.println("Lecturer Name: " + lec1.getName());
        System.out.println("Lecturer Subject: " + lec1.getSubject());
        System.out.println("Lecturer Department: " + lec1.getDepartment());
        
        System.out.println("\n========== TESTING SETTERS ==========");
        lec1.setName("Dr Ahmad Ali");
        lec1.setSubject("Advanced Java");
        lec1.setDepartment("Faculty of Computer Science");
        
        System.out.println("\n========== UPDATED LECTURER INFO ==========");
        lec1.displayInfo();
        
        System.out.println("\n========== CREATING ANOTHER LECTURER ==========");
        lecturer lec2 = new lecturer("L101", "Dr Sarah", "Python Programming", "Faculty of Information Technology");
        lec2.displayInfo();
        
        System.out.println("\n========== INHERITANCE BENEFIT ==========");
        System.out.println("Notice how Lecturer inherited getID() and getName() from Employee!");
        System.out.println("Lecturer 1 ID: " + lec1.getID() + " (from Employee class)");
        System.out.println("Lecturer 2 Subject: " + lec2.getSubject() + " (from Lecturer class)");
    }
}