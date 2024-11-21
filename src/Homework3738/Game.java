package Homework3738;

import java.util.ArrayList;

public class Game {
    ArrayList<Player> players; // Список игроков
    private static final int MAX_PLAYERS = 6; // Максимальное количество игроков

    public Game() {
        players = new ArrayList<>();
    }

    // Метод для добавления игрока
    public void addPlayer(String name) {
        if (players.size() < MAX_PLAYERS) {
            Player newPlayer = new Player(name);
            players.add(newPlayer);
            System.out.println("Игрок " + name + " добавлен в игру.");
        } else {
            System.out.println("Нельзя добавить игрока. Игроков уже " + MAX_PLAYERS);
        }
    }

    // Метод info, выводит информацию о текущих игроках на поле
    public void info() {
        if (players.isEmpty()) {
            System.out.println("На поле нет игроков.");
        } else {
            System.out.println("Текущие игроки на поле:");
            for (Player player : players) {
                System.out.println(player.getName() + " (выносливость: " + player.getStamina() + ")");
            }
        }
        System.out.println("Свободных мест: " + (MAX_PLAYERS - players.size()));
    }

    // Метод проверки, есть ли игрок с указанным именем в списке
    public boolean hasPlayer(String name) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}
