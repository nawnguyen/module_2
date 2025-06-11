package caseStudy.service.interfaces;

import caseStudy.model.Customer;
import caseStudy.repository.CustomerRepository;

import java.util.Optional;
import java.util.UUID;

public class CustomerService implements CustomerServiceInterface {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findOrCreateCustomer(String name, String phone) {
        return customerRepository.findByPhone(phone).orElseGet(() -> {
            String customerId = "KH" + UUID.randomUUID().toString().substring(0, 4).toUpperCase();
            Customer newCustomer = new Customer(customerId, name, phone);
            return customerRepository.save(newCustomer);
        });
    }

    @Override
    public Optional<Customer> getCustomerById(String id) {
        return customerRepository.findById(id);
    }
}
