package models.users;

import models.users.*;
import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Address extends Model {

    @Id
    private Long id;
    @Constraints.Required
    private String number;
    @Constraints.Required
    private String street;
    @Constraints.Required
    private String city;
    @Constraints.Required
    private String postCode;



    public Address(){

    }

    public Address(Long id, String number, String street, String city, String postCode){
        this.id = id;
        this.number = number;
        this.street = street;
        this.city = city;
        this.postCode = postCode;
    }

    // Accessor methods
    public Long getId() {
            return id;
    }
    
    public void setId(Long id) {
            this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

}