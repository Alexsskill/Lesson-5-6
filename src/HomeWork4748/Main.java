package HomeWork4748;

public class Main {

    public static void main(String[] args) {
        TaskManager TaskManager = new TaskManager();

        // Создаём 6 задач
        Taskk task1 = new Taskk("Задача 1", 2, "Bug");
        Taskk task2 = new Taskk("Задача 2", 1, "Feature");
        Taskk task3 = new Taskk("Задача 3", 3, "Documentation");
        Taskk task4 = new Taskk("Задача 1.1", 1, "Bug");
        Taskk task5 = new Taskk("Задача 2.1", 2, "Documentation");
        Taskk task6 = new Taskk("Задача 3.1", 2, "Feature");

        // Добавляем задачи в менеджер задач
        TaskManager.addTask(task1);
        TaskManager.addTask(task2);
        TaskManager.addTask(task3);
        TaskManager.addTask(task4);
        TaskManager.addTask(task5);
        TaskManager.addTask(task6);

        // Выполнение задач и вывод на консоль
        System.out.println("Задачи в порядке выполнения:");
        TaskManager.executeTasks();
    }
}
