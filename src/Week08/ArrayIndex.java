package Week08;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000); // 0–999
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter index: ");

        try {
            int index = scanner.nextInt();
            System.out.println("Value: " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}
