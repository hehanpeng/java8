package com.tanlan.java8s4.stream;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
* 创建Stream的方式
* 来自：
* 值、空值、函数、数组、集合、文件、其他源
* */
public class StreamDemo2 {

    public static void main(String[] args) {
        //创建1
        Stream<String> s1 = Stream.of("Tom", "Jack", "Rose", "Tim");
        //创建2 使用构造器模式
        Stream<String> s2 = Stream.<String>builder().add("Jack").add("Tom").build();

        //BaseStream 子类 与Stream并列
        IntStream i1 = IntStream.range(1, 6).limit(1);//1-5 Stream (不包含6)
        i1.forEach(System.out::println);
        IntStream i2 = IntStream.rangeClosed(1, 6);//1-6 Stream (包含6)
        i2.forEach(System.out::println);

        //创建空Stream
        Stream<String> s3 = Stream.empty();
        IntStream i3 = IntStream.empty();
        System.out.println("------------------");

        //来自函数
        //Stream<Long> l1 = Stream.iterate(1L, n -> n + 1);1,2,3,4... 死循环
        //l1.limit(10).foreach(System.out::println); 限制死循环 1-10
        Stream<Long> l1 = Stream.iterate(0L, n -> n + 2);
        l1.limit(10).forEach(System.out::println);

        //generate 创建
        Stream.generate(Math::random).limit(5).forEach(System.out::println);


        Arrays.stream(new int[]{1, 2, 3, 4, 5});
        Arrays.stream(new String[]{"", ""});

        /*
        * 其他
        * CharSequence中chars()
        * Pattern中splitAsStream()
        * */
        "aaaa bbb".chars().forEach(System.out::println);//产生IntStream的Ascii码

        Pattern.compile(",").splitAsStream("abc,cde,fgr").forEach(System.out::println);
    }

}
