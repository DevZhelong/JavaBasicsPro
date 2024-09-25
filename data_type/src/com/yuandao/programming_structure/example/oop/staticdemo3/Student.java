package com.yuandao.programming_structure.example.oop.staticdemo3;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 9:12 PM
 * @Study 类方法和实例方法的学习
 */
public class Student {
    // 类方法：加了static修饰的方法。
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    double score;

    // 实例方法（对象的方法）：未用static修饰的方法。
    public void printPass() {
        System.out.println("Pass" + (score >= 60 ? "及格" : "不及格"));
    }
}
