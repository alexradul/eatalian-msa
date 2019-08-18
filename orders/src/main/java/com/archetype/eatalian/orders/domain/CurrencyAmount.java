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


// ----------- << imports@AAAAAAFspTwZcYbd47Q= >>
import java.math.BigDecimal;
// ----------- >>

@Embeddable
// ----------- << class.annotations@AAAAAAFspTwZcYbd47Q= >>
// ----------- >>
public class CurrencyAmount {
    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFspTwqrIcHfbw= >>
    // ----------- >>
    private BigDecimal amount;

    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFspTxH0ocODHE= >>
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

// ----------- << class.extras@AAAAAAFspTwZcYbd47Q= >>
// ----------- >>
}