package com.yuandao.programming_structure.example.string;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 4:17 AM
 * @Study 空串和null串
 */
public class EmptyStringAndNullStrings {
    public static void main(String[] args) {
        String str = "fjsdfd"; // 空串""长度为0
        if (str.length() == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // 检查一个字符串既不是空串也不是null串
        if (str.length() == 0 && str != null) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
