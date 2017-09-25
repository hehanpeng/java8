package com.tanlan.java8s4.collection;

import java.util.*;

class Dept implements Comparable<Dept> {
    String name;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Dept) {
            return name.equals(((Dept) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public int compareTo(Dept o) {
        return name.compareTo(o.name);
    }
}

/*
* 保存不重复的元素
* 顺序不能保证
* HashSet 不保证顺序
* LinkedHashSet 可以维护顺序
* TreeSet
* */
public class SetDemo {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Tom");
        names.add("Jack");
        names.add("Rose");
        names.add("Tom");
        names.forEach(System.out::println);

        Set<Dept> depts = new HashSet<>();
        Dept d1 = new Dept();
        d1.name = "部门1";
        Dept d2 = new Dept();
        d2.name = "部门1";
        depts.add(d1);
        depts.add(d2);
        depts.forEach(dept -> System.out.println(dept.name));//重写equals和hashCode 方法


        LinkedHashSet<String> names2 = new LinkedHashSet<String>();
        names2.add("Tom");
        names2.add("Jack");
        names2.add("Rose");
        names2.forEach(System.out::println);

        TreeSet<String> names3 = new TreeSet<String>();//间接实现SortedSet接口，---存在排序 2种方式
        names3.add("Tom");
        names3.add("Jack");
        names3.add("Rose");
        names3.forEach(System.out::println);

        Dept d3 = new Dept();
        d3.name = "dept1";
        Dept d4 = new Dept();
        d4.name = "dept2";
        Dept d5 = new Dept();
        d5.name = "dept3";

        TreeSet<Dept> dept2 = new TreeSet<>(new MyDeptComparator());//2.传入比较器
        dept2.add(d5);
        dept2.add(d4);
        dept2.add(d3);
        dept2.forEach(dept -> System.out.println(dept.name));//解决报错 ---1.自然排序 需要实现Comparable接口 就可以实现排序
    }

    /*2.实现Comparable比较器接口*/
    static class MyDeptComparator implements Comparator<Dept> {

        @Override
        public int compare(Dept o1, Dept o2) {
            return -o1.name.compareTo(o2.name);//使用负号 反转顺序
        }

    }

}
