package com.cas.helloworld;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @Column
    @GeneratedValue
    private long id;
    private String name;
    private int price;
    @OneToMany(mappedBy = "product")
    private List<Order> orders;    //탐색 방향
//    @ManyToOne
//    private Order order;
//    private Order order;

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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
