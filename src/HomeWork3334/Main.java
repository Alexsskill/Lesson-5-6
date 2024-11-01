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

        // Перебираем массив и вызываем метод makeSound()
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
