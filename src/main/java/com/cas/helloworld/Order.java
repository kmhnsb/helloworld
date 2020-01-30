package com.cas.helloworld;

import javax.persistence.*;

@Entity(name = "order_infomation")
public class Order {
    @Id
    @Column
    @GeneratedValue
    private long id;
    private int Qty;
    @ManyToOne
    private Student student;    //탐색 할 수 있다.
    @ManyToOne
    private Product product;    //탐색 할 수 있다.


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
