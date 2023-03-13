package lesson_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        // Пусть дан произвольный список целых чисел,
        // удалить из него четные числа
        // (в языке уже есть что-то готовое для этого). >НЕ НАШЁЛ<
        System.out.println(">>> TASK 1:");
        Random rnd = new Random();
        ArrayList<Integer> intNumbers = new ArrayList();
        // Заполнение массива сл. целыми числами.
        for (int i = 0; i < 30; i++) {
            intNumbers.add(i, rnd.nextInt(100));
        }
        System.out.println(intNumbers);
        // Удаление из полученного массива всех чётных чисел.
        for (int i = 0; i < intNumbers.size(); i++) {
            if (intNumbers.get(i) % 2 == 0) {
                intNumbers.remove(i);
                i--;
            }
        }
        System.out.println(intNumbers);
    }

    private static void task2() {
        // Задан целочисленный список ArrayList.
        // Найти минимальное, максимальное и среднее арифметическое
        // из этогос писка.
        System.out.println(">>> TASK 2:");
        Random rnd = new Random();
        ArrayList<Integer> intNumbers = new ArrayList();
        // Заполнение массива сл. целыми числами.
        for (int i = 0; i < 30; i++) {
            intNumbers.add(i, rnd.nextInt(100));
        }
        System.out.println(intNumbers);
        System.out.println(Collections.max(intNumbers));
        System.out.println(Collections.min(intNumbers));
        System.out.println(average(intNumbers));
    }

    private static double average (ArrayList<Integer> list) {
        double sum = 0;
        for(int i = 0;i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    private static void task3() {
        // Создать список типа ArrayList<String>.
        // Поместить в него как строки, так и целые числа.
        // Пройти по списку, найти и удалить целые числа.
        System.out.println(">>> TASK 3:");
        ArrayList<String> stringsAndIntegers = new ArrayList();
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a string -> ");
            stringsAndIntegers.add(inp.nextLine());
        }
        System.out.println(stringsAndIntegers);
        int flag, n = 0;
        for (int i = 0; i < stringsAndIntegers.size(); i++) {
            flag = 0;
            try {
                n = Integer.parseInt(stringsAndIntegers.get(i));
            } catch (NumberFormatException e) {
                flag = 1;
            }
            if (flag == 0) {
                stringsAndIntegers.remove(i);
            }
        }
        System.out.println(stringsAndIntegers);
    }
}
