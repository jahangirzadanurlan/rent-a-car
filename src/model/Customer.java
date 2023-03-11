package model;

public class Customer {
    private int carId;
    private String customerName;
    private String customerSurname;
    private String  birthdate;
    private String fin;
    private String serialNumber;

    public Customer(int carId, String customerName, String customerSurname, String  birthdate, String fin, String serialNumber) {
        this.carId = carId;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
        this.birthdate = birthdate;
        this.fin = fin;
        this.serialNumber = serialNumber;
    }

    public int getCarId() {
        return carId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "\nCustomer Name= " + customerName +
                "\nCar id= " + carId +
                "\nCustomer Name= " + customerName +
                "\nCustomer Surname= " + customerSurname +
                "\nBirthdate= " + birthdate +
                "\nFin= " + fin +
                "\nSerial Number(passport)= " + serialNumber+"\n";
    }
}
