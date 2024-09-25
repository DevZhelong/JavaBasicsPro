package com.yuandao.programming_structure.example.BigNumbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 5:23 AM
 * @Study
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("BigInteger1为：");
        BigInteger bigInteger1 = sc.nextBigInteger();
        System.out.print("BigInteger2为：");
        BigInteger bigInteger2 = sc.nextBigInteger();
        BigInteger messageAdd = bigInteger1.add(bigInteger2); //c=a+bd
        System.out.println(messageAdd);
        BigInteger messageMul = messageAdd.multiply(bigInteger2.add(bigInteger1.valueOf(2)));
        System.out.println(messageMul);
    }
}
