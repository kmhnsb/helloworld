package com.cas.helloworld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {
    @Id
    @Column
    private String name;
    @Column
    private int age;

    public void cleaning() {    //이게 domain 객체
        System.out.println(name + ": Yes, I'm cleaning:(");
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
