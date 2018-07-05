package com.example.halfdevil.database_implement;

public class Contacts {

    private  String UserId;
    private  String name;
    private String Password;
    private  String Email;
    private  String dob;

    public Contacts(String name, String password, String email, String dob) {
        this.name = name;
        this.Password = password;
        this.Email = email;
        this.dob = dob;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
