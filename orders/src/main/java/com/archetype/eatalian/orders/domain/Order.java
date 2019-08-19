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


// ----------- << imports@AAAAAAFspTnuKIYKpTM= >>
import com.archetype.eatalian.orders.resources.OrderResource;
import java.util.stream.Collectors;
// ----------- >>

@Entity
// ----------- << class.annotations@AAAAAAFspTnuKIYKpTM= >>
// ----------- >>
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // ----------- << id.annotations@AAAAAAFspTnuKIYKpTM= >>
    // ----------- >>
    private Long id;

    @Version
    // ----------- << version.annotations@AAAAAAFspTnuKIYKpTM= >>
    // ----------- >>
    private Long version;

    @NotNull
    @Column(nullable = false)
    // ----------- << attribute.annotations@AAAAAAFspToZgoY02OI= >>
    // ----------- >>
    private LocalDateTime dateOfCreation;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name="amount", column = @Column(name = "subTotal_amount")),
        @AttributeOverride(name="currency", column = @Column(name = "subTotal_currency"))
    })
    // ----------- << attribute.annotations@AAAAAAFspTpO34Y7gNU= >>
    // ----------- >>
    private CurrencyAmount subTotal;

    @OneToMany(mappedBy = "order")
    // ----------- << attribute.annotations@AAAAAAFspT0H4Icb46s= >>
    // ----------- >>
    private Set<ProductRequest> requests = new HashSet<>();

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name="streetAndNo", column = @Column(name = "billingAddress_streetAndNo")),
        @AttributeOverride(name="postalCode", column = @Column(name = "billingAddress_postalCode")),
        @AttributeOverride(name="city", column = @Column(name = "billingAddress_city"))
    })
    // ----------- << attribute.annotations@AAAAAAFspUeHY5kXctk= >>
    // ----------- >>
    private Address billingAddress;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name="streetAndNo", column = @Column(name = "shipmentAddress_streetAndNo")),
        @AttributeOverride(name="postalCode", column = @Column(name = "shipmentAddress_postalCode")),
        @AttributeOverride(name="city", column = @Column(name = "shipmentAddress_city"))
    })
    // ----------- << attribute.annotations@AAAAAAFspUePCpla9G0= >>
    // ----------- >>
    private Address shipmentAddress;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name="email", column = @Column(name = "account_email")),
        @AttributeOverride(name="firstName", column = @Column(name = "account_firstName")),
        @AttributeOverride(name="lastName", column = @Column(name = "account_lastName"))
    })
    // ----------- << attribute.annotations@AAAAAAFspUeVdJmsOWE= >>
    // ----------- >>
    private Account account;

    // ----------- << getId.annotations@AAAAAAFspTnuKIYKpTM= >>
    // ----------- >>
    public Long getId(){
        return id;
    }

    public LocalDateTime getDateOfCreation() {
        return dateOfCreation;
    }

    public CurrencyAmount getSubTotal() {
        return subTotal;
    }

    public Set<ProductRequest> getRequests() {
        return requests;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Address getShipmentAddress() {
        return shipmentAddress;
    }

    public Account getAccount() {
        return account;
    }

    public Order setDateOfCreation(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
        return this;
    }

    public Order setSubTotal(CurrencyAmount subTotal) {
        this.subTotal = subTotal;
        return this;
    }

    public Order setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public Order setShipmentAddress(Address shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
        return this;
    }

    public Order setAccount(Account account) {
        this.account = account;
        return this;
    }

    public Order linkRequests(ProductRequest _requests) {
        if (_requests != null) {
            _requests.unlinkOrder();
            _requests.setOrder(this);
            getRequests().add(_requests);
        }
        return this;
    }

    public Order linkBillingAddress(Address _billingAddress) {
        setBillingAddress(_billingAddress);
        return this;
    }

    public Order linkShipmentAddress(Address _shipmentAddress) {
        setShipmentAddress(_shipmentAddress);
        return this;
    }

    public Order linkAccount(Account _account) {
        setAccount(_account);
        return this;
    }

    public Order unlinkRequests(ProductRequest _requests) {
        if (_requests != null) {
            _requests.setOrder(null);
            getRequests().remove(_requests);
        }
        return this;
    }

    public Order unlinkRequests(ProductRequest _requests, Iterator<ProductRequest> it) {
        if (_requests != null) {
            _requests.setOrder(null);
            it.remove();
        }
        return this;
    }

    public Order unlinkBillingAddress() {
        setBillingAddress(null);
        return this;
    }

    public Order unlinkShipmentAddress() {
        setShipmentAddress(null);
        return this;
    }

    public Order unlinkAccount() {
        setAccount(null);
        return this;
    }

    // ----------- << equals.annotations@AAAAAAFspTnuKIYKpTM= >>
    // ----------- >>
    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) return true;
        if (getId() == null) return false;
        return obj instanceof Order && (getId().equals(((Order) obj).getId()));
    }

    // ----------- << hashCode.annotations@AAAAAAFspTnuKIYKpTM= >>
    // ----------- >>
    @Override
    public int hashCode() {
        return 194;
    }

// ----------- << class.extras@AAAAAAFspTnuKIYKpTM= >>
    public OrderResource toResource() {
        OrderResource resource = new OrderResource();
        resource.linkAccount(this.getAccount());
        resource.linkShippingAddress(this.getShipmentAddress());
        resource.linkBillingAddress(this.getBillingAddress());
        resource.getProductRequests()
                .addAll(getRequests()
                        .stream()
                        .map(ProductRequest::toResource)
                        .collect(Collectors.toList()));
        return resource;
    }

    public Order updateSubTotal(CurrencyAmount totalPrice) {
        if (this.subTotal != null) {
            this.subTotal =
                    CurrencyAmount.of(
                            subTotal.getAmount().add(totalPrice.getAmount()),
                            subTotal.getCurrency());
        } else {
            this.subTotal = totalPrice;
        }
        return this;
    }
// ----------- >>
}