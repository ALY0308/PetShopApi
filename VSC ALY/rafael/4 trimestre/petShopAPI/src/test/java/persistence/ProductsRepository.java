package persistence;

import persistence.crud.ProductsCrudRepository;
import persistence.entity.Products;

import java.util.List;
import java.util.Optional;

public class ProductsRepository {
    private ProductsCrudRepository productsCrudRepository;

    public List<Products> getAll(){
        return (List<Products>) productsCrudRepository.findAll();
    }

    public Optional<Products> getProductsById(int id) {
        return  productsCrudRepository.findById(id);
    }

    public Products save (Products products) {
        return productsCrudRepository.save(products);
    }

    public void delete(int id) {
        productsCrudRepository.deleteById(id);
    }

    public boolean existsProducts(int id){
        return productsCrudRepository.existsById(id);
    }

    public long countALL(){
        return productsCrudRepository.count();
    }
}
