package com.infotsav.test;

public class Aboutus_details {
    private int id;
    private String name;
    private String email;
    private String dept;

    public Aboutus_details(int id, String name, String email, String dept) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dept = dept;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;

    }
}
