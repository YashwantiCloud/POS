package com.yc.pos.model;


import javax.persistence.*;

@Entity
@Table(name="ycpos_people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private int personId;

    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;

    @Column(name = "gender", columnDefinition = "TINYINT")
    private Integer gender;

    @Column(name = "phone_number", nullable = false, length = 255)
    private String phoneNumber;

    @Column(name = "email", nullable = false, length = 255)
    private String email;

    @Column(name = "address_1", nullable = false, length = 255)
    private String address1;

    @Column(name = "address_2", length = 255)
    private String address2;

    @Column(name = "city", nullable = false, length = 255)
    private String city;

    @Column(name = "state", nullable = false, length = 255)
    private String state;

    @Column(name = "zip", nullable = false, length = 255)
    private String zip;

    @Column(name = "country", nullable = false, length = 255)
    private String country;

    @Column(name = "comments", columnDefinition = "TEXT", nullable = false)
    private String comments;

    // Getters and Setters

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
