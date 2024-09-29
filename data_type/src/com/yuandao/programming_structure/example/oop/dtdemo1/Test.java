package com.yuandao.programming_structure.example.oop.dtdemo1;

/**
 * @Author Ronaldo.Chen
 * @create 9/26/2024 4:27 PM
 * @Study 认识对象和行为多态
 */
public class Test {
    public static void main(String[] args) {
        // 对象多态
        People p1 = new Teacher();
        p1.run(); // 编译看左边，运行看右边
        System.out.println(p1.name); // 对于变量，编译看左边，运行看左边

        People p2 = new Student();
        p2.run();
        System.out.println(p2.name);
    }
}
