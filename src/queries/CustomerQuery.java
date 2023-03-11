package queries;

public class CustomerQuery {
    public static final String addCustomer="INSERT INTO customer(carId,customerName,customerSurname,birthdate,fin,serialNumber) "+
            "VALUES(?,?,?,?,?,?)";
    public static final String showCustomer="SELECT * FROM customer";
}
