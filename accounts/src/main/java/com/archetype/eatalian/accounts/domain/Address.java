/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.eatalian.accounts.domain;

import java.util.*;
import java.time.*;

import javax.persistence.*;
import javax.validation.constraints.*;


// ----------- << imports@AAAAAAFsmOQwEwQ68bU= >>
// ----------- >>

@Embeddable
// ----------- << class.annotations@AAAAAAFsmOQwEwQ68bU= >>
// ----------- >>
public class Address {
    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFsmORKlgRkX7g= >>
    // ----------- >>
    private String streetAndNo;

    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFsmORkXgRrdDA= >>
    // ----------- >>
    private String city;

    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFsmOR/qwRyEvo= >>
    // ----------- >>
    private String postalCode;

    @Column
    // ----------- << attribute.annotations@AAAAAAFsmOSZnAR5bY4= >>
    // ----------- >>
    private String floor;

    public String getStreetAndNo() {
        return streetAndNo;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getFloor() {
        return floor;
    }

    public Address setStreetAndNo(String streetAndNo) {
        this.streetAndNo = streetAndNo;
        return this;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public Address setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public Address setFloor(String floor) {
        this.floor = floor;
        return this;
    }

// ----------- << class.extras@AAAAAAFsmOQwEwQ68bU= >>
// ----------- >>
}