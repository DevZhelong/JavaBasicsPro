package com.yuandao.programming_structure.example.oop.staticdemo4;

import java.util.Random;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 9:34 PM
 * @Study 类变量实现工具类，实现代码复用。
 */
public class Util {
    /*
    * 为何不用实例方法实现工具类？
    * 1、实例方法需要创建对象来调用，此时对象只是为了调节方法，对象占内存，这样会浪费内存。
    * 2、类方法，直接用类名调用即可，调用方便，也能节省内存。
    * */

    // 工具类没有创建对象的需求，那么可以将工具类的构造器进行私有化。

    private Util(){}

    public static String createCode(int n) {
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
