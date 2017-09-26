package com.tanlan.java8s4.stream;

import java.util.Arrays;
import java.util.List;

/*
* 聚合操作是指从一个值的集合中计算出一个单值的结果，该结果可能是基本数据类型，对象（单实体类或集合）或void
* stream是支持顺序或并行聚合操作的数据元素序列
* 特点：
* 无存储、可表示无限元素、基于内部迭代、支持并行处理、支持函数式编程、可以有序或无序、不可重用
* Datasource-> (filter->map) #中间操作，支持链式调用#  -> reduce #终结，出现最终结果#  java.util.stream
* */
public class StreamDemo1 {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(nums.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(Integer::sum).get());
    }

}
