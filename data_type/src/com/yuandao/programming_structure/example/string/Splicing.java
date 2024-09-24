package com.yuandao.programming_structure.example.string;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 3:15 AM
 * @Study 字符串拼接
 */
public class Splicing {
    public static void main(String[] args) {
        String name = "Lisi";
        String score = "99";
        String message = name + "得分" + score;
        System.out.println(message);

        // 需要把多个字符串放在一起，用一个界定符分割，可以使用静态的join方法。
        String all = String.join("/","S","M","L","XL");
        System.out.println(all); // message:S/M/L/XL

    }
}
