public class Main {

    public static void main(String[] args) {
        Person p0 = new Person("Generic", "P000");
        Person p1 = new Student("Ali", "S001");
        Person p2 = new Lecturer("Dr. Aisha", "L001");

        p0.introduce();
        p1.introduce();
        p2.introduce();
    }
}