package Week08;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = new Student(1, "John", 3.5);
        System.out.println("Student created: " + s1.getName());

        try {
            new Student(0, "Alice", 3.2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            new Student(2, "Al1ce", 3.2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            new Student(3, "Bob", 5.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

