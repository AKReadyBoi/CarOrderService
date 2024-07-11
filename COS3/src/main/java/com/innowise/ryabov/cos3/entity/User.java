package com.innowise.ryabov.cos3.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "firstname",nullable = false)
    private String firstname;
    @Column(name = "lastname",nullable = false)
    private String lastname;
    @Column(name = "email",nullable = false, unique = true)
    private String email;
    @Column(name = "phone_number",nullable = false, unique = true)
    private String phone_number;
    @Column(name = "creation_date",nullable = false)
    private Date creation_date;
    @Column(name = "passport_id",nullable = false, unique = true)
    private String passport_id;
    @Column(name = "driving_license_id",nullable = false, unique = true)
    private String driving_license_id;
}