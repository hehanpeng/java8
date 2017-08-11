package com.tanlan.java8s3.lambda;

import java.util.function.Consumer;

/*
* continue 和 break 在lambda中的语法
*
*
* */
public class JumpDemo {

    public static void main(String[] args) {
        Consumer<int[]> c = ids -> {
            int count = 0;
            for (int id : ids) {
                if (id % 2 == 0) {
                    System.out.println(id);
                    count++;
                    continue;
                }
                if (count == 3) {
                    break;
                }
            }
        };

        c.accept(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        //lambda里面用continue和break 控制外面的循环，是非法的
        for (int i = 0; i < 3; i++) {
            Consumer<Integer> c1 = id -> {
                System.out.println(id);
                if (id == 1) {
                    //continue;
                }
            };
            c1.accept(1);
        }
    }
}
