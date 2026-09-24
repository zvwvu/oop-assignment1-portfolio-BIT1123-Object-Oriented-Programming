
public class student {
    private String name;
    private int age;
    private double gpa ;

    public student ( String studentName,int studentAge, double studentGba){
            name = studentName;
            age = studentAge;
            gpa = studentGba;
    }
    public void displayInfo(){
        System.out.println("Name "+ name );
        System.out.println("Age" + age);
        System.out.println("Gba"+ gpa);
    }
        
    public void study (){
        System.out.println(name + "is studying.");

    }
    public void takeExam(){
        System.out.println(name + "is takeing an exam");
    }
}