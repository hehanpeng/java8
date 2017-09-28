package com.tanlan.java8s4.stream;

import com.tanlan.java8s4.stream.Person.Gender;

import java.util.Optional;

/*
* Optional 是一个容器，其中的值可能是空值
* 实例化
* empty、of、ofNumable
* 类似的类
* OptionalDouble、OptionalInt、OptionalLong
* 相关方法
* isPresent：包含null，返回false，否则，返回true
* get：包含null，跑出异常，否则，返回包含的值
* orElse：包含null，返回默认值，否则返回包含的值
* orElseGet：包含null，返回Supplier 返回值，否则返回包含的值
* orElseThrow：包含null，返回Supplier返回的异常，否则返回包含的值
* */
public class Optionaldemo {
	public static void main(String[] args) {
		Person p = new Person(1, "Tom", 4000, null, Gender.MALE);
		// int year=p.getBirthDate().getYear();   空指针异常！！！
		// System.out.println(year);

		Optional<String> o1 = Optional.ofNullable("");
		System.out.println(o1.orElse("default"));
		if (o1.isPresent()) {
			System.out.println(o1.get());
		}
	}
}
