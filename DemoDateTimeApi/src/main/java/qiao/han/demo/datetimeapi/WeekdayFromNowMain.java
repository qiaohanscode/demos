package qiao.han.demo.datetimeapi;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class WeekdayFromNowMain {

    public static void main(String[] args){
        int count = 30;

        LocalDateTime ldtNow = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        for(int i=0;i<count;i++){
            LocalDateTime ldtNowPlusI = ldtNow.plusDays(i);
            System.out.println(String.format("%s:%s, Sa|So:%s"
                    ,ldtNowPlusI, ldtNowPlusI.getDayOfWeek()
                    , isSaturdayOrSunday(ldtNowPlusI)));
        }
    }

    private static boolean isSaturdayOrSunday(LocalDateTime ldtNowPlusI) {
        return DayOfWeek.SATURDAY.equals(ldtNowPlusI.getDayOfWeek()) || DayOfWeek.SUNDAY.equals(ldtNowPlusI.getDayOfWeek());
    }
}
