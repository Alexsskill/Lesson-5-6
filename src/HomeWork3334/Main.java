package HomeWork3334;

public class Main {
    public static void main(String[] args) {

        // Создаем массив животных
        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Шарик");
        animals[1] = new Cat("Мурка");
        animals[2] = new Bird("Попугай", true);
        animals[3] = new Dog("Бобик");
        animals[4] = new Cat("Киса");

        // Перебираем массив, проверяем, реализует ли интерфейс Pet и вызываем методы play и beFriendly
        for (Animal animal : animals) {
            if (animal instanceof Pet) { // Проверяем, является ли animal домашним животным
                ((Pet)animal).play(); // Приводим к типу Pet и вызываем метод play()
                ((Pet)animal).beFriendly(); // Приводим к типу Pet и вызываем метод beFriendly()
            }else {
                System.out.println(animal.getName() + " не является домашним животным.");
            }
            animal.makeSound();  // Вызываем звук животного
            animal.move(); // Вызываем движение животного
        }
    }
}
