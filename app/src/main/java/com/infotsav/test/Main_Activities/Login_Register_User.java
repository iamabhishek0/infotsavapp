package com.infotsav.test.Main_Activities;

public class Login_Register_User {
    String name;
    String gender;
    String email;
    String password;
    String collegename;
    String city;
    String phoneno;

    public Login_Register_User() {
    }

    public Login_Register_User(String name, String gender, String email, String password, String collegename, String city, String phoneno) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.collegename = collegename;
        this.city = city;
        this.phoneno = phoneno;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCollegename() {
        return collegename;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }
}
