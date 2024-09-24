package com.yuandao.programming_structure.example.operator.conversion;

/**
 * @Author Ronaldo.Chen
 * @create 2024/9/14 23:37
 */
public class NumericConversion {
    public static void main(String[] args) {
        int num = 123456789;
        float num2 = num;
        System.out.println(num2);

        if (num == num2) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
