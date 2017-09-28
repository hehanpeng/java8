package com.tanlan.java8s4.stream;

import java.util.Optional;

/*
* 查找
*
* 并行Stream
* 并行Stream上的操作会使用多个线程
* 在多核CPU或多CPU上有性能优势
* 转换为并行Stream：
* --使用Collection中的parallelStream()方法
* --使用Stream中的parallel()
* 转换为串行Stream(默认)：
* --sequential()
* */
public class FindDemo {

    public static void main(String[] args) {
        Optional<Person> o1 = Person.persons().parallelStream().sequential()
                .findAny();
        if (o1.isPresent()) {
            Person p = o1.get();
            System.out.println(p);
        }

        Optional<Person> o2 = Person.persons().stream()
                .filter(Person::isFeMale).findFirst();
        if (o2.isPresent()) {
            System.out.println(o2.get());
        }
    }
}
