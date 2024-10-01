package HomeWork1314;

import java.util.Scanner;

public class HomeWork1314 {
    public static void main(String[] args) {
        // Part 1 Вывод всех нечётных чисел от 1 до заданного числа n
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(" " + i);
            }
        }
        task1();
        task2();
    }

    // Part 2 Произведение чисел от 1 до m
    public static void task1() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите число m : ");
        int m = sc1.nextInt();
        int x = 1;

        for (int i = 1; i <= m; i++) {
            x *= i;
        }
        System.out.println(x);
    }

    // Part 3 Таблица умножения от 1 до 10
    public static void task2() {
        System.out.println("Таблица умножения : ");
        int q;
        for (int i = 1; i <= 10; i++) {
            System.out.println(" ");
            for (int j = 1; j <= 10; j++) {
                q = j * i;
                System.out.print(" " + q);
            }
        }
    }
}



