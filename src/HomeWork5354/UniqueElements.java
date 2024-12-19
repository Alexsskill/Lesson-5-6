package HomeWork5354;

import java.util.HashSet;
import java.util.Set;

public class UniqueElements {

    // Метод, который принимает массив чисел и возвращает Set<Integer>
    public static Set<Integer> getUniqueElements(int[] numbers) {
        Set<Integer> uniqueSet = new HashSet<>();

        for (int number : numbers) {
            uniqueSet.add(number); // Добавляем число в множество, дубликаты игнорируются
        }
        return uniqueSet; // Возвращаем множество уникальных элементов
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 4}; // Исходный массив

        Set<Integer> result = getUniqueElements(numbers); // Получение уникальных чисел

        System.out.println("Уникальные элементы: " + result); // Вывод результата
    }
}
