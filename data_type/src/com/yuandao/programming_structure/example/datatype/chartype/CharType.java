package com.yuandao.programming_structure.example.datatype.chartype;

/**
 * @Author Ronaldo.Chen
 * @create 2024/9/14 22:06
 */
public class CharType {
    public static void main(String[] args) {
        /*
         * char原本是用来表示单个字符；
         * 如今，有些Unicode字符可以用一个char概述
         * 另外一些Unicode字符则需要两个char值进行表示
         * char类型的值是可以表示为16进制的，但是字符串的值是不可以的。
         * 建议非必要不使用char类型去定义变量。
         * */
        char a = 65; //a的初始化值是65，对应编码值为'A'，所以打印出来也是A
        char b = 65;
        System.out.println("a="+a+'\n'+"b="+b+'\n');

    }
}
