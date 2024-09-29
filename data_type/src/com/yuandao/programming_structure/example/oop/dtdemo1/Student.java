package com.yuandao.programming_structure.example.oop.dtdemo1;

/**
 * @Author Ronaldo.Chen
 * @create 9/26/2024 4:28 PM
 * @Study
 */
public class Student extends People{
    public String name="子类的Student的名称";
    @Override
    public void run() {
        System.out.println("很快的跑");
    }
}
