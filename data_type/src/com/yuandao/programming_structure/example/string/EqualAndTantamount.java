package com.yuandao.programming_structure.example.string;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 3:26 AM
 * @Study eaual和==的区别
 */
public class EqualAndTantamount {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";

        // 写法一
        System.out.println(s1.equals(s2));

        // 写法二
        System.out.println("abc".equals(s2));

        // 写法三
        System.out.println("abc".equals("ABC"));

        System.out.println("===============================");

        // 千万不要用==运算符检测两个字符是否相等！
        // 此运算符只能确认两个字符串是否存放在同一个位置上。
        String s3 = "Hello";
        if (s3 == "Hello") {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        if (s3.substring(0, 3) == "Hel") {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
