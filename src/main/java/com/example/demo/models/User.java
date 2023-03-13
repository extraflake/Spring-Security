package com.example.demo.models;

import java.util.Optional;

import javax.persistence.*;

@Entity
@Table(name = "tb_m_user")
public class User {
    @Id
    @Column(name = "id")
    private Integer Id;

    @Column(name = "password")
    private String Password;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role Role;

    @OneToOne
    @JoinColumn(name = "id")
    private Employee Employee;

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }

    public void setRole(Role role) {
        Role = role;
    }

    public Role getRole() {
        return Role;
    }

    public void setEmployee(Employee employee) {
        Employee = employee;
    }

    public Employee getEmployee() {
        return Employee;
    }
}
