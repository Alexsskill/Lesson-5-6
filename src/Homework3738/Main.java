package Homework3738;

public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[6];

        // Создаем 6 игроков
        for (int i = 0; i < 6; i++) {
            players[i] = new Player();
            players[i].info(); // Вывод информации о состоянии команд после каждого добавленного игрока
        }

        // Пытаемся создать 7-го игрока и проверить результат
        Player oneMorePlayer = new Player();

        // Запускаем метод run() для каждого игрока, пока выносливость не достигнет нуля
        for (Player player : players) {
            while (player.getStamina() > 0) {
                player.run(); // Игрок бегает, пока есть выносливость
            }
        }

        // Выводим окончательное количество игроков на поле
        System.out.println("Количество игроков на поле: " + Player.getCountPlayers());
    }
}
