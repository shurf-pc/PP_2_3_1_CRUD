package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;
import web.Service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarServiceImp();

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count",defaultValue = "5") Integer count, Model model) {
        model.addAttribute("cars", carService.returnCars(count));
        return "cars";
    }
}
