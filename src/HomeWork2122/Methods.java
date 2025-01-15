package HomeWork2122;

public class Methods {

    /**
     * Метод, который принимает одно целое число и возвращает его квадрат
     *
     * @param number Целое число
     * @return Квадрат целого числа
     */
    public static int square(int number) {
        return number * number;
    }

    /**
     * Метод, который принимает два параметра типа String — имя и фамилию — и выводит полное имя
     * в формате: "Full name: Имя Фамилия"
     *
     * @param firstName Имя
     * @param lastName  Фамилия
     * @return Имя с фамилией
     */
    public static String printFullName(String firstName, String lastName) {
        System.out.println("Полное имя: " + firstName + " " + lastName);
        return firstName + " " + lastName;
    }

    /**
     * Перегруженный метод, который принимает строки в произвольном количестве, и находит самое короткое
     * и самое длинное слово
     *
     * @param strings Строки
     * @return Самое короткое и самое длинное слово
     */
    public static String[] cornerValuesArray(String... strings) {
        if (strings == null || strings.length == 0) {
            return new String[]{};
        }
        String shortest = null;
        String longest = null;


        for (String str : strings) {
            if (str == null || str.isEmpty()) {
                continue;
            }

            if (shortest == null || str.length() < shortest.length()) {
                shortest = str;
            }
            if (longest == null || str.length() > longest.length()) {
                longest = str;
            }
        }

        return new String[]{shortest, longest};
    }

    /**
     * Перегруженный метод, который принимает произвольное количество чисел, и находит минимальное и
     * максимальное число
     *
     * @param numbers Целые числа
     * @return Минимальное и максимальное целое число
     */
    public static int[] cornerValuesArray(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[0];
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }

    /**
     * Перегруженный метод, который принимает произвольное количество символов, и находит самый маленький и
     * самый большой символ
     *
     * @param chars Символы
     * @return Самый маленький и самый большой символ
     */
    public static char[] cornerValuesArray(char... chars) {
        if (chars == null || chars.length == 0) {
            return new char[]{};
        }

        char min1 = chars[0];
        char max1 = chars[0];

        for (char c : chars) {
            if ((int) c < (int) min1) {
                min1 = c;
            }
            if ((int) c > (int) max1) {
                max1 = c;
            }
        }

        return new char[]{min1, max1};
    }

    /**
     * Метод для нахождения факториала
     *
     * @param n Целое число
     * @return Факториал от n
     */
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        //Находим факториал с помощью рекурсивного вызова метода
        {
            int n = 5;
            int result = factorial(n);
            System.out.println("Факториал " + n + " равен " + result);
        }

        // Проверяем первый метод square
        int result1 = square(2);
        int result2 = square(5);
        int result3 = square(10);

        System.out.println("Результат первого значения: " + result1);
        System.out.println("Результат второго значения: " + result2);
        System.out.println("Результат третьего значения: " + result3);

        // Проверяем второй метод printFullName
        printFullName("Иван", "Иванов");

        printFullName("Мария", "Петрова");

        printFullName("Алексей", "Сидоров");

        // Проверяем третий метод cornerValuesArray со значениями String
        String[] result4 = cornerValuesArray("hello", "world", "abc", "defgh");
        System.out.println("Shortest: " + result4[0] + ", Longest: " + result4[1]);

        String[] result5 = cornerValuesArray("hello", "", "world", "  ", "abc", "defgh");
        System.out.println("Shortest: " + result5[0] + ", Longest: " + result5[1]);

        String[] result6 = cornerValuesArray("", "", "");
        System.out.println("Result: " + result6[0] + ", Result: " + result6[1]);

        String[] result7 = cornerValuesArray(null, "test", "longestString");
        System.out.println("Shortest: " + result7[0] + ", Longest: " + result7[1]);

        String[] result8 = cornerValuesArray("aaa", "bbb", "ccc");
        System.out.println("Shortest: " + result8[0] + ", Longest: " + result8[1]);

        // Проверяем третий метод cornerValuesArray со значениями int
        // Тестовый случай1: Пустой массив. Не получилось. Закомментил
        int[] result9 = cornerValuesArray(new int[]{});
        System.out.println("Результат:- Пустой массив");

        // Тест 2: Массив с одним элементом
        int[] result10 = cornerValuesArray(5);
        System.out.println("Мин: " + result10[0] + ", Макс: " + result10[1]);

        // Тест 3: Массив с несколькими элементами
        int[] result11 = cornerValuesArray(1, 2, 3, 4, 5);
        System.out.println("Мин: " + result11[0] + ", Макс: " + result11[1]);

        // Тест 4: Массив с отрицательными числами
        int[] result12 = cornerValuesArray(-1, -2, -3, -4, -5);
        System.out.println("Мин: " + result12[0] + ", Макс: " + result12[1]);

        // Тест 5: Массив с смешанными положительными и отрицательными числами
        int[] result13 = cornerValuesArray(-1, 2, 3, -4, 5);
        System.out.println("Мин: " + result13[0] + ", Макс: " + result13[1]);

        //Проверяем третий метод cornerValuesArray со значениями char
        // Тест 1: Пустой массив
        char[] result14 = cornerValuesArray(new char[]{});
        System.out.println("Результат:- Пустой массив");

        // Тест 2: Массив с одним элементом
        char[] result15 = cornerValuesArray('а');
        System.out.println("Мин: " + result15[0] + ", Макс: " + result15[1]);

        // Тест 3: Массив с несколькими элементами
        char[] result16 = cornerValuesArray('а', 'б', 'в', 'г', 'д');
        System.out.println("Мин: " + result16[0] + ", Макс: " + result16[1]);
    }
}