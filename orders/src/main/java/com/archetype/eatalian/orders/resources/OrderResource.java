/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.eatalian.orders.resources;

import java.util.*;
import java.time.*;


import com.archetype.eatalian.orders.domain.Account;
import com.archetype.eatalian.orders.domain.Address;
// ----------- << imports@AAAAAAFsqCcX0QsMFbE= >>
// ----------- >>

/**
* A resource that represents an Order.
*/

// ----------- << class.annotations@AAAAAAFsqCcX0QsMFbE= >>
// ----------- >>
public class OrderResource {
    /**
    * Reference to the requestor Account.
    */

    // ----------- << attribute.annotations@AAAAAAFsqCduGQs3uKQ= >>
    // ----------- >>
    private String accountRef;

    // ----------- << attribute.annotations@AAAAAAFsqCnLVgyc6Po= >>
    // ----------- >>
    private Set<ProductRequestResource> productRequests = new HashSet<>();

    // ----------- << attribute.annotations@AAAAAAFsqC1buw+KD3E= >>
    // ----------- >>
    private Account account;

    // ----------- << attribute.annotations@AAAAAAFsqC1hhw/N8As= >>
    // ----------- >>
    private Address billingAddress;

    // ----------- << attribute.annotations@AAAAAAFsqC1oXRAfZss= >>
    // ----------- >>
    private Address shippingAddress;

    public String getAccountRef() {
        return accountRef;
    }

    public Set<ProductRequestResource> getProductRequests() {
        return productRequests;
    }

    public Account getAccount() {
        return account;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public OrderResource setAccountRef(String accountRef) {
        this.accountRef = accountRef;
        return this;
    }

    public OrderResource setAccount(Account account) {
        this.account = account;
        return this;
    }

    public OrderResource setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public OrderResource setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    public OrderResource linkProductRequests(ProductRequestResource _productRequests) {
        if (_productRequests != null) {
            getProductRequests().add(_productRequests);
        }
        return this;
    }

    public OrderResource linkAccount(Account _account) {
        setAccount(_account);
        return this;
    }

    public OrderResource linkBillingAddress(Address _billingAddress) {
        setBillingAddress(_billingAddress);
        return this;
    }

    public OrderResource linkShippingAddress(Address _shippingAddress) {
        setShippingAddress(_shippingAddress);
        return this;
    }

    public OrderResource unlinkProductRequests(ProductRequestResource _productRequests) {
        if (_productRequests != null) {
            getProductRequests().remove(_productRequests);
        }
        return this;
    }

    public OrderResource unlinkProductRequests(Iterator<ProductRequestResource> it) {
        it.remove();
        return this;
    }

    public OrderResource unlinkAccount() {
        setAccount(null);
        return this;
    }

    public OrderResource unlinkBillingAddress() {
        setBillingAddress(null);
        return this;
    }

    public OrderResource unlinkShippingAddress() {
        setShippingAddress(null);
        return this;
    }

// ----------- << class.extras@AAAAAAFsqCcX0QsMFbE= >>
// ----------- >>
}