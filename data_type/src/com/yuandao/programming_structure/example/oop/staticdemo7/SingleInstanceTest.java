package com.yuandao.programming_structure.example.oop.staticdemo7;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 10:23 PM
 * @Study 掌握单例设计模式写法
 */
public class SingleInstanceTest {
    public static void main(String[] args) {
        SingleDemo a1 = SingleDemo.getObject();
        SingleDemo a2 = SingleDemo.getObject();

        System.out.println(a1);
        System.out.println(a2);
    }
}
