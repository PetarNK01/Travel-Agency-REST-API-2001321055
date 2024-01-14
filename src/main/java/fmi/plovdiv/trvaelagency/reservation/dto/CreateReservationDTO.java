package fmi.plovdiv.trvaelagency.reservation.dto;

public class CreateReservationDTO {

    private long holiday;

    private String phoneNumber;

    private String contactName;

    public CreateReservationDTO(long holiday, String phoneNumber, String contactName) {
        this.holiday = holiday;
        this.phoneNumber = phoneNumber;
        this.contactName = contactName;
    }

    public CreateReservationDTO() {
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
