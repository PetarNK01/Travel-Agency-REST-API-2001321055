package fmi.plovdiv.trvaelagency.reservation;

import fmi.plovdiv.trvaelagency.holiday.Holiday;
import jakarta.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = Holiday.class)
    @JoinColumn(name = "holiday_id")
    private Holiday holiday;

    private String phoneNumber;

    private String contactName;

    public Reservation(long id, Holiday holiday, String phoneNumber, String contactName) {
        this.id = id;
        this.holiday = holiday;
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
    }

    public Reservation() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Holiday getHoliday() {
        return holiday;
    }

    public void setHoliday(Holiday holiday) {
        this.holiday = holiday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
