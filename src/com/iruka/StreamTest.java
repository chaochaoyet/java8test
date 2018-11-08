package com.iruka;

import java.util.*;
import java.util.stream.Collectors;
public class StreamTest {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        list.stream().filter(Objects::nonNull).forEach(System.out::println);
        //collect
        List<Integer> collect = list.stream().filter(n -> n > 3).collect(Collectors.toList());
        collect.stream().filter(obj -> obj % 2 == 0).forEach(System.out::println);
        //distinct
        List<Integer> squaresList = list.stream().map(obj -> obj * obj).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);
        //statistics
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt((obj) -> obj).summaryStatistics();
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getAverage());
    }
}
