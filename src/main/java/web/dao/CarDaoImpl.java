package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    CarService carService = new CarServiceImpl();
    @Override
    public List<Car> getCarList() {
        return carService.getCarList();
    }

    @Override
    public List<Car> getCarById(int index) {
        return carService.getCarById(index);
    }
}
