package com.yuandao.programming_structure.example.oop.extendsdemo2;

/**
 * @Author Ronaldo.Chen
 * @create 9/25/2024 11:54 PM
 * @Study
 */
public class Teacher extends People {
    private String skill;

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void printInfo() {
        System.out.println(getName() + "具备的技能" + skill);
    }
}
