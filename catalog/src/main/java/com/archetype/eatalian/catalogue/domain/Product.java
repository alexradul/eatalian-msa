/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.eatalian.catalogue.domain;

import java.util.*;
import java.time.*;

import javax.persistence.*;
import javax.validation.constraints.*;


// ----------- << imports@AAAAAAFsmPLIWFilvSU= >>
// ----------- >>

@Entity
// ----------- << class.annotations@AAAAAAFsmPLIWFilvSU= >>
// ----------- >>
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // ----------- << id.annotations@AAAAAAFsmPLIWFilvSU= >>
    // ----------- >>
    private Long id;

    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFsmPM8/FjfXp4= >>
    // ----------- >>
    private String name;

    @Column
    // ----------- << attribute.annotations@AAAAAAFsmPNIqFjmN1U= >>
    // ----------- >>
    private String description;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "category_id")
    // ----------- << attribute.annotations@AAAAAAFsmPRXTVknsvQ= >>
    // ----------- >>
    private Category category;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name="amount", column = @Column(name = "price_amount")),
        @AttributeOverride(name="currency", column = @Column(name = "price_currency"))
    })
    // ----------- << attribute.annotations@AAAAAAFsmPcrgl0B0Vs= >>
    // ----------- >>
    private CurrencyAmount price;

    // ----------- << getId.annotations@AAAAAAFsmPLIWFilvSU= >>
    // ----------- >>
    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public CurrencyAmount getPrice() {
        return price;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public Product setCategory(Category category) {
        this.category = category;
        return this;
    }

    public Product setPrice(CurrencyAmount price) {
        this.price = price;
        return this;
    }

    public Product linkCategory(Category _category) {
        if (_category != null) {
            _category.getProducts().add(this);
        }

        unlinkCategory();
        setCategory(_category);
        return this;
    }

    public Product linkPrice(CurrencyAmount _price) {
        setPrice(_price);
        return this;
    }

    public Product unlinkCategory() {
        if (getCategory() != null) {
            getCategory().getProducts().remove(this);
            setCategory(null);
        }
        return this;
    }

    public Product unlinkPrice() {
        setPrice(null);
        return this;
    }

    // ----------- << equals.annotations@AAAAAAFsmPLIWFilvSU= >>
    // ----------- >>
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) return true;
        if (getId() == null) return false;
        return obj instanceof Product && (getId().equals(((Product) obj).getId()));
    }

    // ----------- << hashCode.annotations@AAAAAAFsmPLIWFilvSU= >>
    // ----------- >>
    @Override
    public int hashCode() {
        return 368;
    }

// ----------- << class.extras@AAAAAAFsmPLIWFilvSU= >>
// ----------- >>
}