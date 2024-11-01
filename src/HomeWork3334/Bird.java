package HomeWork3334;

public class Bird extends Animal {
    // Поле с инкапсуляцией
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name); // Вызов конструктора родительского класса
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Чирик-чирик");
    }

    // Геттер для поля canFly
    public boolean canFly() {
        return canFly;
    }

    // Сеттер для поля canFly
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
