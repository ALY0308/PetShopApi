package persistence.crud;

import org.springframework.data.repository.CrudRepository;
import persistence.entity.Products_Bill;

import java.util.List;
import java.util.Optional;

public interface Products_BillCrudRepository extends CrudRepository<Products_Bill, Integer> {
    // Métodos de consulta personalizados

    // Obtener una lista de Products_Bill por ID de factura
    List<Products_Bill> findByBillId(Integer billId);

    // Obtener una lista de Products_Bill por ID de producto
    List<Products_Bill> findByProductId(Integer productId);

    @Override
    Optional<Products_Bill> findById(Integer id);
}
