package persistence.crud;

import org.springframework.data.repository.CrudRepository;
import persistence.entity.Quotes;

public interface QuotesCrudRepository extends CrudRepository<Quotes,Integer> {
}
