package Java.czas;

import java.time.*;

public class Zadanie1B {

    public static void main(String[] args) {

        Clock clock = Clock.system(ZoneId.of("America/Denver"));
        LocalDateTime localDateTime = LocalDateTime.now(clock);
        LocalDate localDate = LocalDate.now(clock);
        LocalTime localTime = LocalTime.now(clock);



        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);
    }
}
