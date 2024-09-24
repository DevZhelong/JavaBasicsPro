package com.yuandao.programming_structure.example.variable;

/**
 * @Author Ronaldo.Chen
 * @create 2024/9/14 22:21
 */
public class DeclareVariables {
    public static void main(String[] args) {
        // 声明变量时，需要先指定变量的类型，然后是变量名
        int a;
        int b;

        /*
         * 可以在同一行代码中声明变量类型相同的变量；
         * 但是不建议这么写，因为会降低代码的可读性。
         * */
        int c, d;

        /*
         *  拓展：如果想知道哪些字母属于Unicode中的字符，
         * 可以用Character类的isJavaIdentifierStart和isJavaIdentifierPart
         */

        // 变量初始化，就是声明一个变量之后，必须用赋值语句对变量进行显示初始化
        int e = 10;

        // 不要使用未初始化的变量值，否则会报错。
        //报错：Variable 'c' might not have been initialized;翻译：变量 “c ”可能尚未初始化
        //ystem.out.println(c);

        /*
         * 变量的声明无论放在程序中的哪个位置都是合法的；
         * 但是为了保持良好的Java编写风格，变量的声明尽可能的靠近变量第一次使用的地方。
         * 如果想对一个声明过的变量，再次进行赋值，如下：
         * */
        e = 20;
        System.out.println(e);




    }
}
