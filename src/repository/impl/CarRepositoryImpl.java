package repository.impl;

import exception.NotFoundException;
import model.Car;
import queries.CarQuery;
import repository.RentCarRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import static repository.DbConnection.connect;

public class CarRepositoryImpl implements RentCarRepository {
    @Override
    public boolean addCar(Car car) {
        try(Connection connection=connect()) {
            PreparedStatement preparedStatement=connection.prepareStatement(CarQuery.ADD_CAR);

            preparedStatement.setString(1,car.getBrand());
            preparedStatement.setString(2,car.getModel());
            preparedStatement.setString(3,car.getEngine());
            preparedStatement.setString(4,car.getProduction());
            preparedStatement.setString(5,car.getBodyType());
            preparedStatement.setInt(6,car.getSeats());
            preparedStatement.setInt(7,car.getDoors());
            preparedStatement.setInt(8,car.getSpeed());
            preparedStatement.setInt(9,car.getRentAmount());

            int val=preparedStatement.executeUpdate();
            return val>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Car> showCar() {
        try(Connection connection=connect()) {
            PreparedStatement preparedStatement=connection.prepareStatement(CarQuery.SHOW_CAR);

            List<Car> cars=new LinkedList<>();
            ResultSet resultSet=preparedStatement.executeQuery();

            if (resultSet.wasNull()){
                throw new NotFoundException();
            }

            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String brand=resultSet.getString("brand");
                String model=resultSet.getString("model");
                String engine=resultSet.getString("engine");
                String production=resultSet.getString("production");
                String bodyType=resultSet.getString("bodyType");
                int seats=resultSet.getInt("seats");
                int doors=resultSet.getInt("doors");
                int speed=resultSet.getInt("speed");
                int rentAmount=resultSet.getInt("rentAmount");

                cars.add(new Car(id,brand,model,engine,production,bodyType,seats,doors,speed,rentAmount));
            }
            return cars;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
