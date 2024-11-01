package HomeWork3334;

public class Cat extends Animal {
    public Cat(String name) {
        super(name); // Вызов конструктора родительского класса
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу");
    }
}
