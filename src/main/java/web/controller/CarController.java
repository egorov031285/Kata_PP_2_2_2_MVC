package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getAllCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.getCars(count));

        System.out.println(carService.getCars(count).toString());

        return "cars";
    }

}
