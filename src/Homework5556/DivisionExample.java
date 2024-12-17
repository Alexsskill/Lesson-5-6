package Homework5556;

public class DivisionExample {

    // Метод для деления двух чисел
    public static double divide(int numerator, int denominator) {
        return numerator / denominator; // Возможное место для исключения
    }

    public static void main(String[] args) {
        // Пример 1: Перехват исключения в методе
        try {
            System.out.println("Результат: " + divide(10, 0)); // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Невозможно делить на ноль."); // Обработка исключения
        }

        // Пример 2: Перехват исключения в месте вызова
        double result;
        try {
            result = divide(10, 0);
            System.out.println("Результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Невозможно делить на ноль.");
        }
    }
}
