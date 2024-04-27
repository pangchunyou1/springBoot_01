package com.atguigu.springBoot.test;

import java.util.ArrayList;

public class Test2 {
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
        int num2 = 0;
        int num3 = 0;

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
        //循环遍历集合，给绝对值集合赋值
        for (int i = 0; i < integers.size(); i++) {
            integersAbs.add(Math.abs(integers.get(i) - target));
        }
        //赋值min一个默认值
        min = integersAbs.get(0);
        //遍历绝对值集合，获取最小值num1元素的下标
        for (int i = 1; i < integersAbs.size(); i++) {
            if (integersAbs.get(i) < min) {
                min = integersAbs.get(i);
                index = i;
            }
        }
        //获取第一最小数
        num1 = integers.get(index);
        //把集合内第一个最小数移除
        integers.remove(index);
        //清空绝对值集合
        integersAbs.clear();

        //遍历集合，给绝对值集合重新赋值
        for (int i = 0; i < integers.size(); i++) {
            integersAbs.add(Math.abs(integers.get(i) - target));
        }
        //赋值min一个默认值
        min = integersAbs.get(0);
        index = 0;
        //遍历绝对值集合，获取最小值num2元素的下标
        for (int i = 1; i < integersAbs.size(); i++) {
            if (integersAbs.get(i) < min) {
                min = integersAbs.get(i);
                index = i;
            }
        }
        //获取第二最小数
        num2 = integers.get(index);
        //把集合内第二个最小数移除
        integers.remove(index);
        //清空绝对值集合
        integersAbs.clear();

        //遍历集合，给绝对值集合重新赋值
        for (int i = 0; i < integers.size(); i++) {
            integersAbs.add(Math.abs(integers.get(i) - target));
        }

        //赋值min一个默认值
        min = integersAbs.get(0);
        index = 0;

        //进行判断集合是否只剩下一个元素
        if (integersAbs.size() > 1) {
            //遍历绝对值集合，获取最小值num2元素的下标
            for (int i = 1; i < integersAbs.size(); i++) {
                if (integersAbs.get(i) < min) {
                    min = integersAbs.get(i);
                    index = i;
                }
            }
            System.out.println("integersAbs.size() = " + integersAbs.size());
            System.out.println("integers.size() = " + integers.size());
            //获取第s三最小数
            System.out.println("index = " + index);
            num3 = integers.get(index);
        } else {
            num3 = integers.get(index);
        }


        System.out.println("num1:");
        System.out.println(num1);
        System.out.println("num2:");
        System.out.println(num2);
        System.out.println("num3:");
        System.out.println(num3);
    }

}