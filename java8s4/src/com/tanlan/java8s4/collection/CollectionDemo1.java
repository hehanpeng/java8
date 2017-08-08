package com.tanlan.java8s4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection<String> c1=new ArrayList<>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		System.out.println(c1.size());
		Iterator<String> iter=c1.iterator();
		while(iter.hasNext()){
			//System.out.println(iter.next());
			iter.next();
			//iter.remove();
		}
		System.out.println(c1.size());
		System.out.println("---------------");
		for (String s : c1) {
			//c1.remove(s);
			System.out.println(s);
		}
		System.out.println("---------------");
		//c1.forEach(s->System.out.println(s));
		c1.forEach(System.out::println);
	}

}
