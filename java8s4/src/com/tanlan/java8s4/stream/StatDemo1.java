package com.tanlan.java8s4.stream;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

/*
* 获取Stream中的统计信息
* 对流中的元素分组和分区
* Collectors中的统计方法
* summarizingDouble、summarizingInt、summarizingLong
* counting(),summingXxx(),averagingXxx(),minBy(),maxBy()
*
* 相关统计类与方法
* LongSummaryStatistics
* IntSummaryStatistics
* DoubleSummaryStatistics
* 方法
* getXxx()
*
* 数据分组
* 按照不同的条件对于元素进行分组
* 使用Collectors的groupBy方法
* 通常提供两个参数
* --产生map中键的函数
* --在每一个与键关联的值上执行操作的Collector
* */
public class StatDemo1 {

    public static void main(String[] args) {
        double totalIncome = Person.persons().stream()
                .collect(Collectors.summingDouble(Person::getIncome));
        System.out.println(totalIncome);

        DoubleSummaryStatistics incomeStats = Person.persons().stream()
                .collect(Collectors.summarizingDouble(Person::getIncome));
        System.out.println(incomeStats.getMax());
    }

}
