package caseStudy.repository;


import caseStudy.model.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerRepository {
    private static final String FILE_PATH = "data/customers.dat";
    private List<Customer> customers;

    public CustomerRepository() {
        this.customers = FileUtil.readFromFile(FILE_PATH);
    }

    private void saveToFile() {
        FileUtil.writeToFile(FILE_PATH, customers);
    }

    public Customer save(Customer customer) {
        customers.removeIf(c -> c.getId().equals(customer.getId()));
        customers.add(customer);
        saveToFile();
        return customer;
    }

    public Optional<Customer> findById(String id) {
        return customers.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public Optional<Customer> findByPhone(String phone) {
        return customers.stream().filter(c -> c.getPhone().equals(phone)).findFirst();
    }
}
