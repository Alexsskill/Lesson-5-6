package Homework2930;

public class Book {
    // Поля для хранения данных о книге
    private String title;   // Название книги
    private Author author;  // Автор книги
    private Integer year;   // Год публикации

    // Сеттер для названия книги
    public void setTitle(String title) {
        this.title = title;
    }

    // Сеттер для автора книги
    public void setAuthor(Author author) {
        this.author = author;
    }

    // Сеттер для года публикации
    public void setYear(Integer year) {
        this.year = year;
    }

    // Геттер для названия книги
    public String getTitle() {
        return title;
    }

    // Геттер для автора книги
    public Author getAuthor() {
        return author;
    }

    // Геттер для года публикации
    public Integer getYear() {
        return year;
    }

    /**
     * Метод, возвращающий название книги, её автора и год
     * @return Название книги, имя автора и год издания книги
     */
    @Override
    public String toString() {
        return "Book: " + title + ", Author: " + author.toString() + ", Year: " + year;
    }

    public Book() {
    }

    public Book(String title, Author author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}