package com.yuandao.programming_structure.example.conditional;

import java.util.Scanner;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 5:01 AM
 * @Study
 */
public class IfElseDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("输入您的销售总额：");
        double yourSales = sc.nextDouble();

        System.out.print("输入您的目标销售额：");
        double target = sc.nextDouble();

        String performance;
        if (yourSales >= 2 * target) {
            performance ="优秀";
            double bonus = 1000;
            System.out.println("绩效考核为：" + performance + "，奖金为：" + bonus);
        } else if (yourSales >= 1.5 * target) {
            performance ="良好";
            double bonus = 500;
            System.out.println("绩效考核为：" + performance + "，奖金为：" + bonus);
        } else if (yourSales >= target) {
            performance ="满意";
            double bonus = 100;
            System.out.println("绩效考核为：" + performance + "，奖金为：" + bonus);
        } else {
            System.out.println("你被解雇了！");
        }
    }
}
