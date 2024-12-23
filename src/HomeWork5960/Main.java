package HomeWork5960;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Создаем книги и добавляем их в библиотеку
        library.addBook(new Book(1, "1984", "George Orwell", true));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee", false));
        library.addBook(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", true));
        library.addBook(new Book(4, "Moby Dick", "Herman Melville", true));
        library.addBook(new Book(5, "War and Peace", "Leo Tolstoy", false));

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
        System.out.println("Количество доступных книг: " + library.countBooks(true));

        // Получение уникальных авторов
        System.out.println("Авторы (без дубликатов):");
        library.getAuthors().forEach(System.out::println);

        // Пример использования сортировки по автору
        System.out.println("Книги, отсортированные по автору:");
        library.getBooks(Comparator.comparing(Book::getAuthor)).forEach(book -> System.out.println(book.getTitle()));
    }
}
