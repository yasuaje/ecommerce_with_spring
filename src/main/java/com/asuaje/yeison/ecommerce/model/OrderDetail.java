package com.asuaje.yeison.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private int amount;
    private double precio;
    private double total;

    public OrderDetail() {
    }

    public OrderDetail(Long id, String name, int amount, double precio, double total) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.precio = precio;
        this.total = total;
    }
}