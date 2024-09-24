package com.yuandao.programming_structure.example.enumeration;

/**
 * @Author Ronaldo.Chen
 * @create 2024/9/14 23:04
 */
public class Enumeration {

    /*
     * 变量的取值在一个有限的集合内；
     * 我们可以通过SMLX去定义服装尺寸，但是这样容易出错，比如把M写成m。
     * 这也是为什么需要使用枚举的原因。
     * */

    // 针对上述的情况，可以自定义枚举类型！枚举类型包括有限个命名的值
    enum Size {S, M, L, X}

    public static void main(String[] args) {

        // 声明这种类型的变量。
        Size size = Size.M;
        System.out.println(size);

    }
}
