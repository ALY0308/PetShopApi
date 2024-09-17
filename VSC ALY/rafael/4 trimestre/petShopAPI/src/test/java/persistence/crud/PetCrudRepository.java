package persistence.crud;

import org.springframework.data.repository.CrudRepository;
import persistence.entity.Pet;

import java.util.List;
import java.util.Optional;

public interface PetCrudRepository extends CrudRepository<Pet,Integer> {
   //querys methods
    //obtener una lista de mascotas por especie,ordenada por nombre
    List<Pet> findBySpeciesOrderByIdAsc(String species);

    @Override
    Optional<Pet> findById(Integer id);
}
