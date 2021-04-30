package nl.inholland.AFirstApi.controller;

import nl.inholland.AFirstApi.model.Car;
import nl.inholland.AFirstApi.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/cars")
@RestController
public class CarController {

    public CarController(CarService carService) {
        this.carService = carService;
    }

    private CarService carService;

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String test() {
        return "Hello@";
    }

    @GetMapping
    public List<Car> getAllCars2() {
        return carService.getAllCars();
    }

    @PostMapping
    public ResponseEntity addCar(@RequestBody Car car) {
        carService.addCar(car);
        return ResponseEntity.status(HttpStatus.CREATED).body(car.getId());
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllCars() {
        List<Car> cars = carService.getAllCars();
        return ResponseEntity.status(200).body(cars);
    }
}
