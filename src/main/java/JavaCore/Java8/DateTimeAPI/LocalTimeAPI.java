package JavaCore.Java8.DateTimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeAPI {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println(sixThirty);

        sixThirty = LocalTime.of(6, 30);
        System.out.println(sixThirty);

        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println(sevenThirty);

        int six = LocalTime.parse("06:30").getHour();
        System.out.println(six);

        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        System.out.println(isbefore);

        LocalTime maxTime = LocalTime.MAX;
        System.out.println(maxTime);
    }
}
