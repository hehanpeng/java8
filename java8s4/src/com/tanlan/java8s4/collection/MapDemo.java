package com.tanlan.java8s4.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
*
* 包含键值对 一个键值对被称为条目（entry）
*
* 提供方法
* 基本操作
* size，isEmpty，containsKey, containsValue,get,getOrdefault,put,putIfAbsent,remove,replace
* 组操作
* clear,putAll,replaceAll
* 视图操作
* keySet,values,entrySet
* 比较操作
* equals，hashCode
* */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> m1 = new HashMap<String, String>();//HashMap  不保证顺序，使用LinkedHashMap 可以维护顺序
        /*
        * SortedMap 接口
        * 以有序的方式保存条目
        * 排序规则基于键的自然排序或Comparator 实例
        * TreeMap类实现了该接口
        * */
        m1.put("a", "Acde");
        m1.put(null, "Bcdfe");//允许一个null 键和多个null值
        m1.put("b", "Bcdf1e");

        //遍历1
        System.out.println("----------------------");
        Set<String> keys = m1.keySet();
        keys.forEach(key -> {
            System.out.println(m1.get(key));
        });

        //遍历2
        System.out.println("-----------------");
        m1.values().forEach(v -> System.out.println(v));

        //遍历3
        System.out.println("-------------");
        Set<Entry<String, String>> entries = m1.entrySet();
        entries.forEach(e -> System.out.println(e.getKey() + "-" + e.getValue()));

        //遍历4
        System.out.println("--------------");
        m1.forEach((k, v) -> System.out.println(k + "," + v));
    }
}
