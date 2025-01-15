package HomeWork5758;

public class PrinterExample {
    public static void main(String[] args) {
        // 1. Создаем экземпляр Printer с помощью анонимного класса
        Printer anonymousPrinter = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };

        // Используем созданный экземпляр для вызова метода print
        anonymousPrinter.print("Сообщение из анонимного класса");

        // 2. Реализация через лямбда-выражение
        Printer lambdaPrinter = (message) -> System.out.println(message);

        // Вызываем метод print
        lambdaPrinter.print("Сообщение из лямбда-выражения");

        // 3. Вторая реализация через лямбда-выражение с фигурными скобками
        Printer lengthAwarePrinter = (message) -> {
            System.out.println(message);
            System.out.println("Длина сообщения - " + message.length());
        };

        // Вызываем метод print с дополнительным сообщением о длине
        lengthAwarePrinter.print("Сообщение с длиной");
    }
}
