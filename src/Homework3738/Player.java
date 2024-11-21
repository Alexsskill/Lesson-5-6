package Homework3738;

import java.util.Random;

public class Player {

    private int stamina;  // Выносливость
    public static final int MAX_STAMINA = 100; // Максимальная выносливость
    public static final int MIN_STAMINA = 0;   // Минимальная выносливость
    private String name;  // Имя игрока

    // Конструктор класса Player
    public Player(String name) {
        this.name = name;
        Random rand = new Random();
        this.stamina = rand.nextInt(11) + 90; // Генерация выносливости от 90 до 100
    }

    // Геттер для stamina
    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    // Метод run(), уменьшающий выносливость и контролирующий уход игрока с поля
    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--; // Уменьшаем выносливость на 1
            if (stamina == MIN_STAMINA) {
                System.out.println(name + " устал и ушел с поля.");
            }
        }
    }
}
