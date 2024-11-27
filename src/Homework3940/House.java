package Homework3940;

import java.util.Objects;

public class House {
    private final int floors; // Количество этажей
    private final int rooms; // Количество комнат
    private final boolean hasGarage; // Наличие гаража

    // Конструктор класса House, доступный для внутреннего класса Builder
    private House(Builder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "Дом с " + floors + " этажами, " + rooms + " комнатами" +
                (hasGarage ? ", с гаражом" : ", без гаража");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return floors == house.floors && rooms == house.rooms && hasGarage == house.hasGarage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors, rooms, hasGarage);
    }

    // Статический внутренний класс Builder
    public static class Builder {
        private final int floors;      // Количество этажей
        private final int rooms;       // Количество комнат
        private boolean hasGarage = false; // По умолчанию гаража нет

        public Builder(int floors, int rooms) { // Конструктор для обязательных полей
            this.floors = floors;
            this.rooms = rooms;
        }

        public Builder setHasGarage(boolean hasGarage) { // Метод на наличие гаража
            this.hasGarage = hasGarage;
            return this; // Возвращаем текущий объект Builder
        }

        public House build() { // Метод для создания экземпляра House
            return new House(this);
        }
    }
}
