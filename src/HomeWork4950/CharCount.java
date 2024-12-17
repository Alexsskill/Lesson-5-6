package HomeWork4950;

import java.util.HashMap;

    public class CharCount {
        public static void main(String[] args) {
            String line = "java is fun and java is powerful";

            // Создаем HashMap для хранения символов и их количества
            HashMap<Character, Integer> charCountMap = new HashMap<>();

            // Проходим по каждому символу в строке
            for (char c : line.toCharArray()) {
                // Игнорируем пробелы
                if (c != ' ') {
                    // Увеличиваем счетчик для текущего символа
                    charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
                }
            }

            // Выводим результат
            for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println("Символ: '" + entry.getKey() + "' - Количество: " + entry.getValue());
            }
        }
    }
