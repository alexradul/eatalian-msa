package com.archetype.eatalian.orders.ports;


import com.archetype.eatalian.orders.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("catalogue-service")
public interface CatalogueService {
    @GetMapping("/products/{sku}")
    Product getProduct(@PathVariable("sku") String sku);
}
