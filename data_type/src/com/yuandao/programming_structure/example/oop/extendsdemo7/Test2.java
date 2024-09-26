package com.yuandao.programming_structure.example.oop.extendsdemo7;

/**
 * @Author Ronaldo.Chen
 * @create 9/26/2024 2:55 AM
 * @Study 应用场景
 */
public class Test2 {
    public static void main(String[] args) {
        Teacher t = new Teacher("lisi", 33, "java");
        System.out.println(t.getName());
        System.out.println(t.getAge());
    }
}

class Teacher extends People {
    private String skill;

    public Teacher(String skill, int age, String name) {
        super(name, age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}

class People {
    private String name;
    private int age;

    public People() {
    }

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}