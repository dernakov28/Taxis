package taxis.repositories;

import org.springframework.data.repository.CrudRepository;
import taxis.models.Manager;

public interface ManagerRepository extends CrudRepository<Manager, Integer> {
}
