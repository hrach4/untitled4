package com.company;

public class day16_Employer {
    public String name;
    public int age;
    public String workplace;
    public int salary;

    public void info() {
        System.out.println("name-" + this.name + "\nage-" + this.age + "\nworkplace-" + this.workplace + "\nsalary-" + this.salary + "\n");
    }

    public day16_Employer(String name, int age, String workplace, int salary) {
        this.name = name;
        this.age = age;
        this.workplace = workplace;
        this.salary = salary;
    }

    public day16_Employer() {
    }
}
