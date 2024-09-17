package persistence.crud;

import org.springframework.data.repository.CrudRepository;
import persistence.entity.Owner;

public interface OwnerCrudRepository extends CrudRepository<Owner,Integer> {
}
