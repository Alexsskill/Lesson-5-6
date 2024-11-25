package Homework4344;

import java.util.*;

public class ArrayLinkedList {
    // Метод для добавления элементов в arrayList
    public static void addElementsArraylist(List<Integer> arrayList) {
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }
    }

    // Метод для добавления элементов в linkedList
    public static void addElementsLinkedList(List<Integer> linkedList) {
        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }
    }

    // Метод для случайного доступа к элементам списка
    public static void randomAccess(List<Integer> list) {
        Random r = new Random();
        for (int i = 0; i < 100_000; i++) {
            int index = r.nextInt(1_000_000); // Генерируем случайный индекс в интервале от 0 до 1_000_000
            list.get(index); // Получаем доступ к элементу по индексу
        }
    }


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Объявление переменных старт тайм и энд тайм
        long startTime, endTime;

        // Заполняем ArrayList и считаем затраченное время
        startTime = System.nanoTime(); //System.nanoTime() — метод, который возвращает текущее время в наносекундах.
        addElementsArraylist(arrayList);
        endTime = System.nanoTime();
        System.out.println("Время заполнения ArrayList: " + ((endTime - startTime) / 1_000_000) + " мс");

        // Заполняем LinkedList и считаем затраченное время
        startTime = System.nanoTime(); //System.nanoTime() — метод, который возвращает текущее время в наносекундах.
        addElementsLinkedList(linkedList);
        endTime = System.nanoTime();
        System.out.println("Время заполнения LinkedList: " + ((endTime - startTime) / 1_000_000) + " мс");

        // Проверяем производительность для ArrayList
        startTime = System.nanoTime();
        randomAccess(arrayList);
        endTime = System.nanoTime();
        System.out.println("Время доступа к элементам ArrayList: " + ((endTime - startTime) / 1_000_000) + " мс");

        // Проверяем производительность для LinkedList
        startTime = System.nanoTime();
        randomAccess(linkedList);
        endTime = System.nanoTime();
        System.out.println("Время доступа к элементам LinkedList: " + ((endTime - startTime) / 1_000_000) + " мс");
        System.out.println("*****************************************");
        main2();
    }

    public static void main2() {
        //Создаем пустой список студентов students
        List<String> students = new ArrayList<>();

        //Добавление начального списка студентов
        students.add("Александр");
        students.add("Денис");
        students.add("Богдан");
        students.add("Алексей");
        students.add("Наталья");

        // Добавление дополнительных студентов с помощью addAll()
        List<String> newStudents = Arrays.asList("Николай", "Дмитрий", "Сергей");
        students.addAll(newStudents);

        // Выводим текущий список студентов
        System.out.println("Список студентов: " + students);

        //Удаляем студента по имени
        students.remove("Богдан");
        System.out.println("После удаления Богдана: " + students);

        //Удаляем студента по индексу (например, по индексу 0)
        if (students.size() > 0) {
            students.remove(0);
            System.out.println("После удаления студента с индексом 0: " + students);
        }

        //Проверяем, содержится ли определенное имя в списке
        String checkName = "Александр";
        if (students.contains(checkName)) {
            System.out.println(checkName + " есть в списке студентов.");
        } else {
            System.out.println(checkName + " нет в списке студентов.");
        }

        //Проверяем, содержатся ли все имена в новом списке
        List<String> checkNames = Arrays.asList("Денис", "Николай","Алексей","Наталья",
                "Дмитрий", "Сергей");
        if (students.containsAll(checkNames)) {
            System.out.println("Все имена из нового списка есть в списке студентов.");
        } else {
            System.out.println("Не все имена из нового списка присутствуют в списке студентов.");
        }

        //Получение размера и проверка на пустоту
        //Определяем количество студентов
        System.out.println("Количество студентов: " + students.size());

        //Проверяем, пустой ли список студентов
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
        } else {
            System.out.println("Список студентов не пуст.");
        }

        //Очистка списка
        //Удаляем всех студентов
        students.clear();

        //Проверяем, стал ли список пустым
        if (students.isEmpty()) {
            System.out.println("Список студентов успешно очищен и теперь пуст");
        } else {
            System.out.println("Список студентов не был очищен.");
        }
    }
}
