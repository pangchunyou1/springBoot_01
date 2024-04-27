package com.atguigu.springBoot.test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        indexAndPrint(new int[]{-1, 2, 1, -4}, 1);
        indexAndPrint(new int[]{0, 0, 0}, 1);
        indexAndPrint(new int[]{1, 2, 3, 4, 5}, 1);
        indexAndPrint(new int[]{1, 2, 3, 4, 5}, 5);
        indexAndPrint(new int[]{-1, 2, 1, -1}, 0);
    }

    public static void indexAndPrint(int[] nums, int target) {
        //定义距离目标数最小的数
        int num1 = 0;
        //定义集合最小数的下标索引
        int index = 0;
        //定义数组内最小的元素
        Integer min = null;
        //定义计算绝对值的集合
        ArrayList<Integer> integersAbs = new ArrayList<>();
        //定义集合，把数组内的元素转移到集合里面
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }
        for (int i = 0; i < 3; i++) {
            //循环遍历集合，给绝对值集合赋值
            for (int j = 0; j < integers.size(); j++) {
                integersAbs.add(Math.abs(integers.get(j) - target));
            }
            //赋值min一个默认值
            min = integersAbs.get(0);
            //遍历绝对值集合，获取最小值num1元素的下标
            for (int j = 1; j < integersAbs.size(); j++) {
                if (integersAbs.get(j) < min) {
                    min = integersAbs.get(j);
                    index = j;
                }
            }
            //获取最小数并做加法运算
            num1 += integers.get(index);
            //把集合内第一个最小数移除
            integers.remove(index);
            //清空绝对值集合
            integersAbs.clear();
            //赋予默认值
            index = 0;
        }
        System.out.println("num1 = " + num1);
    }
}



