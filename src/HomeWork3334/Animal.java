package HomeWork3334;

abstract class Animal {
    // Поле для имени животного
    private String name;

    // Конструктор для инициализации объекта
    public Animal(String name) {
        this.name = name;
    }

    // Абстрактный метод makeSound
    public abstract void makeSound();

    // Абстрактный метод move
    public abstract void move();

    // Геттер для поля name
    public String getName() {
        return name;
    }

    // Сеттер для поля name
    public void setName(String name) {
        this.name = name;
    }
}
