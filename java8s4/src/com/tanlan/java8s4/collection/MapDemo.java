package com.tanlan.java8s4.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("a", "Acde");
		m1.put(null, "Bcdfe");
		m1.put("b", "Bcdf1e");

		System.out.println("----------------------");
		Set<String> keys = m1.keySet();
		keys.forEach(key -> {
			System.out.println(m1.get(key));
		});

		System.out.println("-----------------");
		m1.values().forEach(v -> System.out.println(v));

		System.out.println("-------------");
		Set<Entry<String, String>> entries = m1.entrySet();
		entries.forEach(e->System.out.println(e.getKey()+"-"+e.getValue()));
		
		System.out.println("--------------");
		m1.forEach((k,v)->System.out.println(k+","+v));
	}
}
