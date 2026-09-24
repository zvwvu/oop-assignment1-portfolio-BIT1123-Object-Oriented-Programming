public class lecturer extends employee {
    
    private String subject;
    private String department;
    
    public lecturer(String id, String name, String subject, String department) {
        super(id, name);
        this.subject = subject;
        this.department = department;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getDepartment() {
        return department;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject     : " + subject);
        System.out.println("Department  : " + department);
    }
    
    public void displaySubject() {
        System.out.println("Subject : " + subject);
    }
}