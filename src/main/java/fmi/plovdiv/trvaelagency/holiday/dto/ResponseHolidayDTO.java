package fmi.plovdiv.trvaelagency.holiday.dto;

import fmi.plovdiv.trvaelagency.location.dto.ResponseLocationDTO;

import java.time.LocalDate;

public class ResponseHolidayDTO {

    private long id;

    private int duration;

    private double price;

    private int freeSlots;

    private String title;

    private LocalDate startDate;

    private ResponseLocationDTO location;

    public ResponseHolidayDTO(long id, int duration, double price, int freeSlots, String title, LocalDate startDate, ResponseLocationDTO location) {
        this.id = id;
        this.duration = duration;
        this.price = price;
        this.freeSlots = freeSlots;
        this.title = title;
        this.startDate = startDate;
        this.location = location;
    }

    public ResponseHolidayDTO() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFreeSlots() {
        return freeSlots;
    }

    public void setFreeSlots(int freeSlots) {
        this.freeSlots = freeSlots;
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

    public ResponseLocationDTO getLocation() {
        return location;
    }

    public void setLocation(ResponseLocationDTO location) {
        this.location = location;
    }
}
