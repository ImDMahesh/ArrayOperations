package com.m2s.Java8Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class SteamsEx {
    public static int transform(int e) {
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        return e*1;
    }
    public static void use(Stream<Integer> stream){
        stream.parallel()
        .map(e-> transform(e))
                .forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3 ,4,5,6,7,8,9,10);
        //find the total of double of even numbers
        int total = 0;
        for(int num:numbers){
            if(num%2==0)
            {
                total += num * 2;
            }
        }
        System.out.println(total);
        System.out.println(
                numbers.stream()
                        .filter(e -> e % 2 ==0)
                        .mapToInt(e-> e * 2)
                        .sum()
        );
        use(numbers.stream());
    }
}
