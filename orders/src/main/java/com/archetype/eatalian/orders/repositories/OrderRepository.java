/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/

package com.archetype.eatalian.orders.repositories;

import com.archetype.eatalian.orders.domain.Order;
import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}