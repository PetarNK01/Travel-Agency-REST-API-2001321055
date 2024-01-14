package fmi.plovdiv.trvaelagency.location;

import fmi.plovdiv.trvaelagency.holiday.Holiday;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;

    private String street;

    private String imageUrl;

    private String number;

    private String country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "location")
    private Set<Holiday> holidays;

    public Location(Long id, String city, String street, String imageUrl, String number, String country, Set<Holiday> holidays) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.imageUrl = imageUrl;
        this.number = number;
        this.country = country;
        this.holidays = holidays;
    }

    public Location() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<Holiday> getHolidays() {
        return holidays;
    }

    public void setHolidays(Set<Holiday> holidays) {
        this.holidays = holidays;
    }
}
