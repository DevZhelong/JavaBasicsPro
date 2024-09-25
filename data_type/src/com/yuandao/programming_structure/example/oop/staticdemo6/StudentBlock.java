package com.yuandao.programming_structure.example.oop.staticdemo6;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 10:09 PM
 * @Study
 */
public class StudentBlock {
    static int number = 80;
    static String schoolName;

    // 静态代码块
    static {
        System.out.println("静态代码块执行了！");
//        schoolName = "qinghua";
    }

    int age;

    //实例代码块
    {
        System.out.println("实例代码块执行了");
//        age = 18;
    }

    public StudentBlock() {
        System.out.println("无参构造器执行了");
    }

    public StudentBlock(String schoolName) {
        System.out.println("有参构造器执行了");
    }
}
