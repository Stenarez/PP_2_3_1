package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller

public class CarController {

    private final CarServiceImpl service;

    public CarController(CarServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        List<Car> list = service.getCars(count);
        model.addAttribute("cars", list);
        return "car";
    }
}
