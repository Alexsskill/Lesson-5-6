package HomeWork2122;

public class Methods {

    public static int square(int number) {
        return number * number;
    }

    public static String printFullName(String firstName, String lastName) {
        System.out.println("Полное имя: " + firstName + " " + lastName);
        return firstName + " " + lastName;
    }

    public static String[] cornerValuesArray(String[] array) {
        if (array == null || array.length == 0) {
            return new String[]{};
        }

        String shortest = array[0];
        String longest = array[0];

        for (String str : array) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        return new String[]{shortest, longest};
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

// Проверяем третий метод cornerValuesArray
        String[] array1 = {"peace", "war", "table", "difference", "ball"};
        String[] Result1 = cornerValuesArray(array1);
        System.out.println("Shortest: " + Result1[0] + ", Longest: " + Result1[1]);

        String[] array2 = {"mouse", "computer", "telephone", "apple", "pig"};
        String[] Result2 = cornerValuesArray(array2);
        System.out.println("Shortest: " + Result2[0] + ", Longest: " + Result2[1]);

        String[] array3 = {"pen", "gift", "method", "abbreviation", "headphones"};
        String[] Result3 = cornerValuesArray(array3);
        System.out.println("Shortest: " + Result3[0] + ", Longest: " + Result3[1]);
    }
}
