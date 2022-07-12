package JavaCore.Java8.DateTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class ZonedDateTimeAPI {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println(zoneId);

        Set<String> allZoneIds  = ZoneId.getAvailableZoneIds();
        //System.out.println(allZoneIds);

        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, offset);

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }

}
