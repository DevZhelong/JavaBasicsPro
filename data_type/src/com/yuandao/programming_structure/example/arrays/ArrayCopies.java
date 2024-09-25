package com.yuandao.programming_structure.example.arrays;

import java.util.Arrays;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 6:46 AM
 * @Study 数组拷贝
 */
public class ArrayCopies {
    public static void main(String[] args) {
        // 允许一个数组的变量拷贝到另一个数组。
        int[] luckyNumbers = {1, 2, 3, 4, 5};
        System.out.println(">>>原长度：" + luckyNumbers.length);

        // 第二个参数是新数组长度。
        int[] copiesLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
        System.out.println(Arrays.toString(copiesLuckyNumbers));

        // 这个方法通常用来增加数组的大小。
        luckyNumbers = Arrays.copyOf(luckyNumbers, 3 * luckyNumbers.length);
        System.out.println(">>>新长度：" + luckyNumbers.length);
    }
}
