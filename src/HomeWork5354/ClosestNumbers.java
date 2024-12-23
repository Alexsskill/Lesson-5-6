package HomeWork5354;

import java.util.Arrays;
import java.util.TreeSet;

public class ClosestNumbers {

    // Метод, который принимает массив чисел и число-цель, возвращая массив из двух чисел
    public static int[] findClosestNumbers(int[] numbers, int target) {
        TreeSet<Integer> sortedSet = new TreeSet<>();

        for (int number : numbers) {
            sortedSet.add(number); // Добавляем числа в TreeSet для автоматической сортировки
        }

        Integer lower = sortedSet.lower(target); // Находим ближайшее меньшее значение
        Integer higher = sortedSet.higher(target); // Находим ближайшее большее значение
        return new int[]{lower != null ? lower : -1, higher != null ? higher : -1}; // Возвращаем результат
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Исходный массив
        int target = 35; // Целевая величина

        int[] result = findClosestNumbers(numbers, target); // Получение ближайших чисел

        System.out.println("Ближайшие числа: " + Arrays.toString(result)); // Вывод результата
    }
}
