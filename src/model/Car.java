package model;

public class Car {
    private int id;

    private String brand;
    private String model;
    private String engine;
    private String production;
    private String bodyType;
    private int seats;
    private int doors;
    private int speed;
    private int rentAmount;

    public Car(String brand, String model, String engine, String production, String bodyType, int seats, int doors, int speed, int rentAmount) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.production = production;
        this.bodyType = bodyType;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.rentAmount = rentAmount;
    }

    public Car(int id, String brand, String model, String engine, String production, String bodyType, int seats, int doors, int speed, int rentAmount) {
        this.id=id;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.production = production;
        this.bodyType = bodyType;
        this.seats = seats;
        this.doors = doors;
        this.speed = speed;
        this.rentAmount = rentAmount;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRentAmount() {
        return rentAmount;
    }

    public void setRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }

    @Override
    public String toString() {
        return
                "Id= "+id+'\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", production='" + production + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", seats=" + seats +
                ", doors=" + doors +
                ", speed=" + speed +" km/h"+
                ", rentAmount=" + rentAmount +"AZN/day\n";

    }
}
