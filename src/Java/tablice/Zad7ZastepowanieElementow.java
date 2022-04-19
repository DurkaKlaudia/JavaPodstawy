package Java.tablice;

public class Zad7ZastepowanieElementow {

    public Zad7ZastepowanieElementow() {
    }

    public static void main(String[] args) {
        int[][] tab1 = new int[][]{{2, 5, 7, 9, 3, 7, 9, 1}, {3, 5, 6, 8, 1, 1, 9, 6}};
        int[][] tab2 = new int[][]{{5, 2, 7, 8, 3, 5, 2, 1}, {3, 5, 7, 8, 1, 6, 9, 6}};

        int i;
        int j;
        for(i = 0; i < tab1.length; ++i) {
            for(j = 0; j < tab1[i].length; ++j) {
                if (tab1[i][j] == tab2[i][j]) {
                    tab1[i][j] = 0;
                }
            }
        }

        System.out.println("TABLLICE DWUWYMIAROWE");

        for(i = 0; i < tab1.length; ++i) {
            System.out.println("[");

            for(j = 0; j < tab1[i].length; ++j) {
                if (j != tab1[i].length - 1) {
                    System.out.println(tab1[i][j] + ", ");
                } else {
                    System.out.println(tab1[i][j]);
                }
            }
        }

    }
}
