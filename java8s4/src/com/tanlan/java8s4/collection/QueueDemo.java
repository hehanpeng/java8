package com.tanlan.java8s4.collection;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Person{// implements Comparable<Person>{
	String name;
	
	public String getName(){
		return this.name;
	}

//	@Override
//	public int compareTo(Person o) {
//		// TODO Auto-generated method stub
//		return name.compareTo(o.name);
//	}
}

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> s1=new LinkedList<>();
		s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.offer("d");
		System.out.println(s1);
		
		while(s1.peek()!=null){
			//System.out.println(s1.peek());
			System.out.println(s1.element());
			//s1.remove();
			s1.poll();
			System.out.println(s1);
		}
		
		Queue<Person> s2=new PriorityQueue<Person>();
		
		Person p1=new Person();
		p1.name="Tom";
		Person p2=new Person();
		p2.name="Jack";
		Person p3=new Person();
		p3.name="Rose";
		
//		s2.add(p1);
//		s2.add(p2);
//		s2.add(p3);
//		
////		System.out.println(s2);
//		while(s2.peek()!=null){
//			Person p=s2.peek();
//			System.out.println(p.name);
//			s2.remove();
//		}
		System.out.println("-----------------");
		Queue<Person> s3=new PriorityQueue<Person>(Comparator.comparing(Person::getName));
		s3.add(p1);
		s3.add(p2);
		s3.add(p3);
		while(s3.peek()!=null){
			Person p=s3.peek();
			System.out.println(p.name);
			s3.remove();
		}
		System.out.println("-------------------");
		Deque<String> s4=new LinkedList<>();
		//s4.p
	}
}
