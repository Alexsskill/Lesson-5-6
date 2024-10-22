package HW1112;

import java.util.Scanner;
public class HomeWork1112 {
    public static void main(String[] args) {
        // Part 1
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст человека : ");
        int age = sc.nextInt();
        if (age >= 2 && age < 6 ) {
            System.out.println("Ребёнок должен ходить в детский сад");
        }else if (age >= 6 && age < 18) {
            System.out.println("Подросток должен ходить в школу");
        }else if (age >= 18 && age < 24) {
            System.out.println("Человек должен учиться в университете");
        }else if (age >= 24) {
            System.out.println("Шуруй на работу негр");
        }*/

        // Part 2
        /*double D = 66660;
        double A = 77770;
        double M = 88880;
        double D1 = ((D/100)*15) + D;
        double A1 = ((A/100)*15) + A;
        double M1 = ((M/100)*15) + M;
        double differenceD = (D1*12) - (D*12);
        double differenceA = (A1*12) - (A*12);
        double differenceM = (M1*12) - (M*12);
        System.out.println(" Диана теперь получает " + D1 + " Годовой доход вырос на " + differenceD);
        System.out.println(" Андрей теперь получает " + A1 + " Годовой доход вырос на " + differenceA);
        System.out.println(" Мария теперь получает " + M1 + " Годовой доход вырос на " + differenceM);*/

        // Part 3
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите номер месяца : ");
        int monthNumber = sc1.nextInt();
        switch ( monthNumber ) {
            case 12,1,2  -> System.out.println("Это зима");
            case 3,4,5 -> System.out.println("Это весна");
            case 6,7,8 -> System.out.println("Это лето");
            case 9,10,11 -> System.out.println("Это осень");
            }
        }
    }

