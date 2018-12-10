package com.infotsav.test.foldingView;

import android.view.View;

import com.infotsav.test.R;

import java.util.ArrayList;

/**
 * Simple POJO model for example
 */
@SuppressWarnings({"unused", "WeakerAccess"})
public class Item {

    private String price;
    private int event_image;
    private String event_detail_short;
    private String venue_event;
    private String time_event;
    private String date;
    private String time;

    private View.OnClickListener requestBtnClickListener;

    public Item() {
    }

    public Item(String price, int event_image, String event_detail_short, String venue_event, String time_event, String date, String time) {
        this.price = price;
        this.event_image = event_image;
        this.event_detail_short = event_detail_short;
        this.venue_event = venue_event;
        this.time_event = time_event;
        this.date = date;
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getEvent_image() {
        return event_image;
    }

    public void setEvent_image(int event_image) {
        this.event_image = event_image;
    }

    public String getEvent_detail_short() {
        return event_detail_short;
    }

    public void setEvent_detail_short(String event_detail_short) {
        this.event_detail_short = event_detail_short;
    }

    public String getVenue_event() {
        return venue_event;
    }

    public void setVenue_event(String venue_event) {
        this.venue_event = venue_event;
    }

    public String getTime_event() {
        return time_event;
    }

    public void setTime_event(String time_event) {
        this.time_event = time_event;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public View.OnClickListener getRequestBtnClickListener() {
        return requestBtnClickListener;
    }

    public void setRequestBtnClickListener(View.OnClickListener requestBtnClickListener) {
        this.requestBtnClickListener = requestBtnClickListener;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (time_event != item.time_event) return false;
        if (price != null ? !price.equals(item.price) : item.price != null) return false;
        //if (event_image != null ? !event_image.equals(item.event_image) : item.event_image != null)
            //return false;
        if (event_detail_short != null ? !event_detail_short.equals(item.event_detail_short) : item.event_detail_short != null)
            return false;
        if (venue_event != null ? !venue_event.equals(item.venue_event) : item.venue_event != null)
            return false;
        if (date != null ? !date.equals(item.date) : item.date != null) return false;
        return !(time != null ? !time.equals(item.time) : item.time != null);

    }

    @Override
    public int hashCode() {
        int result = price != null ? price.hashCode() : 0;
        //result = 31 * result + (event_image != null ? event_image.hashCode() : 0);
        result = 31 * result + (event_detail_short != null ? event_detail_short.hashCode() : 0);
        result = 31 * result + (venue_event != null ? venue_event.hashCode() : 0);
        //result = 31 * result + time_event;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    /**
     * @return List of elements prepared for tests
     */
    public static ArrayList<Item> getTestingList() {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("$14", R.drawable.ultron60port, "RoboWar is an open-source video game in which the player programs onscreen icon-like robots to battle each other with animation and sound effects", "E-Block", "3:30PM", "TODAY", "05:10 PM"));
        items.add(new Item("$23", R.drawable.blackwidow60port, "W 36th St, NY, 10015", "B-Block", "10:00AM", "TODAY", "11:10 AM"));
        items.add(new Item("$63", R.drawable.captainamerica60port, "W 36th St, NY, 10029", "A-Block", "5:00PM", "TODAY", "07:11 PM"));
        items.add(new Item("$19", R.drawable.nickfurry60port, "12th Ave, NY, 10012", "C-Block", "2:30PM", "TODAY", "4:15 AM"));
        items.add(new Item("$5", R.drawable.thor60port, "56th Ave, NY, 10041", "D-Block", "6:00AM", "TODAY", "06:15 PM"));
        return items;

    }

}
