package Homework5556;

public class Main {
    public static void main(String[] args) {
        CarList carList = new CarList();

        try {
            // Пробуем найти машину, которая существует
            System.out.println("Найдена: " + carList.getCar("Toyota").getModel());

            // Пробуем найти машину, которой нет в списке
            System.out.println("Найдена: " + carList.getCar("BMW").getModel());
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage()); // Выводим сообщение об ошибке
        }
    }
}
