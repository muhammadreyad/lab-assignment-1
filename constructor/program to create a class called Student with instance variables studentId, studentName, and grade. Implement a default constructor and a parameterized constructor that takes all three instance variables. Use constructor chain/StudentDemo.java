class Student {
    int studentId;
    String studentName;
    String grade;

    // 1. Default constructor
    public Student() {
        // 3. Constructor Chaining: Calls the parameterized constructor
        //    with default values. This must be the first line.
        this(0, "Unknown", "N/A");
    }

    // 2. Parameterized constructor
    public Student(int studentId, String studentName, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
}

public class Main {
    public static void main(String[] args) {
        // This object is created using the default constructor,
        // which chains to the parameterized one.
        Student student1 = new Student();

        System.out.println("--- Default Student (via Chaining) ---");
        System.out.println("Student ID: " + student1.studentId);
        System.out.println("Student Name: " + student1.studentName);
        System.out.println("Student Grade: " + student1.grade);

        // This object is created using the parameterized constructor directly.
        Student student2 = new Student(101, "Alice", "A+");

        System.out.println("\n--- Parameterized Student ---");
        System.out.println("Student ID: " + student2.studentId);
        System.out.println("Student Name: " + student2.studentName);
        System.out.println("Student Grade: " + student2.grade);
    }
}