package repository;

import model.Car;

import java.util.List;

public interface RentCarRepository {
    boolean addCar(Car car);
    List<Car> showCar();

}
