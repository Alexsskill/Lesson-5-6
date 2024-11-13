package Homework3940;

public class Main {
    public static void main(String[] args) {
        // Создаем первый дом с помощью Builder
        House house1 = new House.Builder(2, 5)
                .setHasGarage(true)
                .build();

        // Создаем второй дом с помощью Builder
        House house2 = new House.Builder(3, 4)
                .setHasGarage(false)
                .build();

        // Выводим информацию о домах в консоль
        System.out.println(house1);
        System.out.println(house2);
    }
}
