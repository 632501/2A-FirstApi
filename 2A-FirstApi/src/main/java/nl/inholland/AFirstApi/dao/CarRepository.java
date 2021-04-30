package nl.inholland.AFirstApi.dao;

import nl.inholland.AFirstApi.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> getAllCars();
}
