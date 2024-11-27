package Homework3940;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Car implements Comparable<Car> {
    String model;
    int year;
    String color;

    public Car(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public int compareTo(Car otherCar) {
        int modelCompare = this.model.compareTo(otherCar.model);
        if (modelCompare != 0) {
            return modelCompare; // Сравнение по модели
        }
        int yearCompare = Integer.compare(otherCar.year, this.year);
        if (yearCompare != 0) {
            return yearCompare; // Сравнение по году
        }
        return this.color.compareTo(otherCar.color); // Сравнение по цвету
    }

    @Override
    public String toString() {
        return model + " " + year + " " + color;
    }
}
