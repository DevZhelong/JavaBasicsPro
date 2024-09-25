package com.yuandao.programming_structure.example.oop.staticdemo6;

import com.yuandao.programming_structure.example.oop.staticdemo5.Student;

import java.net.Socket;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 10:09 PM
 * @Study
 */
public class Test {
    public static void main(String[] args) {
        // 类只会加载一次，所以静态代码块也只会执行一次。
        System.out.println(StudentBlock.number);
        System.out.println(StudentBlock.number);
        System.out.println(StudentBlock.number);

        System.out.println(StudentBlock.schoolName);
        System.out.println("===============");

        //每次创建对象时，执行实例代码块，并在构造器前执行。
        StudentBlock studentBlock = new StudentBlock();
        StudentBlock studentBlock2 = new StudentBlock("张三");
        System.out.println("==============");
        System.out.println(studentBlock.age);
        System.out.println(studentBlock2.age);

    }
}
