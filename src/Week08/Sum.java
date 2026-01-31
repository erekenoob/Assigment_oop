package Week08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter first integer: ");
                a = scanner.nextInt();

                System.out.print("Enter second integer: ");
                b = scanner.nextInt();

                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.nextLine();
            }
        }

        System.out.println("Sum = " + (a + b));
        scanner.close();
    }
}

