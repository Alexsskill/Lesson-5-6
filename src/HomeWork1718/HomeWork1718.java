package HomeWork1718;

public class HomeWork1718 {
    public static void main(String[] args) {

        String st = "PoolelooP";
        StringBuilder sb = new StringBuilder();

        for (int i = st.length() - 1; i >= 0; --i) {
            sb.append(st.charAt(i)); // .append - метод класса StringBuilder, который -
            // - присоединяет подстроку к строке. С помощью данного цикла получаем реверс -
            // - строки.
        }
        if (st.contentEquals(sb)) { // Метод contentEquals() сравнивает содержимое обьекта String -
            // - с содержимым любого обьекта CharSequence или StringBuffer.
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
        System.out.println(sb);
        task();
        task1();
    }

    public static void task() {

        String st = "PoolelooP";
        boolean isPalindrome = true;

        for (int i = 0; i < st.length() / 2; i++) {
            if (st.charAt(i) != st.charAt((st.length() - 1) - i)) { // Сравниваем 1ый и последний, 2ой и предпоследний -
                // - и так далее
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }

    public static void task1() {
        String number = "1234321";

        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) == number.charAt((number.length() - 1) - i)) {
                System.out.println("Palindrome");
                break;
            } else {
                System.out.println("Not Palindrome");
                break;
            }
        }


    }
}
