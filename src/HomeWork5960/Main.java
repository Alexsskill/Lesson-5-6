package HomeWork5960;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Добавляем книги
        library.addBook(new Book(1, "The Catcher in the Rye", "J.D. Salinger", true));
        library.addBook(new Book(2, "1984", "George Orwell", false));
        library.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee", true));
        library.addBook(new Book(4, "Pride and Prejudice", "Jane Austen", false));
        library.addBook(new Book(5, "The Great Gatsby", "F. Scott Fitzgerald", true));

        //Проверка получения книги по ID
        System.out.println("Книга с ID 1: " + library.getBookById(1).getTitle());

        // Получение всех книг
        System.out.println("Все книги:");
        library.getBooks().forEach(book -> System.out.println(book.getTitle()));

        // Получение доступных книг
        System.out.println("Доступные книги:");
        library.getBooks(true).forEach(book -> System.out.println(book.getTitle()));

        // Получение недоступных книг
        System.out.println("Недоступные книги:");
        library.getBooks(false).forEach(book -> System.out.println(book.getTitle()));

        // Подсчет всех книг
        System.out.println("Количество всех книг: " + library.countBooks());

        // Подсчет доступных книг
        System.out.println("Количество доступных книг: " + library.countBooks());

        // Получение уникальных авторов
        System.out.println("Авторы (без дубликатов):");
        library.getAuthors().forEach(System.out::println);

        // Пример использования сортировки по автору
        System.out.println("Книги, отсортированные по автору:");
        library.getBooks(Comparator.comparing(Book::getAuthor)).forEach(book -> System.out.println(book.getTitle()));

        // Проверка получения книги по ID
        System.out.println("\nBook with ID 3: " + library.getBookById(3));

        // Разделение на доступные и недоступные книги
        Map<Boolean, List<Book>> partitionedBooks = library.partitionBooksByAvailability();

        System.out.println("\nAvailable Books:");
        partitionedBooks.get(true).forEach(System.out::println);

        System.out.println("\nUnavailable Books:");
        partitionedBooks.get(false).forEach(System.out::println);

        // Группировка книг по авторам
        Map<String, List<Book>> groupedBooks = library.groupBooksByAuthor();
        System.out.println("\nBooks Grouped by Authors:");
        groupedBooks.forEach((author, books) -> {
            System.out.println(author + ":");
            books.forEach(System.out::println);
        });
    }
}
