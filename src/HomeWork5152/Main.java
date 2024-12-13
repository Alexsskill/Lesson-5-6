package HomeWork5152;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        CustomMutableClass mutableObject = new CustomMutableClass(10);
        ImmutableClass immutableObject = new ImmutableClass("Test", List.of(1, 2, 3), mutableObject);

        // Попытка изменить изменяемый объект
        mutableObject.setValue(20);
        System.out.println("Значение поля Value изменяемого класса: " + mutableObject.getValue()); // 20
        System.out.println("Значение поля Value неизменяемого класса " + immutableObject.getMutableObject()
                .getValue()); // 10

        // Добавление в Map
        Map<ImmutableClass, String> map = new HashMap<>();
        map.put(immutableObject, "Неизменяемый экземпляр");

        System.out.println(map); // Неизменяемый ключ в Map

        System.out.println("\n********************************* NEXT TASK *********************************\n");

        // Пример использования Box с разными типами данных

        // Box для строк
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, World!");
        System.out.println(" String в контейнере: " + stringBox.get());
        System.out.println(" Пуст ли контейнер String: " + stringBox.isEmpty());
        stringBox.clear();
        System.out.println(" Пуст ли контейнер String после очистки: " + stringBox.isEmpty());

        // Box для целых чисел
        Box<Integer> integerBox = new Box<>();
        integerBox.set(100);
        System.out.println(" Integer в контейнере: " + integerBox.get());
        System.out.println(" Пуст ли контейнер Integer: " + integerBox.isEmpty());
        integerBox.clear();
        System.out.println(" Пуст ли контейнер Integer после очистки: " + integerBox.isEmpty());
    }
}
