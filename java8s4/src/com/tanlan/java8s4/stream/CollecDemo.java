package com.tanlan.java8s4.stream;

import java.util.*;
import java.util.stream.Collectors;

/*
* 在Stream上进行数据收集操作
* Collect接口与Collectors类
* Stream提供的方法（2）
* collect 最终  将Stream中的元素收集到集合或者合适的容器中
* */
public class CollecDemo {

    public static void main(String[] args) {
        List<String> names = Person.persons().stream().map(Person::getName)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(names);

        List<String> names1 = Person.persons().stream().map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(names1);

        Set<String> names2 = Person.persons().stream().map(Person::getName)
                .collect(Collectors.toSet());
        System.out.println(names2);

        SortedSet<String> names3 = Person.persons().stream()
                .map(Person::getName)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(names3);
        long num = Person.persons().stream().map(Person::getName)
                .collect(Collectors.counting());
        System.out.println(num);

        Map<Integer, String> map1 = Person.persons().stream()
                .collect(Collectors.toMap(Person::getId, Person::getName));
        System.out.println(map1);

        String s = Person.persons().stream().map(Person::getName)
                .collect(Collectors.joining(","));
        System.out.println(s);
    }
}
