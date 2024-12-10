package HomeWork4748;

import java.util.PriorityQueue;

public class TaskManager {

    // Создаем поле taskQueue, нашу очередь с задачами
    private PriorityQueue<Taskk> taskQueue;

    //Создаем конструктор класса TaskManager,который создаёт нашу очередь
    public TaskManager() {
        taskQueue = new PriorityQueue<>();
    }

    // Метод для вставки наших задач в очередь
    public void addTask(Taskk task) {
        taskQueue.offer(task);
    }

    // Выполняем задачи из очереди
    public void executeTasks() {
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}

