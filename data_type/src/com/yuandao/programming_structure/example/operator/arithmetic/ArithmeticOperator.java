package com.yuandao.programming_structure.example.operator.arithmetic;

/**
 * @Author Ronaldo.Chen
 * @create 2024/9/14 23:13
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        // 算术运算符：加、减、乘、除、取余(%)

        // 整数被0除，将会产生报错：Exception in thread "main" java.lang.ArithmeticException: / by zero
        int a = 10;
        System.out.println(a / 0);

        // 浮点数被0除，将得到无穷大或者NaN结果。
        float b = 20;
        System.out.println(b / 0);

        double c = 10;
        System.out.println(c / 0);
    }
}
