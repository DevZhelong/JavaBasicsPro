package com.yuandao.programming_structure.example.conditional;

import java.util.Scanner;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 4:37 AM
 * @Study if条件语句
 */
public class IfElseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("输入您的销售总额：");
        double yourSales = sc.nextDouble();
        double target = 80;

        String performance;
        if (yourSales >= target) {
            performance = "满意";
            double bonus = 100 + (0.01 * (yourSales - target));
            System.out.println("绩效考核为：" + performance + "，奖金为：" + bonus);
        } else {
            performance = "不满意";
            double bonus = 0;
            System.out.println("绩效考核为：" + performance + "，奖金为：" + bonus);
        }
    }
}
