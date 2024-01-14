package fmi.plovdiv.trvaelagency.holiday.dto;

import java.time.LocalDate;

public class CreateHolidayDTO {

    private long location;

    private int duration;

    private int freeSlots;

    private String price;

    private String title;

    private LocalDate startDate;

    public CreateHolidayDTO(long location, int duration, int freeSlots, String price, String title, LocalDate startDate) {
        this.location = location;
        this.duration = duration;
        this.freeSlots = freeSlots;
        this.price = price;
        this.title = title;
        this.startDate = startDate;
    }

    public CreateHolidayDTO() {
    }

    public long getLocation() {
        return location;
    }

    public void setLocation(long location) {
        this.location = location;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}
