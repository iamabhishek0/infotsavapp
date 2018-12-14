package com.infotsav.test.Main_Activities;

public class Updates_details {
    private int id;
    private String heading;
    private String date_time;
    private String data;
    private int image;

    public Updates_details(int id, String heading, String date_time, String data, int image) {
        this.id = id;
        this.heading = heading;
        this.date_time = date_time;
        this.data = data;
        this.image=image;
    }

    public int getId() {
        return id;
    }

    public String getHeading() {
        return heading;
    }

    public String getDate_time() {
        return date_time;
    }

    public String getData() { return data; }

    public void setId(int id) {
        this.id = id;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}