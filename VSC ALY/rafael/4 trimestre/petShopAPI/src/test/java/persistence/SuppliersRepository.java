package persistence;

import persistence.crud.SuppliersCrudRepository;
import persistence.entity.Suppliers;

import java.util.List;
import java.util.Optional;

public class SuppliersRepository {
    private SuppliersCrudRepository suppliersCrudRepository;

    public List<Suppliers> getAll(){
        return (List<Suppliers>) suppliersCrudRepository.findAll();
    }

    public Optional<Suppliers> getSuppliersById(int id) {
        return suppliersCrudRepository.findById(id);
    }

    public Suppliers save (Suppliers suppliers) {
        return suppliersCrudRepository.save(suppliers);
    }

    public void  delete(int id) {
        suppliersCrudRepository.deleteById(id);
    }

    public boolean existsSuppliers(int id) {
        return  suppliersCrudRepository.existsById(id);}

    public long countALL() { return suppliersCrudRepository.count();}
}
