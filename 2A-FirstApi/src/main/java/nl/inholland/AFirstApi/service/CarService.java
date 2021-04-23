package nl.inholland.AFirstApi.service;

import nl.inholland.AFirstApi.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = new ArrayList<Car>();

    public CarService() {
        cars.add(new Car(1, "Ferrari", "F40", 200000, 1998));
        cars.add(new Car(2, "Lamborghini", "Gallardo", 690000, 2000));
    }

    public List<Car> getAllCars() {
        return cars;
    }

    public Car addCar(Car car) {
        cars.add(car);
        return car;
    }
}
