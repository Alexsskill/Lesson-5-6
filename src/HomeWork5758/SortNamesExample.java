package HomeWork5758;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNamesExample {
    public static void main(String[] args) {
        // Создаем список имен
        List<String> names = Arrays.asList("Anna", "Charlie", "Bob", "David", "Eve");

        // 1. Сортировка списка в обратном порядке с использованием анонимного класса
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // Сравниваем в обратном порядке
            }
        });

        System.out.println("Список имен после сортировки (анонимный класс): " + names);

        // 2. Сортировка списка в обратном порядке с использованием лямбда-выражения
        names = Arrays.asList("Anna", "Charlie", "Bob", "David", "Eve"); // Возвращаем изначальный порядок

        names.sort((o1, o2) -> o2.compareTo(o1)); // Используем лямбда-выражение для сортировки

        System.out.println("Список имен после сортировки (лямбда-выражение): " + names);
    }
}
