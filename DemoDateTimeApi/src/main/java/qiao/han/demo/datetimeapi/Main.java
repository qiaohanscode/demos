package qiao.han.demo.datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

        System.out.println("------------------ Period.of(1,2.3) -------------------------------------------------------");
        System.out.println(String.format("Period.of(1,2,3).getYears() : %s" ,Period.of(1,2,3).getYears()));
        System.out.println(String.format("Period.of(1,2,3).getMonths() : %s" ,Period.of(1,2,3).getMonths()));
        System.out.println(String.format("Period.of(1,2,3).getDays() : %s" ,Period.of(1,2,3).getDays()));
        System.out.println(String.format("Period.of(1,2,3).getUnits() : %s" ,Period.of(1,2,3).getUnits()));
        System.out.println(String.format("Period.of(1,2,3).toTotalMonths() : %s" ,Period.of(1,2,3).toTotalMonths()));

        System.out.println("------------------ Period.ofYears(2) -------------------------------------------------------");
        var ofYears = Period.ofYears(2);
        System.out.println(String.format("ofYears.getYears() : %s", ofYears.getYears()));
        System.out.println(String.format("ofYears.getMonths() : %s", ofYears.getMonths()));
        System.out.println(String.format("ofYears.getDays() : %s", ofYears.getDays()));
        System.out.println(String.format("ofYears.getUnits() %s" ,ofYears.getUnits()));
        System.out.println(String.format("ofYears.toTotalMonths() %s" ,ofYears.toTotalMonths()));

        System.out.println("------------------- Period.ofMonth(2) ------------------------------------------------------");
        var ofMonth = Period.ofMonths(2);
        System.out.println(String.format("ofMonth.getYears() : %s", ofMonth.getYears()));
        System.out.println(String.format("ofMonth.getMonths() : %s", ofMonth.getMonths()));
        System.out.println(String.format("ofMonth.getDays() : %s", ofMonth.getDays()));
        System.out.println(String.format("ofMonth.getUnits() : %s", ofMonth.getUnits()));

        System.out.println("------------------ Period.ofWeeks(10) -------------------------------------------------------");
        System.out.println(String.format("Period.ofWeeks(10).getYears() : %s",Period.ofWeeks(10).getYears()));
        System.out.println(String.format("Period.ofWeeks(10).getMonths() : %s",Period.ofWeeks(10).getMonths()));
        System.out.println(String.format("Period.ofWeeks(10).getDays() : %s",Period.ofWeeks(10).getDays()));
        System.out.println(String.format("ofMonth.getUnits() : %s", Period.ofWeeks(10).getUnits()));
        System.out.println(String.format("ofMonth.toTotalMonths() : %s", Period.ofWeeks(10).toTotalMonths()));

        System.out.println("------------------ Period.ofDays(10) -------------------------------------------------------");
        System.out.println(String.format("Period.ofDays(10).getYears() : %s", Period.ofDays(10).getYears()));
        System.out.println(String.format("Period.ofDays(10).getMonths() : %s ", Period.ofDays(10).getMonths()));
        System.out.println(String.format("Period.ofDays(10).getDays() : %s", Period.ofDays(10).getDays()));
        System.out.println(String.format("Period.ofDays(10).getUnits() : %s", Period.ofDays(10).getUnits()));

        System.out.println("------------------ Period.between(01.01.2023,02.02.2024) ---------------------------------");
        var start = LocalDateTime.of(2023,1,1,0,0,0,0).toLocalDate();
        var end = LocalDateTime.of(2024,3,4,1,1,1,1).toLocalDate();
        var betw = Period.between(start,end);
        System.out.println(String.format("Period.between(start,end).getYears() %s",betw.getYears()));
        System.out.println(String.format("Period.between(start,end).getMonths() %s",betw.getMonths()));
        System.out.println(String.format("Period.between(start,end).getDays() %s",betw.getDays()));

        System.out.println("------------------ Duration between(2017-10-03T10:15:30.00Z,2017-10-03T10:16:30.00Z) ----------");
        Instant start1 = Instant.parse("2017-10-03T10:15:30.00Z");
        Instant end1 = Instant.parse("2017-10-03T10:16:30.00Z");

        Duration duration = Duration.between(start1, end1);
        System.out.println(String.format("duration.toMillis() : %s",duration.toMillis()));


        System.out.println("------------------ Duration between(2017-10-03T10:15:30.00,2018-10-03T10:16:30.00) ----------");
        var start2 = LocalDateTime.parse("2017-10-03T10:15:30.00");
        var end2 = LocalDateTime.parse("2018-10-05T10:16:30.00");
        var duration2 = Duration.between(start2,end2);
        System.out.println(String.format("duration2.toDays() %s",duration2.toDays()));
        System.out.println(String.format("duration2.toHours() %s",duration2.toHours()));
        System.out.println(String.format("duration2.toMinutes() %s",duration2.toMinutes()));
        System.out.println(String.format("duration2.toSeconds() %s",duration2.toSeconds()));

        System.out.println("------------------ Duration.ofDays(1) ----------");
        Duration durOfDays = Duration.ofDays(1);
        System.out.println(String.format("Duration.ofDays(1).toHours() : %s",durOfDays.toHours()));

        System.out.println("-------------------Duration.parse(PT1M11.22S)--------------------");
        Duration durOfChar = Duration.parse("PT1M11.22S");
        System.out.println(String.format("Duration.parse(PT1M11.22S).getSeconds() : %s",durOfChar.getSeconds()));
        System.out.println(String.format("Duration.parse(PT1M11.22S).toSeconds() : %s",durOfChar.toSeconds()));
        System.out.println(String.format("Duration.parse(PT1M11.22S).toMillis() : %s",durOfChar.toMillis()));
        System.out.println(String.format("Duration.parse(PT1M11.22S).getNano() : %s",durOfChar.getNano()));
        System.out.println(String.format("Duration.parse(PT1M11.22S).toNanos() : %s",durOfChar.toNanos()));

        System.out.println("------------------ Duration.parse(PT1H2M3.4444S) --------------------------");
        Duration durOfChar1 = Duration.parse("PT1H2M3.4444S");
        System.out.println(String.format("Duration.parse(PT1H2M3.4444S).getSeconds() %s",durOfChar1.getSeconds()));
        System.out.println(String.format("Duration.parse(PT1H2M3.4444S).toSeconds() %s",durOfChar1.toSeconds()));
        System.out.println(String.format("Duration.parse(PT1H2M3.4444S.toMillis() %s",durOfChar1.toMillis()));
        System.out.println(String.format("Duration.parse(PT1H2M3.4444S.getNano() %s",durOfChar1.getNano()));
        System.out.println(String.format("Duration.parse(PT1H2M3.4444S.toNanos() %s",durOfChar1.toNanos()));
    }
}
