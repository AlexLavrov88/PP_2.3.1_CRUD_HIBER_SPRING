package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;
import web.Dao.CarDao;
import web.Dao.CarDaoImpl;

import java.util.List;
@Component
public class CarServiceImpl implements CarService {
    CarDao carService = new CarDaoImpl();
    @Override
    public List<Car> getCarList() {
        return carService.getCarList();
    }

    @Override
    public List<Car> getCarById(int index) {
        return carService.getCarById(index);
    }
}
