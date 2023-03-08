package lesson_1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
//        maxAndMinItemOfArray();
//        determinesIfLeapYear();
        sortArray();
    }

    private static void sortArray() {
        int[] ArrayOfNumbers = {0, 0, -2, -2, 21, 0, -43, 8};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value -> ");

        int value = in.nextInt();
        int i = 0, j = ArrayOfNumbers.length - 1, bubble = 0;
        boolean flag = true;

        for (i = 0; i < j; i++) {
            if (ArrayOfNumbers[i] == value) {
                flag = true;
                for (; j > i && flag; j--) {
                    if (ArrayOfNumbers[j] != value) {
                        bubble = ArrayOfNumbers[i];
                        ArrayOfNumbers[i] = ArrayOfNumbers[j];
                        ArrayOfNumbers[j] = bubble;
                        flag = false;
                    }
                }
            }
        }
        for (int num: ArrayOfNumbers) {
            System.out.printf("%d ", num);
        }
    }

    private static void determinesIfLeapYear() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a year -> ");
        int year = in.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("%d - leap year", year);
        } else {
            System.out.printf("%d - non-leap year", year);
        }
    }

    private static void maxAndMinItemOfArray() {
        int[] ArrayOfNumbers = {14, -2, 21, 0, -43, 8};
        int maxNumber = ArrayOfNumbers[0];
        int minNumber = ArrayOfNumbers[0];
        for (int item: ArrayOfNumbers) {
            if (item > maxNumber) {
                maxNumber = item;
            } else if (item < minNumber) {
                minNumber = item;
            }
        }
        System.out.printf("Max number of array is %d.\n", maxNumber);
        System.out.printf("Min number of array is %d.", minNumber);
    }
}
