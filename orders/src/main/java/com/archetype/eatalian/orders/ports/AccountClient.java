/*
* This code has been generated by the Rebel: a code generator for modern Java.
*
* Drop us a line or two at feedback@archetypesoftware.com: we would love to hear from you!
*/
package com.archetype.eatalian.orders.ports;

import com.archetype.eatalian.orders.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


// ----------- << imports@AAAAAAFsqFP6/BuY3u0= >>
// ----------- >>

// ----------- << class.annotations@AAAAAAFsqFP6/BuY3u0= >>
@Service
// ----------- >>
public class AccountClient implements AccountService {
    private final RestTemplate restTemplate;

    @Autowired
    public AccountClient(@LoadBalanced RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
    * @param accountRef
    */

    @Override
    // ----------- << method.annotations@AAAAAAFsqFOesRuNvNA= >>
    // ----------- >>
    public Account findAccount(String accountRef) {
    // ----------- << method.body@AAAAAAFsqFOesRuNvNA= >>
        return restTemplate.getForObject("http://account-service/accounts/{accountRef}", Account.class, accountRef);
    // ----------- >>
    }
// ----------- << class.extras@AAAAAAFsqFP6/BuY3u0= >>
// ----------- >>
}