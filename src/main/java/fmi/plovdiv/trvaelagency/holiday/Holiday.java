package fmi.plovdiv.trvaelagency.holiday;

import fmi.plovdiv.trvaelagency.location.Location;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "holiday")
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = Location.class)
    @JoinColumn(name = "location_id")
    private Location location;

    private int duration;

    private double price;

    private int freeSlots;

    private String title;

    private LocalDate startDate;

    public Holiday(long id, Location location, int duration, double price, int freeSlots, String title, LocalDate startDate) {
        this.id = id;
        this.location = location;
        this.duration = duration;
        this.price = price;
        this.freeSlots = freeSlots;
        this.title = title;
        this.startDate = startDate;
    }

    public Holiday() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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
}
