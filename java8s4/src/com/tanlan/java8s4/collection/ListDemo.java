package com.tanlan.java8s4.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class User {
    String name;

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

public class ListDemo {

    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        //使用带索引方法添加需要按照顺序
        names.add(0, "Tom");
        names.add(1, "Jack");
        names.add(2, "Rose");
        names.add(3, "Tim");

        System.out.println(names.indexOf("Tom"));

        System.out.println(names.contains("Tom"));

        names.forEach(System.out::println);

        System.out.println(names.lastIndexOf("Tom"));

        //截取子串
        names.subList(1, 3).forEach(System.out::println);

        ListIterator<String> iter = names.listIterator();
        //顺序遍历
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("---------------");
        //倒序遍历
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }

        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.name = "Tom";
        User u2 = new User();
        u2.name = "Tom";
        users.add(u1);
        System.out.println(users.contains(u2));//重写equals 使判定通过
    }
}
