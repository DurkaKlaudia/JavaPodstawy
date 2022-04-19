package Java.zadania.zad15;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Author mickiewicz = new Author("Mickiewicz", "Polish");
        Author slowacki = new Author("Slowacki", "Polish");
        Poem panTadeusz = new Poem(mickiewicz, 2000);
        Poem kordian = new Poem(slowacki, 1500);
        Poem romeoAndJulia = new Poem(new Author("Shoekspire", "English"), 1800);
        Poem[] poems = new Poem[]{panTadeusz, kordian, romeoAndJulia};
        Poem theLongestPoem = poems[0];
        Poem[] var8 = poems;
        int var9 = poems.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            Poem poem = var8[var10];
            if (poem.getStropheNumbers() > theLongestPoem.getStropheNumbers()) {
                theLongestPoem = poem;
            }
        }

        System.out.println(theLongestPoem.getCreator().getSurname());
    }
}
