package com.cas.helloworld;

import javax.persistence.*;
import java.util.List;

@Entity(name = "student")
public class Student {
    @Id @Column @GeneratedValue
    private long id;
    @Column
    private String name;
    @Column
    private int age;
    @OneToMany (mappedBy = "student", fetch = FetchType.LAZY)
    private List<Clazz> clazzes;

    @OneToMany(mappedBy = "student")
    private  List<Order> orders;    //탐색 방향

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

    public List<Clazz> getClazzes() {
        return clazzes;
    }

    public void setClazzes(List<Clazz> clazzes) {
        this.clazzes = clazzes;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
