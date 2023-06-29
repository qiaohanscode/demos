import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String path = System.getenv("PATH");
        System.out.println("PATH:" + path);
        String user_home = System.getProperty("user.home");
        System.out.println("user.home"+ user_home);
        System.out.println("Integer.BYTES: " + Integer.BYTES);
        System.out.println("Long.BYTES: " + Long.BYTES);
        System.out.println("Long.SIZE: " + Long.SIZE);
        System.out.println("Float.BYTES: " + Float.BYTES);
        System.out.println("Float.SIZE: " + Float.SIZE);
        System.out.println("Double.BYTES: " + Double.TYPE);
        System.out.println("Double.SIZE: " + Double.SIZE);
        Double doubleValue = 3.1415926;
        System.out.println("doubleValue.getClass() : " + doubleValue.getClass() );
        System.out.println("doubleValue : " + doubleValue);
        System.out.println("double.doubleValue() : " + doubleValue.doubleValue());
        BigDecimal bdDoubleFromDouble = new BigDecimal(doubleValue);
        System.out.println("bdDoubleFromDouble : " + bdDoubleFromDouble.toString());
        BigDecimal bdDoubleFromDoubleToString = new BigDecimal(doubleValue.toString());
        System.out.println("bdDoubleFromDoubleToString : " + bdDoubleFromDoubleToString.toString());
        Float floatValue = 0.12345f;
        BigDecimal bdFloatFromFloatToString = new BigDecimal(floatValue.toString());
        System.out.println("bdFloatFromFloatToString : " + bdFloatFromFloatToString.toString());

        BigDecimal bdFloatFromValueOf = BigDecimal.valueOf(floatValue);
        System.out.println("bdFloatFromValueOf : " + bdFloatFromValueOf.toString());

        float primitiveFloatValue = 12.341256f;
        BigDecimal bdFloatFromValueOfWithPrimitiveFloatValue = BigDecimal.valueOf(primitiveFloatValue);
        System.out.println("bdFloatFromValueOfWithPrimitiveFloatValue : " + bdFloatFromValueOfWithPrimitiveFloatValue);

        double primitiveDoubleValue = 13.451321d;
        BigDecimal bdDoubleFromValueOfWithPrimitiveDoubleValue = BigDecimal.valueOf(primitiveDoubleValue);
        System.out.println("bdDoubleFromValueOfWithPrimitiveDoubleValue : " + bdDoubleFromValueOfWithPrimitiveDoubleValue);

        BigDecimal bdFromDouble = new BigDecimal(0.1d);
        System.out.println("bdFromDouble.toString(): " + bdFromDouble.toString());

        BigDecimal bdFromFloat = new BigDecimal(0.22f);
        System.out.println("bdFromFloat : " + bdFromFloat.toString());

        BigDecimal bdFromString = new BigDecimal("0.1");
        BigDecimal bdFromCharArray = new BigDecimal(new char[] {'3','.','1','6','1','5'});
        BigDecimal bdlFromInt = new BigDecimal(42);
        BigDecimal bdFromLong = new BigDecimal(123412345678901L);
        BigInteger bigInteger = BigInteger.probablePrime(100, new Random());
        BigDecimal bdFromBigInteger = new BigDecimal(bigInteger);

        System.out.println("bdFromString() -- 0.1 : "+ bdFromString.toString());
        System.out.println("bdFromCahrArray -- 3.1615 : " + bdFromCharArray.toString());
        System.out.println("dblFromInt -- 42 : " + bdlFromInt.toString());
        System.out.println ("bdFromLong -- 123412345678901 : "+bdFromLong.toString());
        System.out.println("bdFromBigInteger -- " + bigInteger.toString() + ": "+bdFromBigInteger.toString());
    }
}
