package JavaCore.Java8.DateTimeAPI;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeAPI {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime localDateTime = LocalDateTime.of(2022, Month.FEBRUARY, 20, 06, 30);
        System.out.println(localDateTime);

        localDateTime = LocalDateTime.parse("2015-02-20T06:30:00");
        System.out.println(localDateTime);

        localDateTime.plusDays(1);
        localDateTime.plus(1, ChronoUnit.HOURS);
        localDateTime.minusHours(2);
        localDateTime.getMonth();
    }
}
