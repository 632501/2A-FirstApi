package nl.inholland.AFirstApi.service;

import nl.inholland.AFirstApi.dao.BrandRepository;
import nl.inholland.AFirstApi.model.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    private BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> getAllBrands() {
        return (List<Brand>)brandRepository.findAll();
    }
}
