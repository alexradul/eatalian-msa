/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.eatalian.orders.resources;

import java.util.*;
import java.time.*;


import com.archetype.eatalian.orders.domain.CurrencyAmount;
// ----------- << imports@AAAAAAFsqCkU4Qxbzi0= >>
// ----------- >>

/**
* Describes a request for a particular Product, including quantity and an optional comment.
*/

// ----------- << class.annotations@AAAAAAFsqCkU4Qxbzi0= >>
// ----------- >>
public class ProductRequestResource {
    // ----------- << attribute.annotations@AAAAAAFsqCk9GgyFMT0= >>
    // ----------- >>
    private String sku;

    // ----------- << attribute.annotations@AAAAAAFsqClPiQyMxi4= >>
    // ----------- >>
    private int quantity;

    // ----------- << attribute.annotations@AAAAAAFsqCliHwyTI/c= >>
    // ----------- >>
    private String comment;

    // ----------- << attribute.annotations@AAAAAAFsqC3t2RJFcpI= >>
    // ----------- >>
    private CurrencyAmount pricePerUnit;

    // ----------- << attribute.annotations@AAAAAAFsqC4rfhKgmFc= >>
    // ----------- >>
    private CurrencyAmount subTotal;

    public String getSku() {
        return sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getComment() {
        return comment;
    }

    public CurrencyAmount getPricePerUnit() {
        return pricePerUnit;
    }

    public CurrencyAmount getSubTotal() {
        return subTotal;
    }

    public ProductRequestResource setSku(String sku) {
        this.sku = sku;
        return this;
    }

    public ProductRequestResource setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public ProductRequestResource setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public ProductRequestResource setPricePerUnit(CurrencyAmount pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
        return this;
    }

    public ProductRequestResource setSubTotal(CurrencyAmount subTotal) {
        this.subTotal = subTotal;
        return this;
    }

// ----------- << class.extras@AAAAAAFsqCkU4Qxbzi0= >>
// ----------- >>
}