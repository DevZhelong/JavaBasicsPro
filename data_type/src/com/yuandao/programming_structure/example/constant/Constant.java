package com.yuandao.programming_structure.example.constant;

/**
 * @Author Ronaldo.Chen
 * @create 2024/9/14 22:39
 */

public class Constant {

    // 而在Java开发中，开发者会希望一个常量可以在一个类的多个方法中使用，那么这类的常量就称之为：类常量
    // 所谓的类常量，就是使用关键字static final进行修饰的量。
    // 定义于main方法外，class方法内。
    static final String STUDENT_NAME = "张三";

    public static void main(String[] args) {

        // 所谓常量，利用关键字final指示常量。
        final int STUDENT_SCORE = 95;
        System.out.println(STUDENT_SCORE);

        /*
         * final修饰的常量，只能被赋值一次，也就是说，一旦赋值后就无法更改了。
         * 习惯上，常量名用全大写的方式进行命名。
         * */
//        STUDENT_SCORE = 88; //报错：Cannot assign a value to final variable 'STUDENT_SCORE'

        System.out.println("学生：" + STUDENT_NAME + " 成绩为：" + STUDENT_SCORE);

    }
}
