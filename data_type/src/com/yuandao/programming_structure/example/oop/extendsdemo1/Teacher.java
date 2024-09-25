package com.yuandao.programming_structure.example.oop.extendsdemo1;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 10:42 PM
 * @Study
 */
public class Teacher extends People {
//子类可以继承父类的非私有成员变量和方法。
    public void print3(){
        System.out.println(i);
//        System.out.println(j);
//        print2();
    }
}
