package nl.inholland.AFirstApi.configuration;

import nl.inholland.AFirstApi.Application;
import nl.inholland.AFirstApi.dao.BrandRepository;
import nl.inholland.AFirstApi.dao.CarRepository;
import nl.inholland.AFirstApi.model.Brand;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class MyApplicationRunner implements ApplicationRunner {

    private BrandRepository brandRepository;
    private CarRepository carRepository;

    public MyApplicationRunner(BrandRepository brandRepository, CarRepository carRepository) {
        this.brandRepository = brandRepository;
        this.carRepository = carRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Brand kia = new Brand("Kia");
        Brand hyundai = new Brand("Hyundai");
        brandRepository.save(kia);
        brandRepository.save(hyundai);


    }
}
