package Java.tablice;

public class Zad4 {

    public Zad4() {
    }

    public static void main(String[] args) {
        int[][] tab = new int[][]{{1, 2, 2, 5}, {2, 3, 4, 6}, {7, 6, 2, 4}};
        int[][] tab1 = new int[][]{{0, 0, 0, 0}, {1, 1, 1, 1}, {2, 2, 2, 2}};
        int[][] tab3 = new int[3][4];

        int i;
        int j;
        for(i = 0; i < tab3.length; ++i) {
            for(j = 0; j < tab3[i].length; ++j) {
                tab3[i][j] = tab[i][j] + tab1[i][j];
            }
        }

        for(i = 0; i < tab3.length; ++i) {
            for(j = 0; j < tab3[i].length; ++j) {
                System.out.print(tab3[i][j]);
            }

            System.out.println();
        }

    }
}
