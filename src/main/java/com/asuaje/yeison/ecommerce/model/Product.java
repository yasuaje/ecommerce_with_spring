package com.asuaje.yeison.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String description;
    private String image;
    private double precio;
    private int amount;

    public Product() {
    }

    public Product(Long id, String name, String description, String image, double precio, int amount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.image = image;
        this.precio = precio;
        this.amount = amount;
    }
}