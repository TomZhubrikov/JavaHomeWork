package lesson_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        // Task1:
        System.out.println(DeterminesPolynomial());

        // Task2:
        CreateString();
        writerInTxt(CreateString());
    }

    private static boolean DeterminesPolynomial() {
//        Напишите метод, который принимает на вход строку (String)
//        и определяет является ли строка палиндромом (возвращает boolean значение).\
        System.out.print(">>> Run task #1!");
        boolean result = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string -> ");
        String inputString = in.nextLine();
        int i, j;
        for (i = 0, j = inputString.length() - 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputString.charAt(j)) {
                j--;
            } else {
                result = false;
                i = inputString.length();
            }
        }
        return result;
    }

    private static StringBuilder CreateString() {
//        Напишите метод, который составит строку,
//        состоящую из 100 повторений слова TEST и метод,
//        который запишет эту строку в простой текстовый файл,
//        обработайте исключения.
        StringBuilder CreatedStr = new StringBuilder();
        int i = 0;
        while (i < 100) {
            CreatedStr.append("TEST");
            i++;
        }
        return CreatedStr;
    }

    private static void writerInTxt(StringBuilder inputString) {
        try (PrintWriter pw = new PrintWriter("src/main/resources/lesson2.txt")) {
            pw.print(inputString);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(">>> File isn't opened!");
        }
    }
}
