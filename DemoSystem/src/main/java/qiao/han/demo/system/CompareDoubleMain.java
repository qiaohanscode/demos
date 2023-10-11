package qiao.han.demo.system;

public class CompareDoubleMain {

    public static void main(String[] args) {
        Double d1 = 0d;
        System.out.println("original d1:"+d1);
        for (int i = 0; i < 8; i++) {
            d1 = d1 + Double.valueOf(0.1d);
            System.out.println("d1+0.1d="+d1);
        }
        System.out.println("Double d1:" + d1);

        Double d2 = 0.1d*8d;
        System.out.println("Double d2=0.1d*8d:"+d2);

        var rsltCompare = d1.compareTo(d2);
        System.out.println("d1.compareTo(d2):" + rsltCompare);

        Double d3 = 0d;
        System.out.println("d3:"+d3);
        for (int i = 0; i < 100; i++) {
            Double temp = Double.valueOf(d3);
            d3 = d3 + 0.1d;
            System.out.println(String.format("%s + 0.1d = %s",temp,d3));
        }
        System.out.println("Double d3:" + d3);

        var d3d2 = d3.compareTo(d2);
        System.out.println(String.format("%s.compareTo(%s) = %s", d3,d2,d3d2));
        System.out.println(String.format("%s.compareTo(10.0d) = %s",d3,d3.compareTo(10.0d)));

        Double d4 = 0d;
        System.out.println("d4:"+d4);
        Double d5 = 0.00d;
        System.out.println("d5:"+d5);
        var d4d5= d4.compareTo(d5);
        System.out.println(String.format("%s.compareTo(%s) = %s", d4,d5,d4d5));

        Double d6 = 0.0000d;
        var d4d6 = d4.compareTo(d6);
        System.out.println("d4.compareTo(d6):"+d4d6);

        var d5d6 = d5.compareTo(d6);
        System.out.println("d5.compareTo(d6):" + d5d6);

        Double d7 = -0.000d;
        System.out.println("d7:"+d7);
        var d5d7 = d5.compareTo(d7);
        System.out.println(String.format("%s.compareTo(%s) = %s",d5,d7,d5d7));

        Double d8 = 0.22d;
        Double d9 = 0.44d;
        Double d10 = d8 + d9;
        Double d11 = 0.66d;
        var d10d11 = d10.compareTo(d11);
        System.out.println("(0.22d+0.44d).compareTo(0.66d):" + d10d11);

    }
}
