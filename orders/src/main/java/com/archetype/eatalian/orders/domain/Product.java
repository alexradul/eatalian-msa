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


// ----------- << imports@AAAAAAFspTq5eoZBTqo= >>
// ----------- >>

@Embeddable
// ----------- << class.annotations@AAAAAAFspTq5eoZBTqo= >>
// ----------- >>
public class Product {
    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFspTvNUobQ7mc= >>
    // ----------- >>
    private String name;

    @Transient
    // ----------- << attribute.annotations@AAAAAAFspTvoE4bX1go= >>
    // ----------- >>
    private CurrencyAmount price;

    public String getName() {
        return name;
    }

    public CurrencyAmount getPrice() {
        return price;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setPrice(CurrencyAmount price) {
        this.price = price;
        return this;
    }

// ----------- << class.extras@AAAAAAFspTq5eoZBTqo= >>
// ----------- >>
}