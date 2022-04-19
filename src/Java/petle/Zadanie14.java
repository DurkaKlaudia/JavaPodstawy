package Java.petle;

import java.util.ArrayList;
import java.util.Collections;

public class Zadanie14 {
    //polecenie brzmi: napisz metode, ktora zwraca najczescie wystepujacy element tablicy
    //tablica: 40 elementow, losowych, liczby int od 1 do 12

    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        System.out.println(mostFreqent(array1));
        System.out.println(mostFreqent(array2));
        System.out.println(mostFreqent(array3));
        System.out.println(mostFreqent(array4));
        System.out.println(mostFreqent(array5));
    }


    // Implement your solution below.
    public static Integer mostFreqent(int[] givenArray) {
        if (givenArray.length == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int n : givenArray) arrayList.add(n);
        Collections.sort(arrayList);

        Integer maxItem = 0;
        int counter = 1;
        int maxCount = 0;

        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) == arrayList.get(i + 1)) {
                counter++;
                if (counter++ > maxCount) {
                    maxCount = counter;
                    maxItem = arrayList.get(i);
                }
            } else counter = 1;
        }

        return maxItem;
    }
}
