package com.cas.helloworld;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "student")
public class Student {
    @Id @Column @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private int age;

    public void cleaning() {    //이게 domain 객체
        System.out.println(name + ": Yes, I'm cleaning:(");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
