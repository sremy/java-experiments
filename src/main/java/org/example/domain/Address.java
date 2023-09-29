package org.example.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.example.CustomDepartmentsDeserializer;

import java.util.List;

public class Address {

    private String city;
    private String postalCode;
    private String street;
    private String streetNumber;
    @JsonDeserialize(using = CustomDepartmentsDeserializer.class)
    private List<String> departments;

    public Address() {
    }

    public Address(String city, String postalCode, String street, String streetNumber, List<String> departments) {
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.streetNumber = streetNumber;
        this.departments = departments;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public List<String> getDepartments() {
        return departments;
    }

    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", departments=" + departments +
                '}';
    }
}
