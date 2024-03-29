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


// ----------- << imports@AAAAAAFsmPOcIFjtCyA= >>
import java.math.BigDecimal;
// ----------- >>

@Embeddable
// ----------- << class.annotations@AAAAAAFsmPOcIFjtCyA= >>
// ----------- >>
public class CurrencyAmount {
    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFsmPOwJVkXhWk= >>
    // ----------- >>
    private BigDecimal amount;

    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFsmPPfY1keWtc= >>
    // ----------- >>
    private Currency currency;

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public CurrencyAmount setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public CurrencyAmount setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

// ----------- << class.extras@AAAAAAFsmPOcIFjtCyA= >>

    public static CurrencyAmount of(int amount, Currency currency) {
        return of(BigDecimal.valueOf(amount), currency);
    }
    public static CurrencyAmount of(BigDecimal amount, Currency currency) {
        return new CurrencyAmount(amount, currency);
    }

    public CurrencyAmount(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public CurrencyAmount() {
    }

// ----------- >>
}