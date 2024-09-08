public class Main {
    public static void main(String[] args) {
        /*byte myByte = 10;
        short myShort = 12 7;
        int myInt = 127;
        long myLong = 127L;

        float myFloat = 3.0f;
        double myDouble = 3.0;

        char myChar = 'a';

        boolean myBoolean = true;*/

        // Объявление переменных целого типа int
        int a = 20;
        int b = 10;

        // Объявление переменных с плавающей точкой
        double a1 = 20;
        double b1 = 10;

        // Сумма, вычитание и умножение
        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;

        // Деление
        int division = a / b;
        double division2 = a1 / b1;

        // Остаток от деления
        int TheReminderOfTheDivision = a % b;
        double TheReminderOfTheDivision2 = a1 % b1;


        System.out.println("Сложение равно " + sum);
        System.out.println("Сложение равно " + sum);
        System.out.println("Сложение равно " + sum);
        // Новые строки !

        System.out.println("Сложение равно " + sum);
        System.out.println("Вычитание равно " + difference);
        System.out.println("Умножение равно " + multiplication);
        System.out.println("Деление равно " + division + " - Это правильный ответ");
        System.out.println("Остаток от деления равен " + TheReminderOfTheDivision + " - Это правильный ответ");
        System.out.println("Деление №2 равно " + division2 + " - Это правильный ответ");
        System.out.println("Остаток от деления №2 равен " + TheReminderOfTheDivision2 + " - Это правильынй ответ" );
    }
}