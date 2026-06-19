import java.util.ArrayList;

public class Gradebook {
    public static void main(String[] args) {
        System.out.println("=== Class Gradebook Summary ===");
        ArrayList<Student> classList = new ArrayList<>();
        classList.add(new Student("Pooja", 101, 95.5));
        classList.add(new Student("Alex", 102, 72.0));
        classList.add(new Student("Sam", 103, 84.0));

        double totalScore = 0;
        for (Student s : classList) {
            s.displayInfo();
        }
        
        System.out.println("Total Students Enrolled: " + classList.size());
    }
}
