package Homework2930;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты Author
        Author author1 = new Author();
        author1.setFirstName("Лев");
        author1.setLastName("Толстой");

        Author author2 = new Author();
        author2.setFirstName("Фёдор");
        author2.setLastName("Достоевский");

        // Создаем объекты Book
        Book book1 = new Book();
        book1.setTitle("Война и мир");
        book1.setAuthor(author1);
        book1.setYear(1869);

        Book book2 = new Book();
        book2.setTitle("Преступление и наказание");
        book2.setAuthor(author2);
        book2.setYear(1866);

        // Выводим информацию о книгах
        System.out.println(book1);
        System.out.println(book2);
    }
}
