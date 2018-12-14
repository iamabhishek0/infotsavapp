package com.infotsav.test.Main_Activities;

public class Sponsors_details {
    private int id;
    private String name;
    private String sponsorship1;
    private String sponsorship2;
    private int image;

    public Sponsors_details(int id, String name, String sponsorship1, String sponsorship2, int image) {
        this.id = id;
        this.name = name;
        this.sponsorship1 = sponsorship1;
        this.sponsorship2 = sponsorship2;
        this.image=image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSponsorship1() {
        return sponsorship1;
    }

    public String getSponsorship2() {
        return sponsorship2;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSponsorship1(String sponsorship1) {
        this.sponsorship1 = sponsorship1;
    }

    public void setSponsorship2(String sponsorship2) {
        this.sponsorship2 = sponsorship2;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}