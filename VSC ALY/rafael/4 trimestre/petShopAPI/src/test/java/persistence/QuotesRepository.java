package persistence;

import persistence.crud.QuotesCrudRepository;
import persistence.entity.Quotes;

import java.util.List;
import java.util.Optional;

public class QuotesRepository {
    private QuotesCrudRepository quotesCrudRepository;

    public List<Quotes> gitAll(){
        return (List<Quotes>) quotesCrudRepository.findAll();
    }

    public Optional<Quotes> getQuotesById(int id) {
        return quotesCrudRepository.findById(id);
    }

    public Quotes save (Quotes quotes) {
        return quotesCrudRepository.save(quotes);
    }

    public void delete(int id) {
        quotesCrudRepository.deleteById(id);
    }

    public boolean existsQuotes(int id){return  quotesCrudRepository.existsById(id); }

    public long countALL(){ return quotesCrudRepository.count();}
}
