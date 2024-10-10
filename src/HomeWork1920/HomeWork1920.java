package HomeWork1920;

public class HomeWork1920 {
    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 30, 40, 50};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        int averageValue = sum / numbers.length;
        System.out.println("Cреднее значение объектов массива равно: " + averageValue);
        task();
        task1();
        task2();
        task3();
    }

    public static void task() {

        double[] array = {3.5, 5.2, -1.4, 7.8, 2.2};

        double minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        System.out.println("Минимальное значение элемента массива равно: " + minValue);

        double maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Максимальное значение элемента массива равно: " + maxValue);
    }

    public static void task1() {

        char[] array = {'a', 'B', 'i', 't', 'E', 'r'};

        int vowelletters = 0;

        for (char c : array) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowelletters++;
            }
        }
        System.out.println("Количество гласных букв в массиве равно: " + vowelletters);
    }

    public static void task2() {

        String originalString = "Hello World";
        char[] characters = originalString.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == ' ') {
                characters[i] = '_';
            }
        }
        System.out.println(characters);
    }

    public static void task3() {

        String inputString = "apple,banana,grape,orange";

        String[] words = inputString.split(",");

        System.out.print("Части строки: ");
        for (String parts : words) {
            System.out.print(parts + " ");
        }
    }
}

