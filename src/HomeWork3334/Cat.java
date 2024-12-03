package HomeWork3334;

final class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(name); // Вызов конструктора родительского класса
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу");
    }

    @Override
    public void move() {
        System.out.println(getName() + " ходит ");
    }

    @Override
    public void play() {
        System.out.println(getName() + " играет с мышкой ");
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " дружелюбно мурлычит ");
    }
}
