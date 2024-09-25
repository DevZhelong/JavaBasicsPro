package com.yuandao.programming_structure.example.arrays;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 5:52 AM
 * @Study 数组声明
 */
public class ArraysDemo {
    public static void main(String[] args) {
        // 数组是一种数据结构，存储相同类型值的集合。
        // 声明数组
        int[] a; // 该数组为整型数组，但是只是声明了变量a，并没有将a初始化为一个真正的数组。
        // 初始化数组
        int[] b = new int[10]; // 这条语句声明并初始化了一个可以存储10个整数的数组。
        //数组一旦创建则无法改变其长度。

        // 简化写法：声明并初始化数组；不需要初始化数组，直接增加数组值即可。
        int[] smallPrimes = {1, 3, 5, 7, 11, 13};

        // 数组长度可以定义为0，但是和null数组是不一样的。

        // 访问数组元素
        int[] c = new int[100];
        for (int i = 0; i < 100; i++) {
            c[i] = i;
        }
        // 访问数组元素
        System.out.println(c[5]);

        // 获取长度
        System.out.println(c.length);

        // for-each循环遍历数组
        for (int element : c) {
            System.out.println(">>>" + element);
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println(">>>c" + c[i]);
        }
    }
}
