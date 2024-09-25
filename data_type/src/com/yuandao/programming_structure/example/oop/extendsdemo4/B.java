package com.yuandao.programming_structure.example.oop.extendsdemo4;

/**
 * @Author Ronaldo.Chen
 * @create 9/26/2024 12:29 AM
 * @Study
 */
public class B extends A {
    // 方法重写
    @Override //安全，并且一看注释就知道是重写方法。
    public void print1() {
        System.out.println("1111");
    }

    // 申明不变，重新实现
    // 方法重写
    @Override
    public void print2(int a, int b) {
        System.out.println("2222");
    }
}
