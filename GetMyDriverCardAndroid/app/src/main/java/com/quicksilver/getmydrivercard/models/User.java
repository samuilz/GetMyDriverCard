package com.quicksilver.getmydrivercard.models;

import java.io.Serializable;

public class User implements Serializable {
    private String email;
    private String password;
    private UserRole role;

    public User() {

    }

    public User(String email) {
        this.email = email;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }
}
