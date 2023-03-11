package service;

import model.Customer;

import java.util.List;

public interface CustomerService {
    void addCustomer();
    List<Customer> showCustomer();
}
