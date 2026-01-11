import aitu.Student;
import java.util.Scanner;
import java.util.Random;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter firstname: ");
            String firstname = scanner.nextLine();

            System.out.print("Enter lastname: ");
            String lastname = scanner.nextLine();

            students[i] = new Student(firstname, lastname);

            for (int j = 0; j < 5; j++) {
                double grade = 2.0 + random.nextDouble() * 2.0;
                students[i].addGrade(grade);
            }
        }

        System.out.println("\nID Firstname Lastname Email GPA");
        for (Student s : students) {
            System.out.printf(
                "%d %s %s %s %.2f%n",
                s.getId(),
                s.getFirstname(),
                s.getLastname(),
                s.getEmail(),
                s.getGpa()
            );
        }

        scanner.close();
    }
}
