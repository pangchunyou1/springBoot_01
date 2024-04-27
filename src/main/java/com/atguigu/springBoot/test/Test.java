package com.atguigu.springBoot.test;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        indexAndPrint(new int[]{-1, 2, 1, -4}, 1);
        indexAndPrint(new int[]{0, 0, 0}, 1);
        indexAndPrint(new int[]{1, 2, 3, 4, 5}, 1);
        indexAndPrint(new int[]{1, 2, 3, 4, 5}, 5);
        indexAndPrint(new int[]{-1, 2, 1, -1}, 0);
    }

    public static void indexAndPrint(int[] nums, int target) {

        //定义数组元素减目标数后的绝对值的数组
        int[] ints = new int[nums.length];
        int[] ints2 = new int[nums.length - 1];
        int[] ints3 = new int[nums.length - 2];

        //定义数组2、数组3，以求第二、第三个最小数
        int[] nums2 = new int[nums.length - 1];
        int[] nums3 = new int[nums.length - 2];

        //定义距离目标数最小的数
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //定义数组最小数的下标索引
        int index = 0;

        //定义第二、第三数组的临时下标索引
        int temIndex2 = 0;
        int temIndex3 = 0;

        //定义数组内最小的元素
        int min = ints[0];
        //循环遍历原数组，给绝对值数组赋值
        for (int i = 0; i < nums.length; i++) {
            ints[i] = Math.abs(nums[0] - target);
        }
        //遍历绝对值数组，获取num1元素的下标
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
                index = i;
            }
        }
        //获取第一最小数
        num1 = nums[index];

        //遍历原数组，给第二个数组赋值
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != num1) {
                nums2[temIndex2] = nums[i];
            }
        }
        //循环遍历第二数组，给第二绝对值数组赋值
        for (int i = 0; i < nums2.length; i++) {
            ints2[i] = Math.abs(nums2[0] - target);
        }

        //定义第二数组内最小的元素
        min = ints2[0];
        //遍历第二绝对值数组，获取num2元素的下标
        for (int i = 1; i < ints2.length; i++) {
            if (ints2[i] < min) {
                min = ints2[i];
                index = i;
            }
        }
        //获取第二最小数
        num2 = nums2[index];

        //遍历第二数组，给第三个数组赋值
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != num2) {
                nums3[temIndex3] = nums2[i];
            }
        }
        //循环遍历第二数组，给第二绝对值数组赋值
        for (int i = 0; i < nums2.length; i++) {
            ints2[i] = Math.abs(nums2[0] - target);
        }

        //定义第二数组内最小的元素
        min = ints2[0];
        //遍历第二绝对值数组，获取num2元素的下标
        for (int i = 1; i < ints2.length; i++) {
            if (ints2[i] < min) {
                min = ints2[i];
                index = i;
            }
        }
        //获取第二最小数
        num2 = nums2[index];

    }
}