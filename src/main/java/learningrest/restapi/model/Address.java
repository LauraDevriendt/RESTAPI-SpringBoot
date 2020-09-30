package learningrest.restapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
class Address {

    @Column
    private String street;

   @Column
    private int streetNumber;

    @Column
    private String city;

   @Column
    private String zipcode;

    public Address() {

    }

    public Address(String street, int streetNumber, String city, String zipcode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}
