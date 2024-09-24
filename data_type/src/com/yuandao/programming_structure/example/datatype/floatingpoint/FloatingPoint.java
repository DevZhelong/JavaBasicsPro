package com.yuandao.programming_structure.example.datatype.floatingpoint;

/**
 * @Author Ronaldo.Chen
 * @create 2024/9/14 21:55
 */
public class FloatingPoint {
    public static void main(String[] args) {
//        实际上，只有大量存储数据等特殊场景，才会用到float
        float a = 3.14F;
        System.out.println(a);

        double b = 20;
        System.out.println(b);

        /*
         * 浮点数采用二进制系统表示，而在二进制的系统中无法精确的表示分数1/10
         * 这就好比十进制内无法精确的表示1/3
         * 如果需要使用在计算特别精准的业务场景，那么需要用到BigDecimal类去实现 */
        System.out.println(2.0 - 1.1);
    }
}
