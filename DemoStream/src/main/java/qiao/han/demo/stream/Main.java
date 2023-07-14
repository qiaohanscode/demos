package qiao.han.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[]  args){
        peek();
        takeWhileInt();
        takeWhileStr();
        limit();
        skip();
        distinct();
        dropWhileInt();
    }


    private static void skip() {
        System.out.println("---------------skip()--------------------");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        List<Integer> rst = stream.skip(3).collect(Collectors.toList());
        System.out.println(rst);
        System.out.println("--------------- skip()--------------------");
    }

    private static void limit() {
        System.out.println("---------------limit()--------------------");
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        List<Integer> rst = stream.limit(3).collect(Collectors.toList());
        System.out.println(rst);
        System.out.println("---------------limit()--------------------");
    }

    private static void takeWhileInt() {
        System.out.println("---------------takeWhileInt()--------------------");
        Stream<Integer> stream = Stream.of(3,4,5,6,7,8);
        List<Integer> list = stream
                            .peek(e -> System.out.println("processing element: " + e))
                            .takeWhile(n -> (n%4 ==0))
                            .peek(e -> System.out.println("matched element: " + e))
                            .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("---------------takeWhileInt()--------------------");
    }

    private static void dropWhileInt() {
        System.out.println("---------------dropWhileInt()--------------------");
        Stream<Integer> stream = Stream.of(3,4,5,6,7,8);
        List<Integer> list = stream
                .peek(e -> System.out.println("processing element: " + e))
                .dropWhile(n -> (n%4 ==0))
                .peek(e -> System.out.println("matched element: " + e))
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("--------------------");

        list = Stream.of(4,5,6,7,8)
                .peek(e -> System.out.println("processing element: " + e))
                .dropWhile(n -> (n%4 ==0))
                .peek(e -> System.out.println("matched element: " + e))
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("---------------dropWhileInt()--------------------");
    }

    private static void takeWhileStr() {
        System.out.println("---------------takeWhileStr()--------------------");
        Stream<String> streamStr = Stream.of("abs","bsa","taas","tttnnn","tttaa");
        List<String> listStr = streamStr
                                .peek(e -> System.out.println("processing elements:" + e))
                                .takeWhile(e -> e.contains("a"))
                                .peek(e -> System.out.println("matched element: " +e))
                                .collect(Collectors.toList());

        System.out.println(listStr);
        System.out.println("---------------takeWhileStr()--------------------");
    }

    private static void distinct() {
        System.out.println("---------------distinct()--------------------");
        Stream<String> streamStr = Stream.of("abs","bsa","taas","abs","bsa","tttnnn","tttaa");
        List<String> listStr = streamStr
                .peek(e -> System.out.println("processing elements:" + e))
                .distinct()
                .peek(e -> System.out.println("matched element: " +e))
                .collect(Collectors.toList());

        System.out.println(listStr);
        System.out.println("---------------distinct()--------------------");
    }

    private static void peek() {
        System.out.println("---------------peek()--------------------");
        var result = Stream.of("1","22","333","4444","55555")
                        .filter(e->e.length()>=2)
                        .peek(e->System.out.println("Filtered value: " + e));
//                        .map(String::toUpperCase)
//                        .peek(e->System.out.println("Mapped value: " + e))
//                        .collect(Collectors.toList());

        System.out.println("Break");
        var st = result.map(String::toUpperCase)
                            .peek(e->System.out.println("Mapped value: " + e))
                            .collect(Collectors.toList());
        st.forEach(e ->System.out.println("Element : " + e));

        System.out.println("End ");
        System.out.println("---------------peek()--------------------");
    }
}
