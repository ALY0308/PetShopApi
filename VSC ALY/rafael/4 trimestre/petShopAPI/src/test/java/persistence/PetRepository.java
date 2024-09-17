package persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import persistence.crud.PetCrudRepository; // Asegúrate de que este paquete exista
import persistence.entity.Pet;

import java.util.List;
import java.util.Optional;

@Repository
public class PetRepository {

    @Autowired // Inyección de dependencias
    private PetCrudRepository petCrudRepository;

    public List<Pet> getAll() {
        return (List<Pet>) petCrudRepository.findAll();
    }

    public Optional<Pet> getPetById(int id) {
        return petCrudRepository.findById(id);
    }

    public Pet save(Pet pet) {
        return petCrudRepository.save(pet);
    }

    public void delete(int id) {
        petCrudRepository.deleteById(id);
    }

    public boolean existsPet(int id) {
        return petCrudRepository.existsById(id);
    }

    public long countAll() {
        return petCrudRepository.count();
    }
}


