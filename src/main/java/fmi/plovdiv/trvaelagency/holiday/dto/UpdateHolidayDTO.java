package fmi.plovdiv.trvaelagency.holiday.dto;

import java.time.LocalDate;

public class UpdateHolidayDTO {

    private long id;

    private int duration;

    private int freeSlots;

    private long location;

    private String title;

    private String price;

    private LocalDate startDate;

    public UpdateHolidayDTO(long id, int duration, int freeSlots, long location, String title, String price, LocalDate startDate) {
        this.id = id;
        this.duration = duration;
        this.freeSlots = freeSlots;
        this.location = location;
        this.title = title;
        this.price = price;
        this.startDate = startDate;
    }

    public UpdateHolidayDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getFreeSlots() {
        return freeSlots;
    }

    public void setFreeSlots(int freeSlots) {
        this.freeSlots = freeSlots;
    }

    public long getLocation() {
        return location;
    }

    public void setLocation(long location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
