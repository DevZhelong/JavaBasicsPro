package com.yuandao.programming_structure.example.oop.dtdemo1;

/**
 * @Author Ronaldo.Chen
 * @create 9/26/2024 4:28 PM
 * @Study
 */
public class Teacher extends People{
    public String name="子类的Teacher的名称";
    @Override
    public void run() {
        System.out.println("跑的很慢");
    }
}
