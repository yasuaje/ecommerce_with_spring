package com.asuaje.yeison.ecommerce.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String username;
    private String email;
    private String address;
    private String phone;
    private String tipo;
    private String password;

    public User() {
    }

    public User(Long id, String name, String username, String email, String address, String phone, String tipo, String password) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.tipo = tipo;
        this.password = password;
    }
}