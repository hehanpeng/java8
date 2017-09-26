package com.tanlan.java8s4.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
* Collections 类
* 对集合数据的操作
* 转换集合
* 产生特殊集合
* 工具类
* 排序 查询 其他操作
* */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();//有序对象集合，可以重复，可以存储多个null
        nums.add(10);//自动装箱
        nums.add(4);
        nums.add(6);
        nums.add(2);
        nums.add(9);

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        //排序
        Collections.sort(nums);
        nums.forEach(System.out::println);

        //二分查找,前提:应该先排好序
        System.out.println(Collections.binarySearch(nums, 4));
        System.out.println("-------------------");
        //打乱list
        Collections.shuffle(nums);
        nums.forEach(System.out::println);
        System.out.println("-------------------");
        //lis反转
        Collections.reverse(nums);
        nums.forEach(System.out::println);
        System.out.println("-------------------");
        //交换
        Collections.swap(nums, 1, 3);
        nums.forEach(System.out::println);

        /*
        * 转换集合
        * unmodifiableXxx:转换为只读集合
        * synchronizedXxx:转换为同步集合（线程安全）
        * checkedXxx:转换为受检集合
        * */

        //受检集合 可以将集合的异常控制在add处，无法insert
        List<Integer> nums3 = Collections.checkedList(nums, Integer.class);

        List nums2 = nums3;
        //nums2.add("ssss"); nums2 任意加各种类型
//		for (Object object : nums2) {
//			
//		}   出现异常  ！！！

        /*
        * 产生特殊集合
        * emptyXxxx：产生空集合
        * singletonXxx: 产生单例集合
        * */
        List<String> name = Collections.singletonList("Tom");
        name.add("Jack");//不支持操作异常   只可存放一个元素
    }
}
