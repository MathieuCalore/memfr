package com.memcetera.memfr.models;

import javax.persistence.*;
@Entity
@Table(name = "user")
public class User {
    @Id
    private long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "mail")
    private String mail;
    @Column(name = "role")
    private int role;


}
