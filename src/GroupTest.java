import aitu.Group;
import aitu.Student;
import java.util.Random;

public class GroupTest {
    public static void main(String[] args) {

        Group group = new Group("SE-2530");

        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            Student s = new Student("Ertore", "Omirtayev");
            for (int j = 0; j < 5; j++) {
                double grade = 2.0 + random.nextDouble() * 2.0;
                s.addGrade(grade);
            }
            group.addStudent(s);
        }

        System.out.println(group);

        group.printHallOfFame();

        int idToRemove = 250002;
        System.out.println("Removing student with id " + idToRemove);
        System.out.println("Success: " + group.removeStudent(idToRemove));

        System.out.println("After removal:");
        System.out.println(group);
    }
}
