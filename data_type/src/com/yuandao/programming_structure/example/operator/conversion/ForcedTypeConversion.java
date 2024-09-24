package com.yuandao.programming_structure.example.operator.conversion;

import static java.lang.Math.round;

/**
 * @Author Ronaldo.Chen
 * @create 2024/9/14 23:42
 */
public class ForcedTypeConversion {
    public static void main(String[] args) {
        double a = 9.997;
        int b = (int) a; // 强转会丢失一定精度。

        //如果需要对浮点数进行舍入运算，可以采用Math.round方法。
        b = (int) round(a);
        System.out.println(round(a));

    }
}
