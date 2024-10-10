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

        String shortest = strings[0];
        String longest = strings[0];

        for (String str : strings) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
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
            return new int[]{};
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

    public static void main(String[] args) {
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
        String[] array1 = {"peace", "war", "table", "difference", "ball"};
        String[] Result1 = cornerValuesArray(array1);
        System.out.println("Shortest: " + Result1[0] + " Longest: " + Result1[1]);

        String[] array2 = {"mouse", "computer", "telephone", "apple", "pig"};
        String[] Result2 = cornerValuesArray(array2);
        System.out.println("Shortest: " + Result2[0] + " Longest: " + Result2[1]);

        String[] array3 = {"pen", "gift", "method", "abbreviation", "headphones"};
        String[] Result3 = cornerValuesArray(array3);
        System.out.println("Shortest: " + Result3[0] + " Longest: " + Result3[1]);

        // Проверяем третий метод cornerValuesArray со значениями int
        int[] array4 = {6, 5, 7, 4, 8, 2, 1, 2, 0};
        int[] Result4 = cornerValuesArray(array4);
        System.out.println("Минимальное число: " + Result4[0] + " Максимальное число: " + Result4[1]);

        // Проверяем третий метод с элементами типа Char
        char[] array5 = {'b', 'c', 'd', 'e', 'f'};
        char[] Result5 = cornerValuesArray(array5);
        System.out.println("Самый маленький символ: " + Result5 + " Самый большой символ: " + Result5[1]);
    }
}
