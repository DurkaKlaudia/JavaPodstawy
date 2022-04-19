package Java.petle;

public class Zadanie13 {
    //stworz dwie tablice dwuwymiarowe i wykonaj ich dodawanie

    public static void main(String[] args) {
        int[][] tab = {{1, 2, 2, 5},
                {2, 3, 4, 6},
                {7, 6, 2, 4}
        };
        int[][] tab1 = {{0, 0, 0, 0},
                {1, 1, 1, 1},
                {2, 2, 2, 2}
        };
        int[][] tab3 = new int[3][4];
        for (int i = 0; i < tab3.length; i++) {
            for (int j = 0; j < tab3[i].length; j++) {
                tab3[i][j]=tab[i][j]+tab1[i][j];
            }
        }
        for (int i = 0; i < tab3.length; i++) {
            for (int j = 0; j < tab3[i].length; j++) {
                System.out.print(tab3[i][j]);
            }
            System.out.println();
        }
    }
}
