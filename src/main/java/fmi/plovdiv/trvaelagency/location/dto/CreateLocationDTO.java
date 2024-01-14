package fmi.plovdiv.trvaelagency.location.dto;

public class CreateLocationDTO {

    private String country;

    private String city;

    private String street;

    private String number;

    private String imageUrl;

    public CreateLocationDTO(String country, String city, String street, String number, String imageUrl) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.number = number;
        this.imageUrl = imageUrl;
    }

    public CreateLocationDTO() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
