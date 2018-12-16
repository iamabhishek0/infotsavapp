package com.infotsav.test.Main_Activities;

public class Updates_details {
    private String id;
    private String announcement_title;
    private String announcement_datetime;
    private String announcement_desc;
    private String announcement_image;

    public Updates_details(String id, String announcement_title, String announcement_datetime, String announcement_desc, String announcement_image) {
        this.id = id;
        this.announcement_title = announcement_title;
        this.announcement_datetime = announcement_datetime;
        this.announcement_desc = announcement_desc;
        this.announcement_image = announcement_image;
    }

    public Updates_details() {
    }

    public String getId() {
        return id;
    }

    public String getAnnouncement_title() {
        return announcement_title;
    }

    public String getAnnouncement_datetime() {
        return announcement_datetime;
    }

    public String getAnnouncement_desc() {
        return announcement_desc;
    }

    public String getAnnouncement_image() {
        return announcement_image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAnnouncement_title(String announcement_title) {
        this.announcement_title = announcement_title;
    }

    public void setAnnouncement_datetime(String announcement_datetime) {
        this.announcement_datetime = announcement_datetime;
    }

    public void setAnnouncement_desc(String announcement_desc) {
        this.announcement_desc = announcement_desc;
    }

    public void setAnnouncement_image(String announcement_image) {
        this.announcement_image = announcement_image;
    }
}