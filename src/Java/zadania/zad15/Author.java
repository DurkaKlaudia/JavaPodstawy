package Java.zadania.zad15;

public class Author {

    private String surname;
    private String nationality;

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getNationality() {
        return this.nationality;
    }
}
