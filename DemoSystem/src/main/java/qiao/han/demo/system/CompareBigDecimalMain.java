package qiao.han.demo.system;

import java.math.BigDecimal;

public class CompareBigDecimalMain {

    public static void main(String[] args){
        BigDecimal d1 = BigDecimal.valueOf(0.00d);
        BigDecimal d2 = BigDecimal.valueOf(0l);

        for(int i=0;i<100;i++){
            BigDecimal temp = BigDecimal.valueOf(d1.doubleValue());
            BigDecimal operand = BigDecimal.valueOf(0.001);
            d1 = BigDecimal.valueOf(d1.add(operand).longValue(),2);
            d2 = d2.add(operand);
            System.out.print(String.format("scale 2: %s + %s = %s   ",temp.toString(),operand.toString(),d1.toString()));
            System.out.println(String.format("scale 3: %s + %s = %s", temp.toString(),operand.toString(),d2.toString()));
        }

        BigDecimal d3 = BigDecimal.valueOf(-0.00d);
        BigDecimal d4 = BigDecimal.valueOf(0.00d);
        System.out.println(String.format("%s.compareTo(%s):%s",d3,d4,d3.compareTo(d4)));


    }
}
