package org.example;

import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class DemoRegexMain {
    public static void main( String[] args ){

        String strPattern = "((?<sign>[+-]?)(?<day>[\\d]+)\\s(?<hour>[\\d]{1,2}):(?<minute>\\d{1,2}):(?<second>[\\d]{1,2})([.](?<nanosecond>[\\d]{1,9}))?)";

        parse(strPattern, "+000000013 05:30:34.219661000");
        parse(strPattern, "-0 00:00:1.98");

    }

    private static void parse(String strPattern, String strToParse) {
        System.out.println("-----------------------------------------------------");
        Pattern pattern = Pattern.compile(strPattern);
        Matcher matcher = pattern.matcher(strToParse);
        System.out.println(String.format("Pattern.matches() : %s", matcher.matches()));
        System.out.println("Pattern.matches().group(sign):"+matcher.group("sign"));
        System.out.println("Pattern.matches().group(day):"+matcher.group("day"));
        System.out.println("Pattern.matches().group(hour):"+matcher.group("hour"));
        System.out.println("Pattern.matches().group(minute):"+matcher.group("minute"));
        System.out.println("Pattern.matches().group(second):"+matcher.group("second"));
        System.out.println("Pattern.matches().group(nanosecond):"+matcher.group("nanosecond"));

        StringBuffer strDuration = new StringBuffer();
        String sign = matcher.group("sign");
        if(sign != null & !sign.isBlank()){
            strDuration.append(sign);
        }
        strDuration.append("P");
        String day = matcher.group("day");
        if(day != null && !day.isBlank()){
            long longDay = Long.valueOf(day).longValue();
            strDuration.append(longDay + "D");
        }
        strDuration.append("T");
        String hour = matcher.group("hour");
        if(hour != null && !hour.isBlank()){
            long longHour = Long.valueOf(hour).longValue();
            strDuration.append(longHour+"H");
        }
        String minute = matcher.group("minute");
        if(minute != null && !minute.isBlank()){
            long longMinute = Long.valueOf(minute).longValue();
            strDuration.append(longMinute +"M");
        }
        String second = matcher.group("second");
        if(second != null && !second.isBlank()){
            long longSecond = Long.valueOf(second).longValue();
            strDuration.append(longSecond);
            String nanoSecond = matcher.group("nanosecond");
            if(nanoSecond != null && !nanoSecond.isBlank()){
                long longNanoSecond = Long.valueOf(nanoSecond).longValue();
                strDuration.append("." + longNanoSecond);
            }
            strDuration.append("S");
        }

        System.out.println("created String Duration:" + strDuration.toString());
        Duration dur = Duration.parse(strDuration);
        System.out.println("Created Duration : " + dur);
        System.out.println("-----------------------------------------------------");
    }
}
