package Homework3738;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        // Добавляем игроков в игру
        game.addPlayer("Александр");
        game.addPlayer("Василий");
        game.addPlayer("Сергей");
        game.addPlayer("Иван");
        game.addPlayer("Дмитрий");
        game.addPlayer("Владимир");

        // Пытаемся добавить еще одного игрока
        game.addPlayer("Алексей"); // Не должно добавляться

        // Выводим информацию о текущих игроках на поле
        game.info();

        // Запускаем метод run() для каждого игрока до полной истощенности
        for (int i = 0; i < game.players.size(); i++) {
            while (game.players.get(i).getStamina() > 0) {
                game.players.get(i).run();
            }
        }

        // Проверяем наличие игроков по имени
        System.out.println("Игрок с именем 'Александр' есть в игре? " + game.hasPlayer("Александр"));
        System.out.println("Игрок с именем 'Олег' есть в игре? " + game.hasPlayer("Олег"));

        // Выводим окончательное количество игроков на поле после игры
        game.info();
    }
}
