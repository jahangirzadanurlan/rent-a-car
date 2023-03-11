package repository;

import model.Customer;

import java.util.List;

public interface RentCustomerRepository {
    boolean addCustomer(Customer customer);
    List<Customer> showCustomer();
}
