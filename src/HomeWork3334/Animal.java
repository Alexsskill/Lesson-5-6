package HomeWork3334;

public class Animal {
    // Поле для имени животного
    private String name;

    // Конструктор для инициализации объекта
    public Animal(String name) {
        this.name = name;
    }

    // Метод, который выводит звук, который издает животное
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    // Геттер для поля name
    public String getName() {
        return name;
    }

    // Сеттер для поля name
    public void setName(String name) {
        this.name = name;
    }
}
