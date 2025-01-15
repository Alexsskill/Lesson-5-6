package HomeWork5960;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
    private Map<Integer, Book> books = new HashMap<>();

    /**
     * Метод добавления в библиотеку
     *
     * @param book Книга Book с 3мя полями
     */
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    /**
     * Метод получения книги по id из библиотеки
     *
     * @param id id книги
     * @return
     */
    public Book getBookById(int id) {
        return books.get(id);
    }

    /**
     * Метод получения списка книг с сортировкой по названию
     *
     * @return Список книг с сортировкой по названию
     */
    public List<Book> getBooks() {
        return books.values().stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    /**
     * Метод получения списка доступных или недоступных книг
     *
     * @param availability Доступная или недоступная книга
     */
    public List<Book> getBooks(boolean availability) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == availability)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    /**
     * Метод получения книг
     *
     * @return
     */
    public long getBookCount() {
        return books.size();
    }

    /**
     * Метод получения количества доступных или недоступных книг
     */
    public long countBooks() {
        return books.values().stream()
                .filter(Book::isAvailable)
                .count();
    }

    /**
     * Метод получения списка авторов
     *
     * @return
     */
    public List<String> getAuthors() {
        return books.values().stream()
                .map(Book::getAuthor)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // Получение одной книги по id (за константное время)
    public Book getBookByIdFast(int id) {
        return books.get(id);
    }

    // Разделение книг на доступные и недоступные с помощью partitioningBy
    public Map<Boolean, List<Book>> partitionBooksByAvailability() {
        return books.values().stream()
                .collect(Collectors.partitioningBy(Book::isAvailable));
    }

    // Группировка книг по авторам с помощью groupingBy
    public Map<String, List<Book>> groupBooksByAuthor() {
        return books.values().stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }

    public List<Book> getBooks(Comparator<Book> comparator) {
        return books.values().stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}