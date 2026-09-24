public class sStudent {
    
    private String studentID;
    private String name;
    private double cgpa;
    private String programme;
    
    public sStudent(String studentID, String name, double cgpa, String programme) {
        this.studentID = studentID;
        this.name = name;
        this.cgpa = cgpa;
        this.programme = programme;
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    
    public String getStudentID() {
        return studentID;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setCGPA(double cgpa) {
        if (cgpa >= 0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Please enter a value between 0 and 4.0");
        }
    }
    
    public double getCGPA() {
        return cgpa;
    }
    
    public void setProgramme(String programme) {
        this.programme = programme;
    }
    
    public String getProgramme() {
        return programme;
    }
    
    public void displayInfo() {
        System.out.println("Student ID : " + studentID);
        System.out.println("Name       : " + name);
        System.out.println("CGPA       : " + cgpa);
        System.out.println("Programme  : " + programme);
    }
}