package HomeWork3334;

final class Dog extends Animal implements Pet {
    public Dog(String name) {
        super(name); // Вызов конструктора родительского класса
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав");
    }

    @Override
    public void move() {
        System.out.println(getName() + " бегает ");
    }

    @Override
    public void play() {
        System.out.println(getName() + " играет с косточкой ");
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " дружелюбвно виляет хвостом ");
    }
}
