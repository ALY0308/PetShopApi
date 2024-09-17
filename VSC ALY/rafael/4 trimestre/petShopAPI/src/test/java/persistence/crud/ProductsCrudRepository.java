package persistence.crud;

import org.springframework.data.repository.CrudRepository;
import persistence.entity.Products;

public interface ProductsCrudRepository extends CrudRepository<Products,Integer> {
}
