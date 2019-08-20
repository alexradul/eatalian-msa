package com.archetype.eatalian.accounts;

import com.archetype.eatalian.accounts.domain.Account;
import com.archetype.eatalian.accounts.domain.Address;
import com.archetype.eatalian.accounts.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountsApplication {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountsApplication(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public static void main(String[] args) {
        SpringApplication.run(AccountsApplication.class, args);
    }

    @Bean
    ApplicationRunner setup() {
        return args -> {
            accountRepository.save(
                    new Account("joana.r@gmail.com", "Joana", "Radulovich")
                            .setPassword("password")
                            .linkBillingAddress(new Address("Miše Mićkovića 10", "Zvečan", "38227"))
                            .linkShipmentAddress(new Address("Gandijeva 76", "Beograd", "11000")));

            accountRepository.save(
                    new Account("mina.r@gmail.com", "Mina", "Rooney")
                            .setPassword("password")
                            .linkBillingAddress(new Address("Kneza Milosa 26", "Mitrovica", "38220"))
                            .linkShipmentAddress(new Address("Kneza Milosa 26", "Mitrovica", "38220")));
        };
    }

}
