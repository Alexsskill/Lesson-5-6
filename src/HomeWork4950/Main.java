package HomeWork4950;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список людей
        List<Person> people = new ArrayList<>();

        // Добавляем несколько объектов в ArrayList
        people.add(new Person("Данил", 30));
        people.add(new Person("Георгий", 25));
        people.add(new Person("Борис", 35));
        people.add(new Person("Александр", 20));

        System.out.println("Список до сортировки по имени:");
        printList(people);

        // Сортировка по имени
        Collections.sort(people, new NameComparator());
        System.out.println("Список после сортировки по имени:");
        printList(people);

        // Сортировка по возрасту
        Collections.sort(people, new AgeComparator());
        System.out.println("Список после сортировки по возрасту:");
        printList(people);
    }

    private static void printList(List<Person> people) {
        for (Person P : people) {
            System.out.println(P);
        }
    }
}
