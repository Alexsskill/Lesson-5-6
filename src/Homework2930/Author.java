package Homework2930;

public class Author {

    // Поля для хранения имени и фамилии автора
    private String firstName;
    private String lastName;

   /* // Сеттер для имени
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Сеттер для фамилии
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }*/

    // Геттер для имени
    public String getFirstName() {
        return firstName;
    }

    // Геттер для фамилии
    public String getLastName() {
        return lastName;
    }

    /**
     * Метод для получения полного имени автора
     * @return Возвращает полное имя автора
     */
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public Author () {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
