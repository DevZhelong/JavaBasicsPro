package com.yuandao.programming_structure.example.oop;

import java.time.LocalDate;

/**
 * @Author Ronaldo.Chen
 * @create 9/20/2024 4:40 PM
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, LocalDate hireDay) {
        this.name =name;
        this.salary = salary;
        this.hireDay = LocalDate.of(getHireDay().getYear(), getHireDay().getMonth(), getHireDay().getDayOfMonth());

    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }
}
