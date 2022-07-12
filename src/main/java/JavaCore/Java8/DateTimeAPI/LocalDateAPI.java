package JavaCore.Java8.DateTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateAPI {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        localDate = LocalDate.of(2001, 05, 01);
        System.out.println(localDate);

        localDate = LocalDate.parse("2022-07-08");
        System.out.println(localDate);

        localDate = LocalDate.now().plusDays(1);
        System.out.println(localDate);

        // This example obtains the current date and subtracts one month. Note how it accepts an enum as the time unit:
        localDate = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println(localDate);

        DayOfWeek dayOfWeek = LocalDate.parse("2022-07-12").getDayOfWeek();
        System.out.println(dayOfWeek);

        int twelve = LocalDate.parse("2022-07-12").getDayOfMonth();
        System.out.println(twelve);

        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println(leapYear);

        boolean before = LocalDate.parse("2022-07-12").isBefore(LocalDate.parse("2022-07-13"));
        System.out.println(before);

        boolean after = LocalDate.parse("2022-07-12").isAfter(LocalDate.parse("2022-07-11"));
        System.out.println(after);

        LocalDateTime beginningOfDay  = LocalDate.parse("2022-07-12").atStartOfDay();
        System.out.println(beginningOfDay );
        LocalDate firstDayOfMonth  = LocalDate.parse("2022-07-12").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);
    }
}
