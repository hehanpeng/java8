package com.tanlan.java8s4.stream;

/*
* 查找与匹配元素
* Stream提供的方法（3）
* allMatch   最终   返回是否所有的元素都满足给定的条件
* anyMatch   最终   返回是否有任意一个元素满足给定的条件
* nonematch  最终   返回是否没有元素满足给定的条件
* findAny    最终   返回任意一个元素，Stream为空则返回空的Optional
* findFirst  最终   返回第一个元素，Stream为空则返回空的Optional
* 它们都是短路的最终操作
* IntStream,DoubleStream,LongStream 也有类似的方法
*
* 并行Stream
* 并行Stream上的操作会使用多个线程
* 在多核CPU或多CPU上有性能优势
* */
public class MatchDemo {
    public static void main(String[] args) {
        boolean b1 = Person.persons().stream().allMatch(Person::isMale);
        System.out.println(b1);

        boolean b2 = Person.persons().stream()
                .anyMatch(p -> p.getBirthDate().getYear() == 1990);
        System.out.println(b2);

        boolean b3 = Person.persons().stream()
                .noneMatch(p -> p.getIncome() > 6000);
        System.out.println(b3);
    }
}