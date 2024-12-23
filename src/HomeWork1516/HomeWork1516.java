package HomeWork1516;

import java.util.Scanner;

public class HomeWork1516 {
    public static void main(String[] args) {
        // Part 1. Подсчитать количество букв и цифр в строке. Отдельно цифры от 0 до 4 и от 5 до 9.
        // Посчитать отдельно большие и маленькие буквы.

        String text = "123aSd456F";
        int l = 0; // Это общее количество букв
        int d = 0; // Это общее количество цифр

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                l += 1;
            } else if (Character.isDigit(text.charAt(i))) {
                d += 1;
            }
        }

        int l1 = 0; // Переменная для подсчета БОЛЬШИХ букв
        int l2 = 0; // Переменная для подсчета маленьких букв
        int d1 = 0; // Переменная для подсчета цифр от 0 до 4 и от 5 до 9
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                if (text.charAt(i) > '0' && (text.charAt(i) < '4') ) {
                    d1 += 1;
                }
                if (text.charAt(i) > '5' && (text.charAt(i) < '9') ) {
                    d1 += 1;
                }
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isUpperCase(text.charAt(i))) {
                    l1 += 1;
                }
            }
        }
            for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isLowerCase(text.charAt(i)))
                    l2 += 1;
            }
        }

        System.out.println("Общее количество букв: " + l);
        System.out.println("Общее количество цифр: " + d);

        System.out.println("Количество цифр в диапазоне от 0 до 4 и от 5 до 9 равно : " + d1);
        System.out.println("Количество больших букв: " + l1);
        System.out.println("Количество маленьких букв: " + l2);
        task1();
        task2();
    }

    public static void task1() {
        // Part 2

        String text = "I like Java!!!";

        System.out.println(text.charAt(13)); // Распечатываем последний символ строки по индексу

        boolean q = (text.endsWith("!!!")); // Проверяем, заканчивается ли наша строка на !!!
        System.out.println(q);

        boolean w = (text.startsWith("I like"));// Проверяем, начинается ли наша строка на I like
        System.out.println(w);

        boolean e = (text.contains("Java")); // Проверяем содержит ли строка, - подстроку "Java"
        System.out.println(e);

        int index1 = text.indexOf("Java"); // Ищем позицию подстроки "Java"
        System.out.println(index1);

        String text1 = text.replace("a", "o"); // Заменяем все символы "а" на "о"
        System.out.println(text1);

        System.out.println(text.toUpperCase()); // Преобразуем строку к верхнему регистру

        System.out.println(text.toLowerCase()); // Преобразуем строку к нижнему регистру
    }

    public static void task2() {
        // Part 3

        String text = "qwerty";
        int middleIndex = text.length() / 2;

        String substring = text.substring(middleIndex -1, middleIndex + 1);
        System.out.println(substring);
    }
}
