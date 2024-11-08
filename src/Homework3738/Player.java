package Homework3738;

import java.util.Random;

public class Player {

    private int stamina;  // Выносливость
    public static final int MAX_STAMINA = 10; // Максимальная выносливость
    public static final int MIN_STAMINA = 0;   // Минимальная выносливость
    private static int countPlayers = 0;      // Количество игроков на поле

    // Конструктор класса Player
    public Player() {
        Random rand = new Random();
        this.stamina = rand.nextInt(11) + 90; // Генерация выносливости от 90 до 100
        if (countPlayers < 6) {
            countPlayers++; // Увеличиваем количество игроков, если игроков меньше 6
        } else {
            System.out.println("Нельзя создать больше игроков. Количество игроков на поле: " + countPlayers);
        }
    }

    // Геттер для stamina
    public int getStamina() {
        return stamina;
    }

    // Метод run(), уменьшающий выносливость и контролирующий уход игрока с поля
    public void run() {
        if (stamina > MIN_STAMINA) {
            stamina--; // Уменьшаем выносливость на 1
            if (stamina == MIN_STAMINA) {
                countPlayers--; // Уменьшаем количество игроков, если игрок устал
                System.out.println("Игрок устал и ушел с поля.");
            }
        }
    }

    // Метод info()
    public void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

    // Метод для получения количества игроков на поле
    public static int getCountPlayers() {
        return countPlayers;
    }
}
