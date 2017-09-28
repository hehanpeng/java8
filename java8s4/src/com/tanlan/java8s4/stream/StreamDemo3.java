package com.tanlan.java8s4.stream;

import java.util.Optional;
import java.util.stream.Stream;


/*
* Stream 提供的方法（1）
* 方法     类型   描述
* peek     中间   返回包含流元素的流，主要用于调试目的 不会对原先的流有影响
* foreach  最终   对每个元素执行特定的操作
* map      中间   返回对元素进行运算之后结果的流，一对一
* filter   中间   根据条件过虑元素
* distinct 中间   去掉重复元素
* limit    中间   限制元素的数量
* skip     中间   丢弃前面一定数量的元素
* sorted   中间   按照自然排序或比较器排序元素
* reduce   最终   从流中计算出单个值
* */
public class StreamDemo3 {

	public static void main(String[] args) {
		// int num = Stream.of(1, 2, 3, 4, 5).peek(n ->
		// System.out.println("one:"+n))
		// .filter(n -> n % 2 == 1).peek(n -> System.out.println("two:"+n))
		// .reduce(0, Integer::sum);  初始值0 累加
		// System.out.println(num);

		// Person.persons().stream().forEach(p->System.out.println(p.getName()));
		// Person.persons().stream().forEach(System.out::println);

		// Person.persons().stream().map(Person::getName).forEach(System.out::println);
		// IntStream.range(1, 5).map(n -> n * n).forEach(System.out::println);

		// Person.persons().stream().filter(Person::isMale).map(Person::getName)
		// .forEach(System.out::println);
		// Person.persons().stream().filter(p->p.getIncome()>5000).map(Person::getName)
		// .forEach(System.out::println);

		Stream.of(4, 2, 3, 2, 3, 5, 1).distinct().sorted()
				.forEach(System.out::println);

		double sum = Person.persons().stream().map(Person::getIncome)
				.reduce(0D, Double::sum);

		Optional<Double> sum2 = Person.persons().stream()
				.map(Person::getIncome).reduce(Double::sum);
		if(sum2.isPresent()){
			System.out.println(sum2.get());
		}
		System.out.println(sum);
	}

}
