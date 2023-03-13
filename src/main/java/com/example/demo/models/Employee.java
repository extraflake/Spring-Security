package com.example.demo.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "tb_m_employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "fullname")
    private String Fullname;

    @Column(name = "email")
    private String Email;

    @Column(name = "birthdate")
    private Date Birthdate;

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setName(String fullname) {
        Fullname = fullname;
    }

    public String getName() {
        return Fullname;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public Date getBirthdate() {
        return Birthdate;
    }
}
