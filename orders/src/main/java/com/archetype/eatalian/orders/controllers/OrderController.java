/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/

package com.archetype.eatalian.orders.controllers;

import com.archetype.eatalian.orders.domain.Order;
import com.archetype.eatalian.orders.resources.OrderResource;
import com.archetype.eatalian.orders.services.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Transactional
@RestController
@RequestMapping("/orders")
public class OrderController {
    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    private final OrderService service;

    @Autowired
    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<Order> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public OrderResource findOne(@PathVariable("id") Long id) {
        return service.findOne(id).toResource();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderResource create(@RequestBody @Valid OrderResource resource) {
        return service
                .create(resource)
                .toResource();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}