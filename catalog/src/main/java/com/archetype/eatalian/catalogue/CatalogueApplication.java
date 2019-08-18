package com.archetype.eatalian.catalogue;

import com.archetype.eatalian.catalogue.domain.Category;
import com.archetype.eatalian.catalogue.domain.CurrencyAmount;
import com.archetype.eatalian.catalogue.domain.Product;
import com.archetype.eatalian.catalogue.repositories.CategoryRepository;
import com.archetype.eatalian.catalogue.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Currency;

@SpringBootApplication
public class CatalogueApplication {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;

    @Autowired
    public CatalogueApplication(CategoryRepository categoryRepository,
                                ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(CatalogueApplication.class, args);
    }

    @Bean
    ApplicationRunner setup() {
        return args -> {
            Category food = categoryRepository.save(new Category("Food", "Our delicious food"));

            Category sandwiches = categoryRepository.save(
                    new Category("Sandwiches", "Beware: trying our sandwiches could cause addiction!")
                            .linkParent(food));

            productRepository.save(
                    new Product("Lav", "Ham, bacon, eggs, tomato")
                            .setPrice(
                                    CurrencyAmount.of(200, Currency.getInstance("RSD")))
                            .linkCategory(sandwiches));

            productRepository.save(
                    new Product("Blok", "Smoked chicken, bacon, eggs, tomato")
                            .setPrice(
                                    CurrencyAmount.of(200, Currency.getInstance("RSD")))
                            .linkCategory(sandwiches));

            Category pizzas = categoryRepository.save(
                    new Category("Pizzas", "The piquant taste of our pizzas will take you straight to Italy")
                            .linkParent(food));

            productRepository.save(
                    new Product("Capriciosa", "Pelat, cheese, ham, mushrooms, origano")
                            .setPrice(
                                    CurrencyAmount.of(200, Currency.getInstance("RSD")))
                            .linkCategory(pizzas));



        };
    }

}
