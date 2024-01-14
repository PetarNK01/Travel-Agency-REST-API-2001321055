package fmi.plovdiv.trvaelagency.location.dto;

public class UpdateLocationDTO {

    private long id;

    private String country;

    private String imageUrl;

    private String street;

    private String number;

    private String city;

    public UpdateLocationDTO(long id, String country, String imageUrl, String street, String number, String city) {
        this.id = id;
        this.country = country;
        this.imageUrl = imageUrl;
        this.street = street;
        this.number = number;
        this.city = city;
    }

    public UpdateLocationDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
