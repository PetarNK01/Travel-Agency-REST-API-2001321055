package fmi.plovdiv.trvaelagency.reservation.dto;

public class UpdateReservatonDTO {

    private long id;

    private long holiday;

    private String phoneNumber;

    private String contactName;

    public UpdateReservatonDTO(long id, long holiday, String phoneNumber, String contactName) {
        this.id = id;
        this.holiday = holiday;
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
    }

    public UpdateReservatonDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHoliday() {
        return holiday;
    }

    public void setHoliday(long holiday) {
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
