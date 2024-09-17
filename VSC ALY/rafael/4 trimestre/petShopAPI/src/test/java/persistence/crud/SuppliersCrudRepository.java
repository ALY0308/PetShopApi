package persistence.crud;

import org.springframework.data.repository.CrudRepository;
import persistence.entity.Suppliers;

public interface SuppliersCrudRepository extends CrudRepository<Suppliers,Integer> {
}
