package Homework2930;

public class Main {
    public static void main(String[] args) {

        // Используем конструкторы с параметрами для создания авторов
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");
        Author author3 = new Author("Александр", "Пушкин");

        // Используем конструкторы с параметрами для создания книг
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1869);

        // Изменяем название и год для первой книги
        book1.setTitle("War and Peace");
        book1.setYear(1870);

        // Изменяем автора для второй книги
        book2.setAuthor(author3);

        //Выводим информацию о книгах
        System.out.println(book1);
        System.out.println(book2);

        // Получаем и выводим все поля обеих книг
        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYear());

        System.out.println("Book 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year: " + book2.getYear());


        /* // Создаем объекты Author
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
        book2.setYear(1866);*/

        // Выводим информацию о книгах
    }
}
