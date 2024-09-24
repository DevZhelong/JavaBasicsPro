package com.yuandao.programming_structure.example.string;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 3:22 AM
 * @Study 子串
 */
public class Substring {
    public static void main(String[] args) {
        // 子串就是字符串里面截取出来的内容，称为子串。
        String greeting = "Hello";
        // greeting方法的第二个参数是不想复制第一个位置。
        String s  = greeting.substring(0,3);
        System.out.println(s);
    }
}
