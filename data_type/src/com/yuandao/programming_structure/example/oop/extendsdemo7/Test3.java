package com.yuandao.programming_structure.example.oop.extendsdemo7;

/**
 * @Author Ronaldo.Chen
 * @create 9/26/2024 2:39 PM
 * @Study
 */
public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student("lisi", 26, "QH");
        // 如果学生没有填写学校，那么默认为QH。
        Student s2 = new Student("lisi", 26);
        System.out.println(s2.getName());
        System.out.println(s2.getAge());
        System.out.println(s2.getSchoolName());
    }
}

class Student {
    private String name;
    private int age;
    private String schoolName;

    public Student() {
    }

    public Student(String name, int age) {
        this(name, age, "QH");
    }

    public Student(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}