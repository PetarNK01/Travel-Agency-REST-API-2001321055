package fmi.plovdiv.trvaelagency.reservation.dto;

import fmi.plovdiv.trvaelagency.holiday.dto.ResponseHolidayDTO;

public class ResponseReservationDTO {

    private long id;

    private ResponseHolidayDTO holiday;

    private String phoneNumber;

    private String contactName;

    public ResponseReservationDTO(long id, ResponseHolidayDTO holiday, String phoneNumber, String contactName) {
        this.id = id;
        this.holiday = holiday;
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
    }

    public ResponseReservationDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ResponseHolidayDTO getHoliday() {
        return holiday;
    }

    public void setHoliday(ResponseHolidayDTO holiday) {
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
