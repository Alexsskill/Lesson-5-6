package HomeWork3334;

public class Dog extends Animal {
    public Dog(String name) {
        super(name); // Вызов конструктора родительского класса
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав");
    }
}
