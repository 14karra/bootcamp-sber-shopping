package ru.sberbank.shopping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import ru.sberbank.shopping.api.CustomerApi;
import ru.sberbank.shopping.dto.Customer;

@RequiredArgsConstructor
@RestController
public class CustomerController implements CustomerApi {
    @Override
    public Customer getCustomerBySigmaLogin(String sigmaLogin) {
        return null;
    }

    @Override
    public void putCustomerInfo(String sigmaLogin, Customer customer) {

    }

    @Override
    public void deleteCustomer(String sigmaLogin) {

    }
}
