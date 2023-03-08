package lesson_2;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        Random random = new Random();
//        for (int i = 0; i < 1000; i++) {
//            sb.append(random.nextInt(10000));
//        }
//        System.out.println(sb);
//        Дано четное число N (>0) и символы c1 и c2.\
//        Написать метод, который вернет строку длины N,
//        которая состоит из чередующихся символов c1 и c2,
//        начиная с c1.
//        task2();
        task1();
    }

//    private static void task2() {
//        Scanner in = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//        System.out.print("Enter a string -> ");
//        String str = in.next();
//        char[] chars = str.toCharArray();
//        char ch = chars[0];
////        char c = str.charAt(2);
//        int count = 1;
//        for (int i = 1; i < str.length(); i++) {
//            if(chars[i] == ch && i < str.length() - 1) {
//                count++;
//            } else {
//                if (count == 1) {
//                    sb.append(String.format("%c", ch));
//                } else {
//                    sb.append(String.format("%c%d", ch, count));
//                }
//                count = 1;
//                ch = chars[i];
//            }
//            if (i == str.length() - 1) {
//                if (count == 1) {
//                    sb.append(String.format("%c", ch));
//                } else {
//                    sb.append(String.format("%c%d", ch, count));
//                }
//            }
//        }
//        System.out.println(sb);
//    }

    private static void task1() {
        StringBuilder sb = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int N = in.nextInt();
        System.out.print("Enter a two char -> ");
        String c1 = in.next();
        System.out.print("-> ");
        String c2 = in.next();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        System.out.println(sb);
    }
}
