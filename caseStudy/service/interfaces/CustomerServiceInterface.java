package caseStudy.service.interfaces;

import caseStudy.model.Customer;

import java.util.Optional;

public interface CustomerServiceInterface {
    Customer findOrCreateCustomer(String name, String phone);

    Optional<Customer> getCustomerById(String id);
}
