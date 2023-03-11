package service.impl;

import model.Car;
import repository.RentCarRepository;
import repository.impl.CarRepositoryImpl;
import service.CarService;
import util.InputUtil;

import java.util.List;

public class CarServiceImpl implements CarService {
    private final RentCarRepository rentCarRepository;

    public CarServiceImpl() {
        rentCarRepository=new CarRepositoryImpl();
    }
    public Car fillCar(){
        String brand= InputUtil.requiredInputString("Enter the brand: ");
        String model= InputUtil.requiredInputString("Enter the model: ");
        String engine= InputUtil.requiredInputString("Enter the engine: ");
        String production= InputUtil.requiredInputString("Enter the production: ");
        String bodyType= InputUtil.requiredInputString("Enter the body type: ");
        int seats= InputUtil.requiredInputInt("Enter the seats: ");
        int doors= InputUtil.requiredInputInt("Enter the doors: ");
        int speed= InputUtil.requiredInputInt("Enter the speed: ");
        int rentAmount= InputUtil.requiredInputInt("Enter the rent amount: ");

        return new Car(brand,model,engine,production,bodyType,seats,doors,speed,rentAmount);
    }
    @Override
    public void addCar() {
        rentCarRepository.addCar(fillCar());
    }

    @Override
    public List<Car> showCar() {
        return rentCarRepository.showCar();

    }
}
