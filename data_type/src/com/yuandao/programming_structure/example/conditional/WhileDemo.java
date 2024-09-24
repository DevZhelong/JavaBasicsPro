package com.yuandao.programming_structure.example.conditional;

import java.util.Scanner;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 5:07 AM
 * @Study
 */
public class WhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("您存的退休金数额为：");
        double balance = sc.nextDouble();
        System.out.print("您预计存的退休金数额为：");
        double goal = sc.nextDouble();
        System.out.print("您预计存的退休金数额为：");
        double payment = sc.nextDouble();
        while (balance < goal) {
            balance = balance + payment;
            double interesRate;
//            double temp = balance*interesRate/100;
            
        }
    }
}
