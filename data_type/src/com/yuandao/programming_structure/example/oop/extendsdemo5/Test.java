package com.yuandao.programming_structure.example.oop.extendsdemo5;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @Author Ronaldo.Chen
 * @create 9/26/2024 2:03 AM
 * @Study
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("lisi",19);
//        System.out.println(s1.toString());
        System.out.println(s1);

        ArrayList list = new ArrayList();
        list.add("java");
        System.out.println(list);
    }
}
