package Homework5556;

public class PasswordValidator {

    // Метод для проверки пароля
    public static String validatePassword(String password) {
        String issues = ""; // Строка для хранения проблем с паролем

        // Проверка длины пароля
        if (password.length() < 8 || password.length() > 20) {
            issues += "Пароль должен быть длиной от 8 до 20 символов.\n";
        }
        // Проверка на заглавные буквы
        if (!containsUpperCase(password)) {
            issues += "Пароль должен содержать хотя бы одну заглавную букву.\n";
        }
        // Проверка на строчные буквы
        if (!containsLowerCase(password)) {
            issues += "Пароль должен содержать хотя бы одну строчную букву.\n";
        }
        // Проверка на цифры
        if (!containsDigit(password)) {
            issues += "Пароль должен содержать хотя бы одну цифру.\n";
        }
        // Проверка на пробелы
        if (password.contains(" ")) {
            issues += "Пароль не должен содержать пробелов.\n";
        }

        // Если есть проблемы, возвращаем их, иначе сообщаем, что пароль соответствует требованиям
        return issues.isEmpty() ? "Пароль \"" + password + "\" соответствует всем требованиям." : "Проблемы с паролем:\n" + issues;
    }

    // Проверка на наличие заглавной буквы
    private static boolean containsUpperCase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true; // Найдена заглавная буква
            }
        }
        return false; // Заглавная буква не найдена
    }

    // Проверка на наличие строчной буквы
    private static boolean containsLowerCase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true; // Найдена строчная буква
            }
        }
        return false; // Строчная буква не найдена
    }

    // Проверка на наличие цифры
    private static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                return true; // Найдена цифра
            }
        }
        return false; // Цифра не найдена
    }

    public static void main(String[] args) {
        String[] passwords = {
                "MyPassword123",
                "ffffff66",
                "ShlechtPass",
                "aSdf3h",
                "avalanche gt2020"
        };

        // Проверяем каждый пароль и выводим результат
        for (String password : passwords) {
            System.out.println(validatePassword(password));
        }
    }
}

