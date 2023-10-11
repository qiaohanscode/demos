package qiao.han.demo.system;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.Duration;

public class RemainderIntegerFloatingPointBigDecimalMain {

    public static void main(String[] args){
        double d1= 25.256d;
        System.out.println(String.format("%s%%24 = %s",d1, d1%24));

        double d2 = 26.2345678d;
        System.out.println(String.format("%s%%24 = %s",d2, d2%24));

        double d3 = 26.2345678d;
        System.out.println("----------- d3 = " + d3 + " --------------------");
        System.out.println(String.format("%s%%24 = %s",d3,d3%24));

        System.out.println(String.format("%s/24 = %s",d3,d3/24));
        System.out.println(String.format("(%s/24)*24 + (%s%%24) = %s",d3,d3,((d3/24)*24)+(d3%24)));
        System.out.println(String.format("((int)(%s/24)*24) + (%s%%24) = %s",d3,d3,((int)(d3/24)*24)+(d3%24)));

        double d4 = 24.00001d;
        System.out.println("----------- d4 = " + d4 + " --------------------");
        long rslt_d4= (long) (Duration.ofHours(1).toMillis()*(d4%24));
        System.out.println(String.format("Duration.ofHours(1).toMillis = %s",Duration.ofHours(1).toMillis()));
        System.out.println(String.format("Duration.ofHours(1).toMillis()*(%s%%24) = %s",d4,rslt_d4));

        double d5 = 24.0001d;
        System.out.println("----------- d5 = " + d5 + " --------------------");
        long rslt_d5= (long) (Duration.ofHours(1).toMillis()*(d5%24));
        System.out.println(String.format("Duration.ofHours(1).toMillis()*(%s%%24) = %s",d5,rslt_d5));

        //There is a deviation about 1 millisecond
        double d6 = 24.0d;
        double value_1 = 3.0d;
        for(int i=0;i<10;i++) {
            value_1 = value_1/10;
            d6 = 24.0 + value_1;
            System.out.println("----------- d6 = " + d6 + " --------------------");
            long rslt_d6 = (long) (Duration.ofHours(1).toMillis() * (d6 % 24));
            System.out.println(String.format("Duration.ofHours(1).toMillis()*(%s%%24) = %s*%s = %s", d6,Duration.ofHours(1).toMillis(),d6%24, rslt_d6));
        }




        BigDecimal bd = BigDecimal.valueOf(0.0d);
        BigDecimal val_bd = BigDecimal.valueOf(3.3d);
        for(int i=0;i<10;i++) {
            val_bd = val_bd.divide(BigDecimal.valueOf(10.0d));
            bd = BigDecimal.valueOf(24.0d).add(val_bd);
            System.out.println("----------- bd = " + bd + " --------------------");
            bd.remainder(BigDecimal.valueOf(24));
//            System.out.println(String.format("Bigdecimal: %s%%24 = %s", bd, bd.remainder(BigDecimal.valueOf(24))));
            System.out.println(String.format("Duration.ofHours(1).toMills()*(%s%%24) = %s*%s = %s = %s (rounded)",
                    bd, Duration.ofHours(1).toMillis(), bd.remainder(BigDecimal.valueOf(24))
                    ,bd.remainder(BigDecimal.valueOf(24)).multiply(BigDecimal.valueOf(Duration.ofHours(1).toMillis()))
                    ,bd.remainder(BigDecimal.valueOf(24)).multiply(BigDecimal.valueOf(Duration.ofHours(1).toMillis())).setScale(0, RoundingMode.HALF_UP).longValueExact()));
        }



    }
}
