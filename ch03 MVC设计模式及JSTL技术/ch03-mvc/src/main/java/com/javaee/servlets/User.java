package com.javaee.servlets;

public class User {
    String username;
    String email;
    Integer age;
    String city;

    public User(){}
    public User(String username, String email, Integer age, String city) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.city = city;
    }

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
