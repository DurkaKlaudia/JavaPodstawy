package Java.varargs;

public class Zadanie6 {

    public static void main(String[] args) {
        varArgsPrzyklad(1, 2, 4, 5, 3, 12, 542, 5432, -1, 32);

    }
    //tresc: napisz metode ktora przyjmuje varargs i zwraca tablice z ktorej jeden (dowolny)
    // element jest usuniety
    //(tzn elementy powyzej usunietego elementu sa poprzesuwane o 1 pozycje w lewo)
    //mozecie sobie przepisac do drugiej tablicy

    //napisz metode, która zwraca różnice między największym a najmniejszym elementem tablicy którą podasz jako varargs
    //podpowiedzi : deklarujecie dwie zmienne min i max

    public static void varArgsPrzyklad(int... a){
        for(int element : a){
            System.out.println(element);
        }
        System.out.println();
        System.out.println(a[1]);
    }
}
