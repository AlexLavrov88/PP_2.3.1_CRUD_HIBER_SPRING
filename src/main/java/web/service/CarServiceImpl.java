package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService{
   private List<Car> carList;
    {
        carList = new ArrayList<>();
        carList.add(new Car("Ferrari", "Enco", "Red"));
        carList.add(new Car("Lada", "Sedan", "Bacladjan"));
        carList.add(new Car("Porshe", "911", "Yellow"));
        carList.add(new Car("Honda", "Accord", "Black"));
        carList.add(new Car("Audi", "A4", "Grey"));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getCarById(int index) {
        return carList.stream().limit(index).toList();
    }
}