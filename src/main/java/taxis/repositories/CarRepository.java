package taxis.repositories;

import org.springframework.data.repository.CrudRepository;
import taxis.models.Car;

public interface CarRepository extends CrudRepository<Car, Integer>{
}
