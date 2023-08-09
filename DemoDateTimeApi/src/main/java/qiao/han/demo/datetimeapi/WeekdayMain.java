package qiao.han.demo.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;

public class WeekdayMain {

    public static void main(String[] args){
        localDateTimeUndLocalDate();
    }

    private static void localDateTimeUndLocalDate() {
        LocalDate now = LocalDate.now(ZoneId.of("Europe/Berlin"));
        int weekday = now.get(WeekFields.ISO.dayOfWeek());
        System.out.println(String.format("Weekday:%s", weekday));

        DayOfWeek dayOfWeek = now.getDayOfWeek();
        System.out.println(String.format("LocalDate.now().getDayOfWeek():DayOfWeek:%s",dayOfWeek));

        System.out.println(String.format("Is equal DayOfWeek.Tuesday:%s", DayOfWeek.TUESDAY.equals(dayOfWeek)));

        LocalDateTime ldtNow = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        DayOfWeek dayOfWeekLdtNow = ldtNow.getDayOfWeek();
        System.out.println(String.format("LocalDateTime.now().getDayOfWeek(): DayOfWeek : %s",dayOfWeekLdtNow));
    }
}
