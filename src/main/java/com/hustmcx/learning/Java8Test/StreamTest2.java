package com.hustmcx.learning.Java8Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void test01() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    public static void test02() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
    }

    public static void test03() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
    }

    public static void test04() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // 获取空字符串的数量
        long count = strings.stream().filter(string -> string.isEmpty()).count();
        System.out.println(count);
    }

    public static void test05() {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    public static void test06() {
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }

    public static void test07() {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        // 获取空字符串的数量
//        int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
        Stream stream =  strings.parallelStream().filter(string -> string.isEmpty());

        int count= (int) stream.count();
//        int count2= (int) stream.count();

//        Arrays.stream()
//        Stream.of()


        System.out.println(count);
    }

    public static void test08(){
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
    }

    public static void test09(){
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }

    public static void main(String[] args) {
//        test02();
//        test01();
//        test03();
//        test04();
//        test05();
//        test06();
        test07();
//        test08();
//        test09();
    }
}
