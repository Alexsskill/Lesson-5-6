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
     * Метод фильтрации книг по полю isAvailable
     *
     * @param availability Доступная или недоступная книга
     */
    public List<Book> getBooks(boolean availability) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == availability)
                .collect(Collectors.toList());
    }

    /**
     * Метод получения книг
     *
     * @return
     */
    public long countBooks() {
        return books.size();
    }

    /**
     * Метод получения доступных или недоступных книг
     *
     * @param availability
     */
    public long countBooks(boolean availability) {
        return books.values().stream()
                .filter(book -> book.isAvailable() == availability)
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

    public List<Book> getBooks(Comparator<Book> comparator) {
        return books.values().stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
