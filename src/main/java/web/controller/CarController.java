package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {


    private CarService carDao;

    public CarController(CarService carDao) {
        this.carDao = carDao;
    }

    @GetMapping("")
    public String getCarList(Model model) {

        model.addAttribute("car", carDao.getCarList());
        return "cars";

    }

    @GetMapping(value = "/{index}")
    public String getCarId(@PathVariable("index") int index, Model model) {
        model.addAttribute("car", carDao.getCarById(index));
        return "cars";

    }
}
