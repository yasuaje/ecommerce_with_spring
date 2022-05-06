package com.asuaje.yeison.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String number;
    private Date creationDate;
    private Date receptionDate;
    private double total;

    public Order() {
    }

    public Order(Long id, String number, Date creationDate, Date receptionDate, double total) {
        this.id = id;
        this.number = number;
        this.creationDate = creationDate;
        this.receptionDate = receptionDate;
        this.total = total;
    }
}