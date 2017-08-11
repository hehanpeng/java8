package com.tanlan.java8s3.lambda;

@FunctionalInterface
public interface FuncInterface<T> {
    T m(T t);

    //Object
    String toString();
}

@FunctionalInterface
interface FuncInterface1 {
    <T> T m(T t); //不能赋值给带有泛型方法的非泛型函数式接口类型的变量，需要使用方法引用或匿名内部类

    String toString();
}

//标记接口 里面没有任何成员，交集类型  标记接口与函数式接口连接
interface MarkerInterface {

}

class TestFunInterface {
    void test() {
        FuncInterface<String> f1 = s -> s + "abc";

        // FuncInterface1 f2 = s -> s + "abc";

        MarkerInterface mi = (MarkerInterface & FuncInterface) s -> s + "abc";//位运算 交集运算
    }
}
