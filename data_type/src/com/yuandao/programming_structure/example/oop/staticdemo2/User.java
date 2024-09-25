package com.yuandao.programming_structure.example.oop.staticdemo2;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 9:06 PM
 * @Study 类变量的应用场景
 */
public class User {
    public static int userNumber;

    public User(){
        // User.userNumber++;
        // 必须在同一个类中访问自己类的类变量，此时才可以省略类名不写
        userNumber++;
    }
}
