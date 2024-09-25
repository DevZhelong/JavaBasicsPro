package com.yuandao.programming_structure.example.oop.staticdemo3;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 9:13 PM
 * @Study
 */
public class Test {
    public static void main(String[] args) {
        // 类方法的使用
        // 类名.类方法（推荐）
        Student.printHelloWorld();

        // 对象.类方法（不推荐）
        Student s = new Student();
        s.printHelloWorld();

        // 实例方法的用法
        // 对象.实例方法
        s.printPass();
    }
}
