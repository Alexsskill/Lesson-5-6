package HomeWork5354;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderedUniqueElements {

    // Метод, который принимает массив строк и возвращает Set<String>
    public static Set<String> getOrderedUniqueElements(String[] words) {
        Set<String> uniqueSet = new LinkedHashSet<>();

        for (String word : words) {
            uniqueSet.add(word); // Добавляем слово в множество, дубликаты игнорируются
        }
        return uniqueSet; // Возвращаем множество уникальных элементов в порядке их появления
    }

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana"}; // Исходный массив

        Set<String> result = getOrderedUniqueElements(words); // Получение уникальных строк с сохранением порядка

        System.out.println("Уникальные элементы с сохранением порядка: " + result); // Вывод результата
    }
}
