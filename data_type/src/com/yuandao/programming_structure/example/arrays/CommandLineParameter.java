package com.yuandao.programming_structure.example.arrays;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 7:16 AM
 * @Study 命令行参数
 */
public class CommandLineParameter {
    public static void main(String[] args) {
        if (args.length == 0 || args[0].equals("-h")) {
            System.out.println("Hello");
        } else if (args[0].equals("-g")) {

        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(" " + args[i]);
            System.out.println("!");
        }
    }
}
