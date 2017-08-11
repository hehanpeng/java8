package com.tanlan.java8s4.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();//有序对象集合，可以重复，可以存储多个null
        nums.add(10);
        nums.add(4);
        nums.add(6);
        nums.add(2);
        nums.add(9);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        Collections.sort(nums);
        nums.forEach(System.out::println);

        System.out.println(Collections.binarySearch(nums, 4));
        System.out.println("-------------------");
        Collections.shuffle(nums);
        nums.forEach(System.out::println);
        System.out.println("-------------------");
        Collections.reverse(nums);
        nums.forEach(System.out::println);
        System.out.println("-------------------");
        Collections.swap(nums, 1, 3);
        nums.forEach(System.out::println);

        List<Integer> nums3 = Collections.checkedList(nums, Integer.class);

        List nums2 = nums3;
        //nums2.add("ssss");
//		for (Object object : nums2) {
//			
//		}

        List<String> name = Collections.singletonList("Tom");
        name.add("Jack");
    }
}
