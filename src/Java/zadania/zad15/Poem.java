package Java.zadania.zad15;

public class Poem {

    private Author creator;
    private int stropheNumbers;

    public Poem(Author author, int stropheNumbers) {
        this.creator = author;
        this.stropheNumbers = stropheNumbers;
    }

    public Author getCreator() {
        return this.creator;
    }

    public int getStropheNumbers() {
        return this.stropheNumbers;
    }
}
