package com.tanlan.java8s3.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface ToInt<T> {
    int convert(T t);
}

@FunctionalInterface
interface Interface3 {
    <T> T m(T t);
}

class MyClass3 {
    static <T> T n(T t) {
        return t;
    }
}

//方法引用   <限定>::<方法名>


/*
* 方法引用类型
* TypeName::staticMethod
* objectRef::instanceMethod 特定对象的实例方法
* ClassName::instanceMethod 类的任意对象的实例方法
* TypeName.super::instanceMethod 特定对象的超类的实例方法
* ClassName::new 类的构造方法
* ArrayTypeName:new 数组的构造方法
*
*
* 函数式编程
* 充分利用多核并行处理
* 代码简洁易读
* */
public class TestMethodRef {

    public static void main(String[] args) {
        ToInt<String> t1 = Integer::parseInt;//传入java中已有的方法，---方法引用
        //System.out.println(t1.convert("123"));

        Supplier<Integer> s1 = "Jack"::length;
        System.out.println(s1.get());

        Consumer<String> s2 = System.out::print;

        Function<String, Integer> f1 = String::length;
        System.out.println(f1.apply("Rose and Jack"));

        Son son = new Son();
        son.m();

        Supplier<Son> son1 = Son::new;
        Son s = son1.get();

        Function<String, Son> fun1 = Son::new;
        Son son2 = fun1.apply("张武");

        Function<Integer, int[]> fun2 = int[]::new;
        int[] nums = fun2.apply(5);

        Function<Integer, int[]> fun3 = size -> new int[size];

        Interface3 i3 = MyClass3::n;
        System.out.println(i3.m("泛型方法"));
    }

}

class Parent {
    private String name = "张三";

    String getName() {
        return name;
    }
}

class Son extends Parent {
    private String name = "张四";

    public Son() {

    }

    public Son(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void m() {
        Supplier<String> s1 = this::getName;
        Supplier<String> s2 = Son.super::getName;
        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
