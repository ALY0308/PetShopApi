package persistence;

import persistence.crud.Products_BillCrudRepository; // Asegúrate de que este paquete exista
import persistence.entity.Products_Bill;

import java.util.List;
import java.util.Optional;

public class Products_BillRepository {
    private Products_BillCrudRepository products_BillCrudRepository;

    public List<Products_Bill> getAll() {
        return (List<Products_Bill>) products_BillCrudRepository.findAll();
    }

    public Optional<Products_Bill> getProducts_BillById(int id) {
        return products_BillCrudRepository.findById(id);
    }

    public Products_Bill save(Products_Bill products_Bill) {
        return products_BillCrudRepository.save(products_Bill);
    }

    public void delete(int id) {
        products_BillCrudRepository.deleteById(id);
    }

    public boolean existsProducts_Bill(int id) {
        return products_BillCrudRepository.existsById(id);
    }

    public long countAll() {
        return products_BillCrudRepository.count();
    }
}
