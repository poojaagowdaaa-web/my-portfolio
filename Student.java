public class Student {
    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }


    public String checkPassStatus() {
        if (this.grade >= 60.0) {
            return "Passed";
        } else {
            return "Failed";
        }
    }

    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + checkPassStatus());
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== Running Student Portfolio Code ===");
        Student student1 = new Student("Pooja", 101, 95.5);
        Student student2 = new Student("Alex", 102, 45.0);
        
        student1.displayInfo();
        student2.displayInfo();
    }
}
