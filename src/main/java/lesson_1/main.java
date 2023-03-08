package lesson_1;

import java.io.PrintStream;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // inputNameAndPrint();
        inputMaxCountUnits();
    }

    private static void inputMaxCountUnits() {
        int[] arr = {1, 0, 1, 1, 1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || i == arr.length - 1) {
                if (count > maxCount) maxCount = count;
                count = 0;
            }
            count++;
        }
    }

    private static void inputNameAndPrint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name -> ");
        String name = scanner.next();
        System.out.printf("Hi, %s! How old are you?", name);
        Integer age = scanner.nextInt();
        System.out.printf("%d, is good!", age);
    }
}