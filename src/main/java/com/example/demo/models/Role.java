package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "tb_m_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer Id;

    @Column(name = "name")
    private String Name;

    @Column(name = "level")
    private Integer Level;

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public Integer getLevel() {
        return Level;
    }
}
