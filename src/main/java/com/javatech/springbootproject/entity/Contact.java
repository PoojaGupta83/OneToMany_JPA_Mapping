package com.javatech.springbootproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@Table(name = "CONTACT")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String name;
    private String secondName;
    private String work;
    private String email;
    private String phone;
    private String image;
    @Column(length = 1000)
    private String description;
    @ManyToOne
    private User user;

    public Contact() {
    }

    @Override
    public String toString() {
        return "Contact{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", work='" + work + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
