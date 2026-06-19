public class Student {
    private String name;
    private int id;
    private double grade;
    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("--------------------");
    }
   The main execution method
    public static void main(String[] args) {
        System.out.println("=== Running Student Portfolio Code ===");
        Student student1 = new Student("Pooja", 101, 95.5);
        student1.displayInfo();
    }
}
