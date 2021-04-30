package nl.inholland.AFirstApi.dao;

import nl.inholland.AFirstApi.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Long> {
    Brand findBrandByName(String brandName);
}
