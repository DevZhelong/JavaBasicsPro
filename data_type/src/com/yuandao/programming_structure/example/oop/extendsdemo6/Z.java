package com.yuandao.programming_structure.example.oop.extendsdemo6;

/**
 * @Author Ronaldo.Chen
 * @create 9/26/2024 2:14 AM
 * @Study
 */
public class Z extends F {
    String name = "子类名称";

    public void showName() {
        String name = "局部名称";
        System.out.println(name);//局部
        System.out.println(this.name);//子类
        System.out.println(super.name);//父类
    }

    @Override
    public void print1() {
        System.out.println("===子类的print1方法执行了===");
    }

    public void showMethod() {
        print1();
        super.print1();
    }
}
