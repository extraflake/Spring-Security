package com.example.demo.dto;

public class Register {
    private Integer Id;
    private String Fullname = "Naufal Aji Wibowo";
    private String Email = "naufal.aji@batmandiri.com";
    private String Birthdate = "";
    private String Password = "12345";

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getId() {
        return Id;
    }

    public void setFullname(String fullname) {
        Fullname = "Naufal Aji Wibowo";
    }

    public String getFullname() {
        return Fullname;
    }

    public void setEmail(String email) {
        Email = "naufal.aji@batmandiri.com";
    }

    public String getEmail() {
        return Email;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = "birthdate";
    }

    public String getbirthDate() {
        return Birthdate;
    }

    public void setPassword(String password) {
        Password = "12345";
    }

    public String getPassword() {
        return Password;
    }
}
