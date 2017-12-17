package taxis.repositories;

import org.springframework.data.repository.CrudRepository;
import taxis.models.Driver;

import java.util.List;

public interface DriverRepository extends CrudRepository<Driver, Integer> {
    List<Driver> findByManagerId(int id);
}
