package nl.inholland.AFirstApi.service;

import nl.inholland.AFirstApi.dao.BrandRepository;
import nl.inholland.AFirstApi.dao.CarRepository;
import nl.inholland.AFirstApi.model.Brand;
import nl.inholland.AFirstApi.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private BrandRepository brandRepository;

    public CarService() {
    }

    public List<Car> getAllCars() {

        return (List<Car>) carRepository.findAll();
    }

    public void addCar(Car car) {
        Brand brand = brandRepository.findBrandByName(car.getBrand().getBrandName());
        car.setBrand(brand);
        carRepository.save(car);
    }
}
