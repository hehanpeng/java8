package com.tanlan.java8s4.stream;

import com.tanlan.java8s4.stream.Person.Gender;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* 数据分组
* 特例：
* 数据分区
* 是分组的特例，只有两组数据
* 使用Collectors的partitioningBy方法
* 使用参数：
* Predicate
* */
public class GroupDemo {

    public static void main(String[] args) {
        Map<Gender, List<Person>> r = Person.persons().stream()
                .collect(Collectors.groupingBy(Person::getGender));
        r.forEach((g, ps) -> {
            System.out.println(g);
            ps.forEach(System.out::println);
        });

        Map<Boolean, List<Person>> r1 = Person.persons().stream()
                .collect(Collectors.partitioningBy(Person::isMale));//分为两组
        r1.forEach((g, ps) -> {
            System.out.println(g);
            ps.forEach(System.out::println);
        });
    }

}
