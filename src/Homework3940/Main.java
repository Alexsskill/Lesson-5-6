package Homework3940;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем четыре дома с помощью Builder
        House house1 = new House.Builder(2, 5).setHasGarage(true).build();
        House house2 = new House.Builder(3, 4).setHasGarage(true).build();
        House house3 = new House.Builder(2, 5).setHasGarage(false).build();// No garage
        House house4 = new House.Builder(3, 4).setHasGarage(true).build();// Have garage

        //Добавляем дома в список
        ArrayList<House> houses = new ArrayList<House>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);

        //Проверяем наличие домов с помощью contains
        System.out.println(houses.contains(house1));
        System.out.println(houses.contains(house2));

        //Находим индексы домов
        System.out.println(houses.indexOf(house3));
        System.out.println(houses.indexOf(house4));

        //Проверка, если убрать гараж (hasGarage) из equals
        House house5 = new House.Builder(2, 5).setHasGarage(false).build();
        System.out.println(houses.contains(house5));
        System.out.println(houses.indexOf(house5));

        System.out.println("******************** NEXT TASK ********************");

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Lada", 2024, "Black"));
        cars.add(new Car("Lada", 2024, "White"));
        cars.add(new Car("Lada", 2024, "Red"));
        cars.add(new Car("Lada", 2023, "Gray"));
        cars.add(new Car("Volga", 2024, "Black"));
        cars.add(new Car("Volga", 2023, "White"));
        cars.add(new Car("Volga", 2022, "Red"));
        cars.add(new Car("Audi", 2020, "Red"));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
