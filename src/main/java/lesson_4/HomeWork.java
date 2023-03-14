package lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        task1();
        task2();
        }

    private static void task1() {
        // Реализовать консольное приложение, которое:
        // Принимает от пользователя и “запоминает” строки.
        // Если введено print, выводит строки так,
        // чтобы последняя введенная была первой в списке, а первая - последней.
        // Если введено revert, удаляет предыдущую введенную строку из памяти.
        System.out.println(">> Task 1:");
        Scanner inp = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList();
        String inputString = "";
        boolean flag = true;
        int indexOfLastElement = 0;
        while (flag) {
            System.out.print("Enter a string: ");
            inputString = inp.nextLine();
            if (Objects.equals(inputString, "print")) {
                if (listOfStrings.get(0) != null) {
                    for (int i = 0; i < listOfStrings.size(); i++) {
                        if (i == 0) {
                            System.out.println(listOfStrings.get(listOfStrings.size() - 1));
                        } else if (i == listOfStrings.size() - 1) {
                            System.out.println(listOfStrings.get(0));
                        } else {
                            System.out.println(listOfStrings.get(i));
                        }
                    }
                } else {
                    System.out.println(">>> List is empty! <<<");
                }
            } else if (Objects.equals(inputString, "revert")) {
                indexOfLastElement = listOfStrings.size() - 1;
                System.out.printf(">> String <%s> is removed!", listOfStrings.get(indexOfLastElement));
                listOfStrings.remove(indexOfLastElement);
            } else if (Objects.equals(inputString, "exit")){
                flag = false;
            } else {
                listOfStrings.add(inputString);
                System.out.println(">> String is added!");
            }
        }

    }

    private static void task2() {
        // Пусть дан LinkedList с несколькими элементами.
        // Реализуйте метод, который вернет “перевернутый” список.
        System.out.println(">> Task 2:");
        LinkedList<Integer> listOfInt = new LinkedList();
        for (int i = 0; i < 10; i++) {
            listOfInt.add(i);
        }
        System.out.println(listOfInt);
        reversList(listOfInt);
        System.out.println(listOfInt);
    }

    private static void reversList(LinkedList<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            int num = list.get(i);
            list.add(i, list.get(j));
            list.remove(i + 1);
            list.add(j, num);
            list.remove(j + 1);
        }
    }
}
