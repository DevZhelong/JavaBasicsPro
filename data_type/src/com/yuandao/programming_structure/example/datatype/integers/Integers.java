package com.yuandao.programming_structure.example.datatype.integers;

/**
 * @Author Ronaldo.Chen
 * @create 2024/9/14 21:48
 */
public class Integers {
    public static void main(String[] args) {
        int a = -2147483648;
        System.out.println(a);
        a = 2147483647;
        System.out.println(a);

        byte b = -128;
        System.out.println(b);
        b = 127;
        System.out.println(b);

        short c = -32768;
        System.out.println(c);
        c = 32767;
        System.out.println(c);

        long d = 9223372036854775807L;
        System.out.println(d);
        d = -9223372036854775808L;
        System.out.println(d);
    }
}
