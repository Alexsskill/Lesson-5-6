package HomeWork4950;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapInversion {
    public static void main(String[] args) {
        // Исходная мапа
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "C");
        originalMap.put(2, "B");
        originalMap.put(3, "A");

        // Инвертируем мапу
        HashMap <String, Integer> invertedMap = invertMap(originalMap);

        // Вывод результата
        System.out.println("Исходная мапа: " + originalMap);
        System.out.println("Инвертированная мапа: " + invertedMap);
    }

    public static <K, V> HashMap <V, K> invertMap (HashMap <K, V> originalMap) {
        HashMap<V, K> invertedMap = new LinkedHashMap<>(); // Используем LinkedHashMap для сохранения порядка

        for (HashMap.Entry <K, V> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey()); // Инвертируем ключи и значения
        }

        return invertedMap;
    }
}
