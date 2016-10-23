package hu.unideb.biddelivery.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min=3, max=50)
    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Size(min=3, max=50)
    @Column(name = "lastname", nullable = false)
    private String lastName;

    @Size(min=3, max=50)
    @Column(name = "username", nullable = false)
    private String userName;

    @Size(min=3, max=100)
    @Column(name = "password", nullable = false)
    private String passWord;

    @Size(min=3, max=50)
    @Column(name = "email", nullable = false)
    private String email;

    @Size(min=12, max=100)
    @Column(name = "phonenumber", nullable = false)
    private String phoneNumber;

    @Size(min=3, max=50)
    @Column(name = "country", nullable = false)
    private String country;

    @Size(min=3, max=50)
    @Column(name = "county", nullable = false)
    private String county;

    @Size(min=3, max=50)
    @Column(name = "city", nullable = false)
    private String city;

    @Size(min=3, max=50)
    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "housenumber", nullable = false)
    private int houseNumber;

    public Customer() {
        super();
    }

    public Customer(int id, String firstName, String lastName, String userName, String passWord, String email,
                    String phoneNumber, String country, String county, String city, String street, int houseNumber) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.county = county;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
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

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }




    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
                + ", passWord=" + passWord + ", email=" + email + ", phoneNumber=" + phoneNumber + ", country="
                + country + ", county=" + county + ", city=" + city + ", street=" + street + ", houseNumber="
                + houseNumber + "]";
    }




}
