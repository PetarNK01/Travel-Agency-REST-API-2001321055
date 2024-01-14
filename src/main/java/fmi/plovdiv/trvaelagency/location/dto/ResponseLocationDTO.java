package fmi.plovdiv.trvaelagency.location.dto;

public class ResponseLocationDTO {

    private long id;

    private String number;

    private String country;

    private String imageUrl;

    private String street;

    private String city;

    public ResponseLocationDTO(long id, String number, String country, String imageUrl, String street, String city) {
        this.id = id;
        this.number = number;
        this.country = country;
        this.imageUrl = imageUrl;
        this.street = street;
        this.city = city;
    }

    public ResponseLocationDTO() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
