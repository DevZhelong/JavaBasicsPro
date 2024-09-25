package com.yuandao.programming_structure.example.oop.staticdemo5;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 9:57 PM
 * @Study
 */
public class Student {
    static String schoolName;

    double score; //实例变量

    //1、类方法中可以直接访问类成员，不可以直接访问实例成员。
    // 类方法
    public static void printHelloWorld() {
        Student.schoolName = "yuandao";

        // 同一个类中访问类成员可以省略类名
        Student.printHelloWorld2();

        //System.out.println(score);
        // Non-static field 'score' cannot be referenced from a static context
        //printPass;

        // System.out.println(this);
    }

    // 类方法
    public static void printHelloWorld2() {
        System.out.println("Hello World");
    }


    // 2、实例方法中既可以直接访问类成员，也可以直接访问实例成员。
    // 3、实例方法中可以出现this关键字，类方法中不可以出现this关键字
    public void printPass() {
        //直接访问类成员
        schoolName = "yuandao";
        printHelloWorld2();

        //直接访问实例成员
        System.out.println(score);

        printPass2();

        System.out.println(this);
    }

    //实例方法
    public void printPass2() {

    }
}
