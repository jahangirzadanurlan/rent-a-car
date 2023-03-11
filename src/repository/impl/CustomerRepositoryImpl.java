package repository.impl;

import exception.NotFoundException;
import model.Customer;
import queries.CustomerQuery;
import repository.RentCustomerRepository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import static repository.DbConnection.connect;

public class CustomerRepositoryImpl implements RentCustomerRepository {

    @Override
    public boolean addCustomer(Customer customer) {
        try(Connection connection=connect()) {
            PreparedStatement preparedStatement=connection.prepareStatement(CustomerQuery.addCustomer);

            preparedStatement.setInt(1,customer.getCarId());
            preparedStatement.setString(2,customer.getCustomerName());
            preparedStatement.setString(3,customer.getCustomerSurname());
            preparedStatement.setString(4,customer.getBirthdate());
            preparedStatement.setString(5,customer.getFin());
            preparedStatement.setString(6,customer.getSerialNumber());

            int val=preparedStatement.executeUpdate();
            return val>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Customer> showCustomer() {
        try(Connection connection=connect()) {
            PreparedStatement preparedStatement=connection.prepareStatement(CustomerQuery.showCustomer);
            List<Customer> customers=new LinkedList<>();
            ResultSet resultSet=preparedStatement.executeQuery();

            if (resultSet.wasNull()){
                throw new NotFoundException();
            }

            while (resultSet.next()){
                int carId=resultSet.getInt("carId");
                String customerName=resultSet.getString("customerName");
                String customerSurname=resultSet.getString("customerSurname");
                String birthdate =resultSet.getString("birthdate");
                String fin=resultSet.getString("fin");
                String serialNumber=resultSet.getString("serialNumber");

                customers.add(new Customer(carId,customerName,customerSurname,birthdate,fin,serialNumber));
            }
            return customers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
