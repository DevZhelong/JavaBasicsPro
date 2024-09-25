package com.yuandao.programming_structure.example.oop.extendsdemo2;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 11:55 PM
 * @Study 学习继承的优势——减少代码重复性
 */
public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setSkill("teach");
        System.out.println(t.getSkill());

        t.setName("Ronaldo.Chen");
        t.printInfo();
    }
}
