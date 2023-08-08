package qiao.han.demo.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;

public class WeekdayMain {

    public static void main(String[] args){
        LocalDate now = LocalDate.now(ZoneId.of("Europe/Berlin"));
        int weekday = now.get(WeekFields.ISO.dayOfWeek());
        System.out.println(String.format("Weekday:%s", weekday));

        var dayOfWeek = now.getDayOfWeek();
        System.out.println(String.format("DayOfWeek:%s",dayOfWeek));

        System.out.println(String.format("Is equal DayOfWeek.Tuesday:%s", DayOfWeek.TUESDAY.equals(dayOfWeek)));

    }
}
