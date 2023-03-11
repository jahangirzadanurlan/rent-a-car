package service.impl;

import model.Customer;
import repository.RentCustomerRepository;
import repository.impl.CustomerRepositoryImpl;
import service.CustomerService;
import util.InputUtil;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final RentCustomerRepository rentCustomerRepository;

    public CustomerServiceImpl() {
        rentCustomerRepository=new CustomerRepositoryImpl();
    }
    public Customer fillCustomer(){
        int carId= InputUtil.requiredInputInt("Enter the car id: ");
        String customerName= InputUtil.requiredInputString("Enter the name: ");
        String customerSurname= InputUtil.requiredInputString("Enter the surname: ");
        String  birthdate =InputUtil.requiredInputString("Enter the birthdate: ");
        String fin= InputUtil.requiredInputString("Enter the fin: ");
        String  serialNumber= InputUtil.requiredInputString("Enter the serial number(passport): ");

        return new Customer(carId,customerName,customerSurname,birthdate,fin,serialNumber);
    }

    @Override
    public void addCustomer() {
        rentCustomerRepository.addCustomer(fillCustomer());
    }

    @Override
    public List<Customer> showCustomer() {
        return rentCustomerRepository.showCustomer();
    }
}
