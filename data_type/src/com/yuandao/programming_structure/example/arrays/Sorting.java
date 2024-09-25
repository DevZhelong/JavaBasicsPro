package com.yuandao.programming_structure.example.arrays;

import java.util.Arrays;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 3:26 PM
 * @Study 数组排序
 */
public class Sorting {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
