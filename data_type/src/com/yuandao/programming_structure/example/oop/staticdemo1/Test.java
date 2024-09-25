package com.yuandao.programming_structure.example.oop.staticdemo1;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 3:50 PM
 * @Study
 */
public class Test {
    public static void main(String[] args) {
        // 类变量的用法
        Student.name = "李四";

        Student s2 = new Student();
        s2.name = "张三";

        System.out.println(Student.name);

        // 实例变量的用法:对象.实例变量
        s2.age = 18;
        System.out.println(s2.age);

    }
}
