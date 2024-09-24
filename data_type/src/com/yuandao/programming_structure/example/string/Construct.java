package com.yuandao.programming_structure.example.string;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 4:28 AM
 * @Study 构建字符串
 */
public class Construct {
    public static void main(String[] args) {
        // 实例化一个空的字符串构造器。
        StringBuilder builder = new StringBuilder();

        // 通过append方法，添加内容。
        String a = String.valueOf(builder.append("123"));
        String b = String.valueOf(builder.append("456"));
        System.out.println(b);

        // 调用得到一个String对象，其中包含了构造器中的字符序列。
        String completedString = builder.toString();
        System.out.println("得到一个String对象:" + completedString);
    }
}
