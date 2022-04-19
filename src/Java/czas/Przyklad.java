package Java.czas;

import java.time.*;

public class Przyklad {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        Instant instant = Instant.now();

        Clock clock = Clock.system(ZoneId.of("America/Denver"));
        LocalDateTime localDateTimeOtherTz = LocalDateTime.now(clock);
        LocalDate localDateOtherTz = LocalDate.now(clock);
        LocalTime localTimeOtherTz = LocalTime.now(clock);
        Instant instantOtherTz = Instant.now(clock);

        LocalDateTime createdDateTime = LocalDateTime.of(2019, 12, 07, 12, 11, 43);
        LocalDate createdLocalDate = LocalDate.of(2019, 12, 8);
        LocalTime createdTime = LocalTime.of(12, 11, 32);

        LocalDateTime parsedLocalDateTime = LocalDateTime.parse("2007-12-03T10:15:30");
        LocalDate parsedLocalDate = LocalDate.parse("2007-12-03");
        LocalTime parsedLocalTime = LocalTime.parse("10:15:30");

        System.out.println(localDateTime);
        System.out.println(localTime.toString());
        System.out.println(localDate);
    }
}
