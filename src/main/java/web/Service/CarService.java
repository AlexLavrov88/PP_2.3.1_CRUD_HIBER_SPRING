package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCarList();

    List<Car> getCarById(int index);
}