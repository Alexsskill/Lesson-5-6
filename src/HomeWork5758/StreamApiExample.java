package HomeWork5758;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");

        // Применяем Stream API для преобразования, фильтрации и сортировки
        List<String> result = words.stream()
                .map(String::toUpperCase)          // Преобразуем в верхний регистр
                .filter(word -> word.length() > 4) // Фильтруем строки длиной больше 4 символов
                .sorted((w1, w2) -> Integer.compare(w1.length(), w2.length())) // Сортируем по длине
                .collect(Collectors.toList());      // Собираем в новый список

        // Выводим результат
        System.out.println("Результат: " + result);
    }
}
