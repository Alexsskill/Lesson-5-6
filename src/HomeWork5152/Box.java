package HomeWork5152;

public class Box<T> {
    private T object;

    // Метод для получения объекта
    public T get() {
        return object;
    }

    // Метод для установки объекта
    public void set(T object) {
        this.object = object;
    }

    // Метод для проверки, пуст ли контейнер
    public boolean isEmpty() {
        return object == null;
    }

    // Метод для очистки контейнера
    public void clear() {
        object = null;
    }
}
