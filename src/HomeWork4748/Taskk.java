package HomeWork4748;

public class Taskk implements Comparable<Taskk> {
    private final String name; // Имя задачи
    private final int priority; // Приоритет (1-3)
    private final String category; // Категория задачи

    public Taskk(String name, int priority, String category) {
        this.name = name;
        this.priority = priority;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(Taskk other) {
        // Сначала по приоритету, затем по категории (в алфавитном порядке)
        int priorityCompare = Integer.compare(this.priority, other.priority);
        if (priorityCompare != 0) {
            return priorityCompare;
        } else {
            return this.category.compareTo(other.category);
        }
    }

    @Override
    public String toString() {
        return " Задача " +
                " имя - " + name +
                ", приоритет - " + priority +
                ", категория - " + category;
    }
}

