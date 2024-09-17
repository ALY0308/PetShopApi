package persistence.crud;

import org.springframework.data.repository.CrudRepository;
import persistence.entity.Bill;

public interface BillCrudRepositoy extends CrudRepository<Bill,Integer> {
}
