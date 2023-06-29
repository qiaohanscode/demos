package qiao.han.demo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){

         int[] arrayInt = {1,2,3};
         // Index 4 out of bounds for length , ArrayIndexOutofBoundsException
         // arrayInt[4] = 4;
         System.out.println(String.format("arrayInt: %s", Arrays.toString(arrayInt)));

         String[] arrayStr = {"ab","cd","ef"};
         System.out.println("class name arrayStr "+arrayStr.getClass().getName());

         Integer[] arrayInteger = {1,2,3};
         System.out.println("class name arrayInteger " + arrayInteger.getClass().getName());

         System.out.println("--------- Array to Collection -------------");
         //Collections.addAll()
         String countryArray[] = { "India", "Pakistan", "Afganistan","Srilanka" };
         List<String> countryList = new ArrayList<>();
         Collections.addAll(countryList, countryArray);
         System.out.println("Collections.addAll() " + countryList);

         //List.of
         var countryListWithListOf = List.of(countryArray);
         System.out.println("List.of : " + countryListWithListOf);

         //Arrays.stream(T[])
         var countListWithArrayStream = Arrays.stream(countryArray).collect(Collectors.toList());
         System.out.println("Arrays.stream()" + countListWithArrayStream);

         //Arrays.asList(T...)
         var countryListWithArraysAsList = Arrays.asList(countryArray);
         System.out.println("Arrays.asList()" + countryListWithArraysAsList);

         System.out.println("----------- Collection to Array ------------------");
         var convertedArray = countryList.toArray();
         System.out.println("Collections.toArray()" + Arrays.toString(convertedArray));

         var arrayFromStreamToArray = countryList.stream().toArray();
         System.out.println("Stream.toArray()" + Arrays.toString(arrayFromStreamToArray));
         var arrayFromStreamToArrayIntFunction = countryList.stream().toArray(String[]::new);
         System.out.println("Stream.toArray(intFunction<T[]>"+ Arrays.toString(arrayFromStreamToArrayIntFunction));
    }
}
