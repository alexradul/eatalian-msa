/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.eatalian.orders.domain;

import java.util.*;
import java.time.*;

import javax.persistence.*;
import javax.validation.constraints.*;


// ----------- << imports@AAAAAAFspTrihoZrzuo= >>
// ----------- >>

@Embeddable
// ----------- << class.annotations@AAAAAAFspTrihoZrzuo= >>
// ----------- >>
public class Account {
    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFspT8AP4jpt+g= >>
    // ----------- >>
    private String email;

    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFspT7O94h1EME= >>
    // ----------- >>
    private String firstName;

    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFspT7jxIim77k= >>
    // ----------- >>
    private String lastName;

    @Transient
    // ----------- << attribute.annotations@AAAAAAFspUBqlIrOiWU= >>
    // ----------- >>
    private Address shipmentAddress;

    @Transient
    // ----------- << attribute.annotations@AAAAAAFspUBwZYsvXks= >>
    // ----------- >>
    private Address billingAddress;

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getShipmentAddress() {
        return shipmentAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Account setEmail(String email) {
        this.email = email;
        return this;
    }

    public Account setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Account setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Account setShipmentAddress(Address shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
        return this;
    }

    public Account setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public Account linkShipmentAddress(Address _shipmentAddress) {
        setShipmentAddress(_shipmentAddress);
        return this;
    }

    public Account linkBillingAddress(Address _billingAddress) {
        setBillingAddress(_billingAddress);
        return this;
    }

    public Account unlinkShipmentAddress() {
        setShipmentAddress(null);
        return this;
    }

    public Account unlinkBillingAddress() {
        setBillingAddress(null);
        return this;
    }

// ----------- << class.extras@AAAAAAFspTrihoZrzuo= >>
// ----------- >>
}