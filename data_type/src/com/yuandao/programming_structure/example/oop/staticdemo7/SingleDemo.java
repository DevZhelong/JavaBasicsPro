package com.yuandao.programming_structure.example.oop.staticdemo7;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 10:23 PM
 * @Study
 */
public class SingleDemo {
    // 2、定义一个类变量记住类的一个对象。
    private static SingleDemo singleDemo = new SingleDemo();

    // 1、把类的构造器私有。
    private SingleDemo() {

    }

    // 3、定义一个类方法，返回对象
    public static SingleDemo getObject() {
        return singleDemo;
    }
}
