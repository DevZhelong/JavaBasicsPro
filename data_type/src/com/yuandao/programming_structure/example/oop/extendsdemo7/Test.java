package com.yuandao.programming_structure.example.oop.extendsdemo7;

/**
 * @Author Ronaldo.Chen
 * @create 9/26/2024 2:46 AM
 * @Study 认识子类构造器的特点，在掌握这个特点的常见应用场景。
 */
class F {
    public F(String name , int age) {
        System.out.println("父类F的无参数构造器执行了");
    }
}

class Z extends F {
    public Z() {
        super("lisi",10);
        System.out.println("子类Z的无参数构造器执行了");
    }

    public Z(String name) {
        super("lisi",11);
        System.out.println("子类Z的有参数构造器执行了");
    }
}

public class Test {
    public static void main(String[] args) {
        Z z = new Z();
        Z z2 = new Z("lisi");

    }
}
