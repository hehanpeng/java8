package com.tanlan.java8s4.collection;

import java.util.*;

class Person {// implements Comparable<Person>{
    String name;

    public String getName() {
        return this.name;
    }

//	@Override
//	public int compareTo(Person o) {
//		// TODO Auto-generated method stub
//		return name.compareTo(o.name);
//	}
}

/*
*
* 队列
* */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> s1 = new LinkedList<>();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.offer("d");// offer 方法 与add类似  ，对于定长的队列 add会抛异常 offer返回false（不抛出异常）
        System.out.println(s1);

        while (s1.peek() != null) {// 取队列中第一个元素
            //System.out.println(s1.peek());
            System.out.println(s1.element());//与peek类似 （不抛出异常）
            //s1.remove();移除第一个元素
            s1.poll();//poll与remove类似，（不抛出异常）
            System.out.println(s1);
        }

        Queue<Person> s2 = new PriorityQueue<Person>();//优先队列

        Person p1 = new Person();
        p1.name = "Tom";
        Person p2 = new Person();
        p2.name = "Jack";
        Person p3 = new Person();
        p3.name = "Rose";

//		s2.add(p1);
//		s2.add(p2);
//		s2.add(p3);
//		
////		System.out.println(s2);  没有实现Comparable<Person> 接口 会报错
//		while(s2.peek()!=null){
//			Person p=s2.peek();
//			System.out.println(p.name);
//			s2.remove();
//		}


        System.out.println("-----------------");
        Queue<Person> s3 = new PriorityQueue<Person>(Comparator.comparing(Person::getName));//传入比较器
        s3.add(p1);
        s3.add(p2);
        s3.add(p3);
        while (s3.peek() != null) {
            Person p = s3.peek();
            System.out.println(p.name);
            s3.remove();
        }
        System.out.println("-------------------");
        /*
        * 双端队列
        * */
        Deque<String> s4 = new LinkedList<>();
        //s4.add...
        //s4.peek...
    }
}
