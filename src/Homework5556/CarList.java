package Homework5556;

import java.util.ArrayList;
import java.util.List;

public class CarList {
        private final List<Carr> cars;

        public CarList() {
            cars = new ArrayList<>();
            // Добавляем несколько машин в список
            cars.add(new Carr("Toyota"));
            cars.add(new Carr("Honda"));
            cars.add(new Carr("Ford"));
        }

        public Carr getCar(String model) {
            for (Carr car : cars) {
                if (car.getModel().equalsIgnoreCase(model)) {
                    return car; // Если нашли машину, возвращаем её
                }
            }
            // Если машина не найдена, выбрасываем исключение
            throw new CarNotFoundException("Машина с моделью '" + model + "' в списке не найдена.");
        }
    }
